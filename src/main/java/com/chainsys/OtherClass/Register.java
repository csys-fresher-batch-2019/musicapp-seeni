package com.chainsys.OtherClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Insert the new user account into the database
 * 
 * @author seen2380
 *
 */

public class Register {
	public boolean register(Userlogin ul) throws ClassNotFoundException, SQLException {
		try (Connection con = Connection1.connection();) {
			String sql = "insert into userlogin(user_id,username,email_id,password,mobile_no) values(" + ul.getUserId()
					+ ",'" + ul.getUserName() + "','" + ul.getEmailId() + "','" + ul.getPassword() + "',"
					+ ul.getMobileNo() + ")";
			boolean sql1 = true;
			if (sql1) {
				try (Statement st = con.createStatement();) {
					int row = st.executeUpdate(sql);
					Logger.info(row);
					sql1 = true;
				}
			}
			return sql1;
		}
	}
}
