package com.servlet.checknote_final;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bean.checknote_final.Classe;
import com.bean.checknote_final.Note;
import com.bean.checknote_final.Ue;
import com.bean.checknote_final.User;
import com.dao.checknote_final.CheckDAOImpl;
import com.dao.checknote_final.DaoFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class CheckServlet
 */
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private CheckDAOImpl checkService = new CheckDAOImpl(DaoFactory.getInstance());
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

			Classe classe = new Classe();
			classe.setId(0);

	      ObjectMapper mapper = new ObjectMapper();
	      //Converting the Object to JSONString
	      String jsonString = mapper.writeValueAsString(classe);
		
		this.getServletContext().getRequestDispatcher("/student.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = (String) request.getParameter("action") ;

		
		if(action.equals("ue")) {
			String matricule = (String) request.getParameter("matricule") ;
			User current_user = checkService.getUser(matricule);

			List<Ue> ues = checkService.listUe(current_user);

			ObjectMapper mapper = new ObjectMapper();
			//Converting the Object to JSONString
			String jsonString = mapper.writeValueAsString(ues);

			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(jsonString);

		}else if(action.equals("get")) {

			String matricule = (String) request.getParameter("matricule") ;
			String exam = (String) request.getParameter("type") ;
			int ue_id = Integer.parseInt(request.getParameter("ue"));
			
			User user = checkService.getUser(matricule);
			Ue ue = checkService.getUe(ue_id);
			
			Note note = checkService.getNote(user, ue, exam);

			 
		    Map map=new <String, String>HashMap();  
		    //Adding elements to map  
			if(note != null) {
			    map.put("message","Un SMS a été envoyé à l'étudiant "+user.getMatricule()+" contenant sa note de "+note.getExamen()+" pour l'ue "+ue.getCode()+" - "+ue.getIntitule());
			    
			    String msg = "Bonjour M. "+user.getFirst_name()+" "+user.getLast_name()+"\n, Vous avez obtenu la note de "+note.getValue()+"/20 lors pour l'examen "+note.getExamen()+ " de l'ue "+ue.getCode()+" - "+ue.getIntitule();
			    SendSMS.sendSms("+237"+user.getPhone_number(), msg);
			}else {
			    map.put("message","Cette note n'est pas encore disponible"); 
				
			}

			ObjectMapper mapper = new ObjectMapper();
			//Converting the Object to JSONString
			String jsonString = mapper.writeValueAsString(map);

			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(jsonString);
			
			
		}else {
			doGet(request, response);
		}
		
	}

}
