package com.bean.checknote_final;

public class Classe {
	private int id;
	private String departement;
	private String cycle;
	private String level;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartement() {
		return departement;
	}
	
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	public String getCycle() {
		return cycle;
	}
	
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
}

//
//CREATE TABLE classe(
//    id int NOT NULL AUTO_INCREMENT,
//    departement varchar(255),
//    cycle varchar(100),
//    level int,
//    
//    PRIMARY KEY (id)
//);