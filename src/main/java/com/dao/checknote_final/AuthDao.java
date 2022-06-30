package com.dao.checknote_final;

import java.util.List;

import com.bean.checknote_final.Auth;
import com.bean.checknote_final.User;

public interface AuthDao {
	User singin(Auth auth);
	void singout(Auth auth);
}
