package com.bean.checknote_final;

public class User {

	private int id;
	private String last_name;
	private String first_name;
	private String password;
	private String phone_number;
	private String matricule;
	public User() {
		super();
	}

	public User(String last_name, String first_name, String password, String phone_number, String matricule,
			String type) {
		super();
		this.last_name = last_name;
		this.first_name = first_name;
		this.password = password;
		this.phone_number = phone_number;
		this.matricule = matricule;
		this.type = type;
	}

	private String type;
	private Classe classe;
	
	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getMatricule() {
		return matricule;
	}
	
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}

