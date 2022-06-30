package com.dao.checknote_final;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.checknote_final.Auth;
import com.bean.checknote_final.Etudiant;
import com.bean.checknote_final.User;

public class AuthDaoImpl implements AuthDao{
	private DaoFactory daoFactory;
	
	AuthDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public User singin(Auth auth) {
		String SQL_REQUEST = "SELECT * FROM users where last_name='"+auth.getUsername()+"' and password='"+auth.getPassword()+"';";
		User user=null;
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;

		try {
			connexion = daoFactory.getConnection();
			statement = connexion.createStatement();
			resultat = statement.executeQuery(SQL_REQUEST);

			while (resultat.next()) {
				String nom = resultat.getString("first_name");
				String prenom = resultat.getString("last_name");
				String matricule = resultat.getString("matricule");
				String telephone = resultat.getString("phone_number");
				
				int id = resultat.getInt("id");

				user = new User();
				user.setFirst_name(nom);
				user.setLast_name(prenom);
				user.setMatricule(matricule);
				user.setPhone_number(telephone);
				user.setId(id);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
		
	}

	@Override
	public void singout(Auth auth) {
		// TODO Auto-generated method stub
		
	}

}
