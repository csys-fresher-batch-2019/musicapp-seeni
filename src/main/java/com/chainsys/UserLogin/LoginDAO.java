package com.chainsys.UserLogin;

import java.sql.SQLException;

public interface LoginDAO {
	public boolean login(String email,String pass)  throws ClassNotFoundException, SQLException;
}
