package com.dao.checknote_final;

import java.sql.*;

public class DaoFactory {
	private String url;
	private String username;
	private String password;

	DaoFactory(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public static DaoFactory getInstance() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.print("erreur chargement du driver\n");

		}

		DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/notes", "root", "");
		return instance;
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	// Récupération du Dao
	public EtudiantDao getEtudiantDao() {
		return new EtudiantDaoImpl(this);
	}
}
