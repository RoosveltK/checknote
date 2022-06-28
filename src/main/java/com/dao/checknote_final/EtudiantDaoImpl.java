

package com.dao.checknote_final;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.checknote_final.*;



public class EtudiantDaoImpl implements EtudiantDao {
	private DaoFactory daoFactory;

	private static final String SQL_INSERT = "INSERT INTO etudiant (nom, prenom, matricule) VALUES (?, ?, ?,?);";
	private static final String SQL_SELECT = "SELECT * from STUDENT, PROFIL  WHERE STUDENT.id_student = PROFIL.id_profil;";
	
	

	EtudiantDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void add(Etudiant etudiant) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;

		try {
			connexion = daoFactory.getConnection();
			preparedStatement = connexion.prepareStatement(this.SQL_INSERT);
			preparedStatement.setString(1, etudiant.getFirst_name());
			preparedStatement.setString(2, etudiant.getLast_name());
			preparedStatement.setString(3, etudiant.getMatricule());
			preparedStatement.setString(4, etudiant.getTelephone());

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
			resultat = statement.executeQuery(SQL_SELECT);

			while (resultat.next()) {
				String nom = resultat.getString("first_name");
				String prenom = resultat.getString("last_name");
				String matricule = resultat.getString("matricule");
				String telephone = resultat.getString("telephone");
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
