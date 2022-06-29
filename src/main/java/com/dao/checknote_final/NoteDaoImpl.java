package com.dao.checknote_final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.checknote_final.Note;

public class NoteDaoImpl implements NoteDao {

	private DaoFactory daoFactory;
	private static final String SQL_INSERT_ETUDIANT = "INSERT INTO users (first_name, last_name, phone_number, matricule,type,classe,password) VALUES ( ?,?,?,?,?,?,?);";
	private static final String SQL_SELECT_ALL_ETUDIANT = "SELECT * from users  WHERE type = 'STUDENT'";

	private static String SQL_FIND_ETUDIANT ="SELECT id from users WHERE matricule = ?";
	NoteDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void add(Note note) {
		System.out.print("je me lance");
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		
		Statement statement = null;
		ResultSet resultat = null;

		try {
			connexion = daoFactory.getConnection();
			preparedStatement = connexion.prepareStatement(SQL_FIND_ETUDIANT);
			preparedStatement.setString(1, note.getEtudiant_matricule());
			
			resultat = preparedStatement.executeQuery();

			while (resultat.next()) {
				int id = resultat.getInt("id");

				System.out.println(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		try {
//			connexion = daoFactory.getConnection();
//			preparedStatement = connexion.prepareStatement(SQL_INSERT_ETUDIANT);
//			preparedStatement.setString(1, note.getFirst_name());
//			preparedStatement.setString(2, note.getLast_name());
//			preparedStatement.setString(3, note.getPhone_number());
//			preparedStatement.setString(4, note.getMatricule());
//			preparedStatement.setString(5, note.getType());
//			preparedStatement.setInt(6, note.getClasse_id());
//			preparedStatement.setString(7, note.getPassword());
//		
//			preparedStatement.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

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
