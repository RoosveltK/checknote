package com.servlet.checknote_final;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.bean.checknote_final.*;
import com.dao.checknote_final.*;

/**
 * Servlet implementation class EtudiantServlet
 */
public class EtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EtudiantDao etudiantDao;
	private List<Etudiant> data_student;
	HttpSession session;

	private ClasseDAO classeDAO;
	private List<Classe> classes;

	private ClasseDAOImpl classeService = new ClasseDAOImpl(DaoFactory.getInstance());

	public void init() throws ServletException {
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.etudiantDao = daoFactory.getEtudiantDao();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EtudiantServlet() {
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
				this.data_student = etudiantDao.list();
				request.setAttribute("etudiants", this.data_student);
				this.getServletContext().getRequestDispatcher("/etudiant-list.jsp").forward(request, response);
			}
			if (page.equals("add")) {
				this.classes = classeService.list();
				request.setAttribute("classes", this.classes);
				this.getServletContext().getRequestDispatcher("/etudiant-add.jsp").forward(request, response);

			}

		} else {
			this.data_student = etudiantDao.list();
			request.setAttribute("etudiants", this.data_student);
			this.getServletContext().getRequestDispatcher("/etudiant-list.jsp").forward(request, response);
		}

		// TODO Auto-generated method stubthis.data_student = etudiantDao.list();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String matricule = request.getParameter("matricule");
		String telephone = request.getParameter("telephone");
		String classe = request.getParameter("classe");
	
		 try{
	            int classe_id = Integer.parseInt(classe);
	            
	            Etudiant etudiant = new Etudiant(nom, prenom, matricule, telephone);
	    		etudiant.setClasse_id(classe_id);
	    		etudiantDao.add(etudiant);
	    		response.setStatus(HttpServletResponse.SC_CREATED);
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	        }
	
	}
}
