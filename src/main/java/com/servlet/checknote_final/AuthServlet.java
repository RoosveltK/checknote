package com.servlet.checknote_final;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bean.checknote_final.Auth;
import com.bean.checknote_final.Classe;
import com.bean.checknote_final.Etudiant;
import com.bean.checknote_final.User;
import com.dao.checknote_final.AuthDao;
import com.dao.checknote_final.ClasseDAO;
import com.dao.checknote_final.ClasseDAOImpl;
import com.dao.checknote_final.DaoFactory;
import com.dao.checknote_final.EtudiantDao;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private AuthDao authDao;
	private User user;
	private User auth_user;
	
	public void init() throws ServletException {
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.authDao = daoFactory.getAuthDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/etudiant-list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Auth auth = new Auth();
		auth.setPassword(password);
		auth.setUsername(username);

		try {

			this.auth_user = authDao.singin(auth);
			if (this.auth_user != null) {
				if(auth.getPassword().equals("admin12345"))
					doGet(request,response);
				
			} 

		} catch (NumberFormatException ex) {
			ex.printStackTrace();
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}

	}

}
