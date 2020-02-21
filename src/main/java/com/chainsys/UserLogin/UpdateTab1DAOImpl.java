package com.chainsys.UserLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.OtherClass.Connection1;

public class UpdateTab1DAOImpl implements UpdateTab1DAO{
		public boolean updatePhoneNo(long phNo,String email)  throws ClassNotFoundException, SQLException{
			Connection con=Connection1.connection();
			String sql="update userlogin set mobile_no=? where email_id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setLong(1, phNo);
			pst.setString(2, email);
			int rows=pst.executeUpdate();
			System.out.println("No. of rows updated "+rows);
		pst.close();
		con.close();
		return true;
	}

}