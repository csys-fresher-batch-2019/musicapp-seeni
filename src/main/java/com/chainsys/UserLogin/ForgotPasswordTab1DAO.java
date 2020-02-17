package com.chainsys.UserLogin;

import java.sql.SQLException;

public interface ForgotPasswordTab1DAO {

	public boolean pwdChange(String emailId)throws SQLException, ClassNotFoundException;
	
}
