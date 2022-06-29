package com.servlet.checknote_final;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.bean.checknote_final.Ue;
import com.bean.checknote_final.Note;
import com.dao.checknote_final.DaoFactory;
import com.dao.checknote_final.NoteDao;
import com.dao.checknote_final.UeDao;
import com.dao.checknote_final.UeDaoImpl;

/**
 * Servlet implementation class NoteServlet
 */
public class NoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private NoteDao noteDao;
	private List<Note> data_student;

	private UeDao ueDao;
	private List<Ue> ues;

	public void init() throws ServletException {
		DaoFactory daoFactory = DaoFactory.getInstance();
		this.noteDao = daoFactory.getNoteDao();
		this.ueDao = daoFactory.getUeDao();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NoteServlet() {
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
				this.data_student = noteDao.list();
				request.setAttribute("etudiants", this.data_student);
				this.getServletContext().getRequestDispatcher("/note-list.jsp").forward(request, response);
			}
			if (page.equals("add")) {
				this.ues = ueDao.list();
				request.setAttribute("ues", this.ues);
				this.getServletContext().getRequestDispatcher("/note-add.jsp").forward(request, response);

			}

		} else {
			this.data_student = noteDao.list();
			request.setAttribute("etudiants", this.data_student);
			this.getServletContext().getRequestDispatcher("/note-list.jsp").forward(request, response);
		}

		// TODO Auto-generated method stubthis.data_student = noteDao.list();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String matricule = request.getParameter("matricule");
		String value = request.getParameter("note");
		String ue = request.getParameter("ue");
	
		 try{
	            int ue_id = Integer.parseInt(ue);
	            Double note_val = Double.parseDouble(value);
	            
	            Note note = new Note();
	    		note.setUe_id(ue_id);
	    		note.setEtudiant_matricule(matricule);
	    		note.setValue(note_val);
	    		noteDao.add(note);
	    		response.setStatus(HttpServletResponse.SC_CREATED);
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	            System.out.println("Erreur de conversion");
	            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	        }
	
	}
}
