package com.bean.checknote_final;

public class Etudiant extends User {

	private int classe_id;
	
	public int getClasse_id() {
		return classe_id;
	}

	public void setClasse_id(int classe_id) {
		this.classe_id = classe_id;
	}

	public Etudiant(String first_name, String last_name, String matricule,String phone_number) {
		
		super(last_name, first_name, last_name+ "12345", phone_number, matricule, "STUDENT");
	
	}
	


}
