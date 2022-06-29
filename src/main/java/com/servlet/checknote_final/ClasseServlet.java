package com.servlet.checknote_final;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.*;
import java.util.List;

import com.bean.checknote_final.Classe;
import com.bean.checknote_final.Etudiant;
import com.dao.checknote_final.DaoFactory;
import com.dao.checknote_final.EtudiantDao;
import com.dao.checknote_final.classeDAO.ClasseDAO;
import com.dao.checknote_final.classeDAO.ClasseDAOImpl;

/**
 * Servlet implementation class ClasseServlet
 */
public class ClasseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClasseDAO classeDAO;
	private List<Classe> classes;

	private ClasseDAOImpl classeService = new ClasseDAOImpl(DaoFactory.getInstance());   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClasseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

			this.classes = classeService.list();
			 request.setAttribute("classes", this.classes);
			this.getServletContext().getRequestDispatcher("/level_dept.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("level")+ "=====================>");
		
		Classe classe = new Classe();
		classe.setCycle(request.getParameter("cycle"));
		classe.setLevel(request.getParameter("level"));
		classe.setDepartement(request.getParameter("departement"));
		
//		SendSMS.sendSms("+237699187769", "Salut delano");
//		SendSMS.sendSms("+237676198745", "Salut delano");
		
		Classe res = classeService.add(classe);

	    String json = "{'level': "+ res.getLevel() +", 'cycle': "+ res.getCycle() +", 'departement': "+ res.getDepartement() +", 'id': "+res.getId()+"}";
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	}

}


