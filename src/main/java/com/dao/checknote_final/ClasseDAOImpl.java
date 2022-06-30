package com.dao.checknote_final;

import java.sql.*;
import java.util.*;

import com.bean.checknote_final.Classe;

public class ClasseDAOImpl implements ClasseDAO {
	private DaoFactory daoFactory;

	private static final String SQL_INSERT = "INSERT INTO classe (departement, cycle, level) VALUES (?, ?, ?);";
	private static final String SQL_SELECT = "SELECT * FROM classe;";
	

	public ClasseDAOImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}


	@Override
	public Classe add(Classe classe){
		// TODO Auto-generated method stub
		
		try (PreparedStatement statement = daoFactory.getConnection().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS)) {

			statement.setString(1, classe.getDepartement());
			statement.setString(2, classe.getCycle());
			statement.setString(3, classe.getLevel());
		    int id = statement.executeUpdate();
		    
		    classe.setId(id);
		    
		    return classe;

		    // omitted
		} catch (SQLException e) {
		    // handle the database related exception appropriately
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public Classe get(int id) {

		String SQL_GET = "SELECT * FROM classe WHERE id ="+id;
		
		try(Statement statement = daoFactory.getConnection().createStatement()){
			ResultSet rs = statement.executeQuery(SQL_GET);
			
			if ( rs.next()) {
				Classe classe = new Classe();
				int idClasse = Integer.parseInt(rs.getString("id"));
				
				classe.setId(idClasse);
				classe.setDepartement(rs.getString("departement"));
				classe.setLevel(rs.getString("level"));
				classe.setCycle(rs.getString("cycle"));
				
				return classe;
		      }
			
			return null;
		} catch (SQLException e) {
		    // handle the database related exception appropriately
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}


	
	@Override
	public Classe edit(Classe classe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Classe> list() {
		// TODO Auto-generated method stub
		
		List<Classe> classes = new ArrayList<Classe>();

		try(Statement statement = daoFactory.getConnection().createStatement()){
			ResultSet rs = statement.executeQuery(SQL_SELECT);
			
			while( rs.next()) {
				Classe classe = new Classe();
				int idClasse = Integer.parseInt(rs.getString("id"));
				System.out.println("==================+>");
				
				classe.setId(idClasse);
				classe.setDepartement(rs.getString("departement"));
				classe.setLevel(rs.getString("level"));
				classe.setCycle(rs.getString("cycle"));
				
				classes.add(classe);
		    }
		} catch (SQLException e) {
		    // handle the database related exception appropriately
			e.printStackTrace();
		}
		
		return classes;
	}
	
//	public Classe[] list1() {
//		// TODO Auto-generated method stub
//		
//		Classe[] classes;
//
//		try(Statement statement = daoFactory.getConnection().createStatement()){
//			ResultSet rs = statement.executeQuery(SQL_SELECT);
//			
//			while( rs.next()) {
//				Classe classe = new Classe();
//				int idClasse = Integer.parseInt(rs.getString("id"));
//				System.out.println("==================+>");
//				
//				classe.setId(idClasse);
//				classe.setDepartement(rs.getString("departement"));
//				classe.setLevel(rs.getString("level"));
//				classe.setCycle(rs.getString("cycle"));
//				
//				classes
//		    }
//		} catch (SQLException e) {
//		    // handle the database related exception appropriately
//			e.printStackTrace();
//		}
//		
//		return classes;
//	}

}
