package com.dao.checknote_final;

import java.util.List;

import com.bean.checknote_final.Etudiant;

public interface EtudiantDao {

	void add(Etudiant etudiant);
	void edit(Etudiant etudiant);
	void delete(int id_etudiant);
	List<Etudiant> list();

}
