package com.chainsys.UserLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.OtherClass.Connection1;

public class LoginDAOImpl implements LoginDAO{
	public boolean login(String email,String pass) throws ClassNotFoundException, SQLException {
		System.out.println(email);
		System.out.println(pass);
		String sql="select email_id,password from userlogin where email_id=? and password=?";
		try(Connection con=Connection1.connection();
				PreparedStatement pst=con.prepareStatement(sql);
				ResultSet rs=pst.executeQuery();){
		pst.setString(1, email);
		pst.setString(2, pass);
		
		if(rs.next()) {
			System.out.println("Yes");
			return true;
		}else {
			System.out.println("NO");
			return false;
		}
	}
	}
}
