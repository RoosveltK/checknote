package com.bean.checknote_final;

public class Profil {

	private String first_name, last_name;
	private int id_profil;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Profil() {
	}

	public Profil(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public int getId_profil() {
		return id_profil;
	}

	public void setId_profil(int id_profil) {
		this.id_profil = id_profil;
	}

}
