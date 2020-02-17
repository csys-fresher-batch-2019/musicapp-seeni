package com.chainsys.UserLogin;

import java.sql.SQLException;

public interface UpdateTab1DAO {
	
	public boolean updatePhoneNo(long phNo,String email) throws ClassNotFoundException, SQLException; 
	
}
