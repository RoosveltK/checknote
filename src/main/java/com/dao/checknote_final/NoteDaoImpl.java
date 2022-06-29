package com.dao.checknote_final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.checknote_final.Etudiant;
import com.bean.checknote_final.Note;

public class NoteDaoImpl implements NoteDao {

	private DaoFactory daoFactory;
	private static final String SQL_INSERT_NOTE = "INSERT INTO note (ue, user, value,exam) VALUES (?,?,?,?);";
	private static final String SQL_SELECT_ALL_ETUDIANT = "SELECT * from users  WHERE type = 'STUDENT'";

	private static String SQL_FIND_ETUDIANT ="SELECT id,first_name, last_name, phone_number, matricule from users WHERE matricule = ?";
	NoteDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void add(Note note) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		
		Statement statement = null;
		ResultSet resultat = null;
		int id = -1;
		String nom,prenom, matricule,telephone;
		Etudiant etudiant;

		try {
			connexion = daoFactory.getConnection();
			preparedStatement = connexion.prepareStatement(SQL_FIND_ETUDIANT);
			preparedStatement.setString(1, note.getEtudiant_matricule());
			
			resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				 id = resultat.getInt("id");
				 nom = resultat.getString("first_name");
				 prenom = resultat.getString("last_name");
				 telephone = resultat.getString("phone_number");
				 matricule = resultat.getString("matricule");
				 etudiant = new Etudiant(nom, prenom, matricule, telephone);
				 etudiant.setId(id);
				 
				preparedStatement = connexion.prepareStatement(SQL_INSERT_NOTE);
				preparedStatement.setInt(1, note.getUe_id());
				preparedStatement.setInt(2, id);
				preparedStatement.setDouble(3, note.getValue());
				preparedStatement.setString(4, note.getExamen());
				
				preparedStatement.executeUpdate();
				 
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ERREUUR");		}



	}

	@Override
	public List<Note> list() {
		List<Note> notes = new ArrayList<Note>();
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;

		try {
			connexion = daoFactory.getConnection();
			statement = connexion.createStatement();
			resultat = statement.executeQuery(SQL_SELECT_ALL_ETUDIANT);

			while (resultat.next()) {
				String nom = resultat.getString("first_name");
				String prenom = resultat.getString("last_name");
				String matricule = resultat.getString("matricule");
				String telephone = resultat.getString("phone_number");
				int id = resultat.getInt("id");

				Note note = new Note();
				note.setId(id);
				notes.add(note);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return notes;
	}

	@Override
	public void edit(Note note) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id_note) {
		// TODO Auto-generated method stub

	}

}
