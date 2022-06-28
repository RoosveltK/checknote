package com.bean.checknote_final;

public class Etudiant extends Profil {

	private String matricule, telephone;

	public Etudiant(String first_name, String last_name, String matricule, String telephone) {
		super(first_name, last_name);
		this.matricule = matricule;
		this.telephone = telephone;
		// TODO Auto-generated constructor stub
	}

	private int id_etudiant;

	public Etudiant() {
		super();
	}

	public Etudiant(String matricule, int id_etudiant) {
		super();
		this.matricule = matricule;
		this.id_etudiant = id_etudiant;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(int id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
}
