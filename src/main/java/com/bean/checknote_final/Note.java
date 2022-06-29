package com.bean.checknote_final;

public class Note {
	private int id, ue_id;
	private Ue ue;
	private User user;
	private double value;
	private String etudiant_matricule,examen;
	
	public String getExamen() {
		return examen;
	}

	public void setExamen(String examen) {
		this.examen = examen;
	}

	public String getEtudiant_matricule() {
		return etudiant_matricule;
	}

	public void setEtudiant_matricule(String etudiant_matricule) {
		this.etudiant_matricule = etudiant_matricule;
	}

	public int getUe_id() {
		return ue_id;
	}

	public void setUe_id(int ue_id) {
		this.ue_id = ue_id;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Ue getUe() {
		return ue;
	}
	
	public void setUe(Ue ue) {
		this.ue = ue;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

}

//CREATE TABLE note(
//	    id int NOT NULL AUTO_INCREMENT,
//	    ue int,
//	    user int,
//	    value double,
//	    
//	    FOREIGN KEY (ue) REFERENCES ue(id) ON DELETE CASCADE,
//	    FOREIGN KEY (user) REFERENCES users(id) ON DELETE CASCADE,
//	    PRIMARY KEY (id)
//	);