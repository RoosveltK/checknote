
package com.dao.checknote_final;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.checknote_final.*;

public class EtudiantDaoImpl implements EtudiantDao {
	private DaoFactory daoFactory;
	private static final String SQL_INSERT_ETUDIANT = "INSERT INTO users (first_name, last_name, phone_number, matricule,type,classe,password) VALUES ( ?,?,?,?,?,?,?);";
	private static final String SQL_SELECT_ALL_ETUDIANT = "SELECT * from users  WHERE type = 'STUDENT'";

	EtudiantDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void add(Etudiant etudiant) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;

		try {
			connexion = daoFactory.getConnection();
			preparedStatement = connexion.prepareStatement(SQL_INSERT_ETUDIANT);
			preparedStatement.setString(1, etudiant.getFirst_name());
			preparedStatement.setString(2, etudiant.getLast_name());
			preparedStatement.setString(3, etudiant.getPhone_number());
			preparedStatement.setString(4, etudiant.getMatricule());
			preparedStatement.setString(5, etudiant.getType());
			preparedStatement.setInt(6, etudiant.getClasse_id());
			preparedStatement.setString(7, etudiant.getPassword());
		
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Etudiant> list() {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
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

				Etudiant etudiant = new Etudiant(nom, prenom, telephone, matricule);
				etudiant.setId(id);
				etudiants.add(etudiant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return etudiants;
	}

	@Override
	public void edit(Etudiant etudiant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id_etudiant) {
		// TODO Auto-generated method stub

	}

}
