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
import com.bean.checknote_final.Ue;
import com.bean.checknote_final.User;

public class NoteDaoImpl implements NoteDao {

	private DaoFactory daoFactory;
	private static final String SQL_INSERT_NOTE = "INSERT INTO note (ue, user, value,exam) VALUES (?,?,?,?);";
	private static final String SQL_SELECT_ALL_ETUDIANT = "SELECT last_name,first_name, matricule, code,value,exam, phone_number ,intitule,ue.classe from ue, users, note where note.ue = ue.id and note.user = users.id;";

	private static String SQL_FIND_ETUDIANT = "SELECT id,first_name, last_name, phone_number, matricule from users WHERE matricule = ?";

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
		String nom, prenom, matricule, telephone;
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
			System.out.println("ERREUUR");
		}

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
				
				User etudiant = new Etudiant(resultat.getString("first_name"), resultat.getString("last_name"), resultat.getString("matricule"), resultat.getString("phone_number"));
				Ue ue = new Ue();
				ue.setClasse_id(resultat.getInt("ue.classe"));
				ue.setCode(resultat.getString("code"));
				ue.setIntitule(resultat.getString("intitule"));
				
				Note note = new Note();
				note.setUser(etudiant);
				note.setUe(ue);
				note.setValue(resultat.getDouble("value"));
				note.setExamen(resultat.getString("exam"));
				
				
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
