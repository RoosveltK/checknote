package com.servlet.checknote_final;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.bean.checknote_final.Classe;
import com.bean.checknote_final.Ue;
import com.dao.checknote_final.ClasseDAO;
import com.dao.checknote_final.ClasseDAOImpl;
import com.dao.checknote_final.DaoFactory;
import com.dao.checknote_final.UeDao;

/**
 * Servlet implementation class UeServlet
 */
public class UeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UeDao ueDao;
	private List<Ue> data_student;

	private ClasseDAO classeDAO;
	private List<Classe> classes;

	private ClasseDAOImpl classeService = new ClasseDAOImpl(DaoFactory.getInstance());

	public void init() throws ServletException {
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.ueDao = daoFactory.getUeDao();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("page");

		if (page != null) {
			if (page.equals("list")) {
				this.data_student = ueDao.list();
				request.setAttribute("ues", this.data_student);
				this.getServletContext().getRequestDispatcher("/ue-list.jsp").forward(request, response);
			}
			if (page.equals("add")) {
				this.classes = classeService.list();
				request.setAttribute("classes", this.classes);
				this.getServletContext().getRequestDispatcher("/ue-add.jsp").forward(request, response);

			}

		} else {
			this.data_student = ueDao.list();
			request.setAttribute("ues", this.data_student);
			this.getServletContext().getRequestDispatcher("/ue-list.jsp").forward(request, response);
		}

		// TODO Auto-generated method stubthis.data_student = ueDao.list();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String code = request.getParameter("code");
		String intutile = request.getParameter("intutile");
		String id_classe = request.getParameter("classe");
	
		 try{
	            int classe_id = Integer.parseInt(id_classe);
	            
	            Ue ue = new Ue();
	    		ue.setClasse_id(classe_id);
	    		ue.setCode(code);
	    		ue.setIntitule(intutile);
	    		ueDao.add(ue);
	    		response.setStatus(HttpServletResponse.SC_CREATED);
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	            System.out.println("Erreur de conversion");
	            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	        }
	
	}
}
