package com.servlet.checknote_final;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubthis.data_student = etudiantDao.list();
		this.data_student = etudiantDao.list();
		
		 request.setAttribute("etudiants", this.data_student);
		 this.getServletContext().getRequestDispatcher("/etudiant-list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
