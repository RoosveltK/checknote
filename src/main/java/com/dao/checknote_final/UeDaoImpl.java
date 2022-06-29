package com.dao.checknote_final;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.checknote_final.Ue;

public class UeDaoImpl implements UeDao {
	
	private DaoFactory daoFactory;
	private static final String SQL_INSERT_UE = "INSERT INTO ue (code, intitule, classe) VALUES (?,?,?);";
	private static final String SQL_SELECT_ALL_UE = "SELECT id, code, intitule,classe from ue";

	UeDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void add(Ue ue) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;

		try {
			connexion = daoFactory.getConnection();
			preparedStatement = connexion.prepareStatement(SQL_INSERT_UE);
			preparedStatement.setString(1, ue.getCode());
			preparedStatement.setString(2, ue.getIntitule());
			preparedStatement.setInt(3, ue.getClasse_id());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Ue> list() {
		List<Ue> ues = new ArrayList<Ue>();
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;

		try {
			connexion = daoFactory.getConnection();
			statement = connexion.createStatement();
			resultat = statement.executeQuery(SQL_SELECT_ALL_UE);

			while (resultat.next()) {
				String code = resultat.getString("code");
				String intitule = resultat.getString("intitule");
				int id = resultat.getInt("id");

				Ue ue = new Ue();
				ue.setId(id);
				ue.setIntitule(intitule);
				ue.setCode(code);
				ues.add(ue);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return ues;
	}

	

	@Override
	public void delete(int id_etudiant) {
		// TODO Auto-generated method stub

	}


	@Override
	public void edit(Ue ue) {
		// TODO Auto-generated method stub
		
	}

}
