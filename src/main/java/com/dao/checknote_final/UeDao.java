package com.dao.checknote_final;

import java.util.List;

import com.bean.checknote_final.Etudiant;
import com.bean.checknote_final.Ue;

public interface UeDao {
	void add(Ue ue);
	void edit(Ue ue);
	void delete(int id);
	List<Ue> list();

}
