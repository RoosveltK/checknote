

package com.dao.checknote_final;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.checknote_final.*;



public class EtudiantDaoImpl implements EtudiantDao {
	private DaoFactory daoFactory;

	private static final String SQL_INSERT_PROFIL = "INSERT INTO PROFIL (first_name, last_name) VALUES (?, ?);";
	private static final String SQL_INSERT_ETUDIANT = "INSERT INTO STUDENT (phone_number, matricule,id_profil) VALUES ( ?,?,?);";
	
	private static final String SQL_SELECT_ALL = "SELECT * from STUDENT, PROFIL  WHERE STUDENT.id_student = PROFIL.id_profil;";
	private static final String SQL_SELECT_PROFIL = "SELECT id_profil FROM PROFIL WHERE first_name = ?";
	
	
	

	EtudiantDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void add(Etudiant etudiant) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		
		Statement statement = null;
		ResultSet resultat = null;
		int id_profil=-1;

		try {
			connexion = daoFactory.getConnection();
			preparedStatement = connexion.prepareStatement(this.SQL_INSERT_PROFIL);
			preparedStatement.setString(1, etudiant.getFirst_name());
			preparedStatement.setString(2, etudiant.getLast_name());
			preparedStatement.executeUpdate();
			
			preparedStatement = null;
			preparedStatement = connexion.prepareStatement(this.SQL_SELECT_PROFIL);
			preparedStatement.setString(1, etudiant.getFirst_name());
			resultat = preparedStatement.executeQuery();
			
			while (resultat.next()) {
				id_profil= resultat.getInt("id_profil");
			}
			
			preparedStatement = null;
			preparedStatement = connexion.prepareStatement(this.SQL_INSERT_ETUDIANT);
			preparedStatement.setString(1, etudiant.getTelephone());
			preparedStatement.setString(2, etudiant.getMatricule());
			preparedStatement.setInt(3, id_profil);
			
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
			resultat = statement.executeQuery(SQL_SELECT_ALL);

			while (resultat.next()) {
				String nom = resultat.getString("first_name");
				String prenom = resultat.getString("last_name");
				String matricule = resultat.getString("matricule");
				String telephone = resultat.getString("phone_number");
				int id_etudiant = resultat.getInt("id_student");
				int id_profil= resultat.getInt("id_profil");
				

				Etudiant etudiant = new Etudiant(nom, prenom, matricule, telephone);
				etudiant.setId_profil(id_profil);
				etudiant.setId_etudiant(id_etudiant);
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
