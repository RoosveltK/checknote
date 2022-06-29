package com.bean.checknote_final;

public class Ue {
	private int id;
	private String code;
	private String intitule;
	private Classe classe;
	private int classe_id;
	
	public int getClasse_id() {
		return classe_id;
	}

	public void setClasse_id(int classe_id) {
		this.classe_id = classe_id;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
}

//CREATE TABLE ue(
//	    id int NOT NULL AUTO_INCREMENT,
//	    code varchar(10),
//	    intitule text,
//	    classe int,
//	    
//	    FOREIGN KEY (classe) REFERENCES classe(id) ON DELETE CASCADE,
//	    PRIMARY KEY (id)
//	);
