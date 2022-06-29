package com.dao.checknote_final;

import java.util.List;

import com.bean.checknote_final.Note;

public interface NoteDao {

	void add(Note note);
	void edit(Note note);
	void delete(int id_note);
	List<Note> list();
}
