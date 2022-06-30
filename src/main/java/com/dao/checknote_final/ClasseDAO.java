package com.dao.checknote_final;

import java.util.List;

import com.bean.checknote_final.Classe;

public interface ClasseDAO {

	Classe add(Classe classe);
	Classe edit(Classe classe);
	Classe get(int id);
	void delete(int id);
	List<Classe> list();
}
