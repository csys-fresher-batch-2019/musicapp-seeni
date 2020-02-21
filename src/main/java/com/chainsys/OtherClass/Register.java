package com.chainsys.OtherClass;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class Register{
	public  boolean register(Userlogin ul) throws ClassNotFoundException, SQLException {
		Connection con=Connection1.connection();
		String sql="insert into userlogin(user_id,username,email_id,password,mobile_no) values("+ul.getUserId()+",'"+ul.getUserName()+"','"+ul.getEmailId()+"','"+ul.getPassword()+"',"+ul.getMobileNo()+")";
		boolean sql1=true;
		if(sql1) {
			Statement st=con.createStatement();
			int row=st.executeUpdate(sql);
			Logger.info(row);
			return true;
		}
		else {
			return false;
		}
	}
}

