package com.dao.checknote_final;

import java.util.List;

import com.bean.checknote_final.Note;
import com.bean.checknote_final.Ue;
import com.bean.checknote_final.User;

public interface CheckDAO {
	List<Ue> listUe(User user);
	Note getNote(User user, Ue ue, String type);
}
