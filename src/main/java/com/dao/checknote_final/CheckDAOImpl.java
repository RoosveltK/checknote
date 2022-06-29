package com.dao.checknote_final;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bean.checknote_final.Classe;
import com.bean.checknote_final.Etudiant;
import com.bean.checknote_final.Note;
import com.bean.checknote_final.Ue;
import com.bean.checknote_final.User;

public class CheckDAOImpl implements CheckDAO {
	

	private DaoFactory daoFactory;



	
	public CheckDAOImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	
	public Classe getClasse(int id) {

		String SQL_GET = "SELECT * FROM classe WHERE id = \'"+id+"\'";
		
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
	
	public User getUser(String matricule) {

		String SQL_GET = "SELECT * FROM users WHERE matricule = \'" +matricule+"\'";
		
		try(Statement statement = daoFactory.getConnection().createStatement()){
			ResultSet rs = statement.executeQuery(SQL_GET);
			
			if ( rs.next()) {
				String nom = rs.getString("first_name");
				String prenom = rs.getString("last_name");
				String mat = rs.getString("matricule");
				String telephone = rs.getString("phone_number");
				int id = rs.getInt("id");
				
				User user = new User();
				
				user.setId(id);
				user.setFirst_name(nom);
				user.setLast_name(prenom);
				user.setMatricule(mat);
				user.setPhone_number(telephone);
				
				
				return user;
		      }
			
			return null;
		} catch (SQLException e) {
		    // handle the database related exception appropriately
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

		public Ue getUe(int id) {

		String SQL_GET = "SELECT * FROM ue WHERE id = \'" +id+"\'";
		
		try(Statement statement = daoFactory.getConnection().createStatement()){
			ResultSet rs = statement.executeQuery(SQL_GET);
			
			if ( rs.next()) {
				int idUe = rs.getInt("id");
				String code = rs.getString("code");
				String intitule = rs.getString("intitule");
				
				Ue ue = new Ue();
				
				ue.setId(idUe);
				ue.setIntitule(intitule);
				ue.setCode(code);
				
				
				return ue;
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
	public List<Ue> listUe(User user) {


		 String SQL_FIND_ETUDIANT ="SELECT * FROM users WHERE matricule = \'" +user.getMatricule()+"\'";
		
		List<Ue> ues = new ArrayList<Ue>();
		try(Statement statement = daoFactory.getConnection().createStatement()){
				System.out.println(SQL_FIND_ETUDIANT);
				ResultSet rs = statement.executeQuery(SQL_FIND_ETUDIANT);
			
			if ( rs.next()) {
				int idClasse = Integer.parseInt(rs.getString("classe"));
				
				String SQL_FIND_UE ="SELECT * FROM ue WHERE classe = \'" +idClasse+"\'";

				System.out.println(SQL_FIND_UE);
				try(Statement statementClasse = daoFactory.getConnection().createStatement()){
					ResultSet rsClasse = statement.executeQuery(SQL_FIND_UE);

					while (rsClasse.next()) {
						int id = rsClasse.getInt("id");
						String code = rsClasse.getString("code");
						String intitule = rsClasse.getString("intitule");
						Classe classe = getClasse(rsClasse.getInt("classe"));
						
						Ue ue = new Ue();
						ue.setId(id);
						ue.setClasse(classe);
						ue.setCode(code);
						ue.setIntitule(intitule);
						
						ues.add(ue);
						
					}
					return ues;
				} catch (SQLException e) {
				    // handle the database related exception appropriately
					e.printStackTrace();
				}
				
				return null;
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
	public Note getNote(User user, Ue ue, String type) {
		System.out.println(ue.getId());
		String SQL_GET = "SELECT * FROM `note` WHERE user = "+user.getId()+" and ue = "+ue.getId()+" and exam='"+type+"'";
		
		try(Statement statement = daoFactory.getConnection().createStatement()){
			ResultSet rs = statement.executeQuery(SQL_GET);
			
			if ( rs.next()) {
				int id = rs.getInt("id");
				String exam = rs.getString("exam");
				double value = rs.getDouble("value");
				
				Note note = new Note();
				
				note.setId(id);
				note.setExamen(exam);
				note.setValue(value);
				note.setUe(ue);
				note.setUser(user);
				
				return note;
		      }
			
			return null;
		} catch (SQLException e) {
		    // handle the database related exception appropriately
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

}
