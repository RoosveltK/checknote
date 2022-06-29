package com.bean.checknote_final;

public class SMS {
	private int id;
	private Note note;
	private User user;
	private boolean state;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Note getNote() {
		return note;
	}
	
	public void setNote(Note note) {
		this.note = note;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public boolean isState() {
		return state;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
}


//CREATE TABLE sms(
//    id int NOT NULL AUTO_INCREMENT,
//    note int,
//    user int,
//    state boolean,
//    
//    FOREIGN KEY (note) REFERENCES note(id) ON DELETE CASCADE,
//    FOREIGN KEY (user) REFERENCES users(id) ON DELETE CASCADE,
//    PRIMARY KEY (id)
//);