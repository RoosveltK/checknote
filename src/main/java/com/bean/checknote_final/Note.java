package com.bean.checknote_final;

public class Note {
	private int id;
	private UE ue;
	private User user;
	private double value;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public UE getUe() {
		return ue;
	}
	
	public void setUe(UE ue) {
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