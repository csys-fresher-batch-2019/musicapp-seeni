package com.chainsys.OtherClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminLogin {

	/**
	 * To check the admin login details
	 * 
	 * @param mail
	 * @param pwd
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */

	public static boolean adminDetails(String mail, String pwd) throws SQLException, ClassNotFoundException {
		String sql = "select email_id,password from adminlogin where email_id=? and password=?";
		try (Connection con = Connection1.connection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			pst.setString(1, mail);
			pst.setString(2, pwd);
			List<String> li = new ArrayList<>();
			while (rs.next()) {
				li.add(rs.getString("email_id"));
				li.add(rs.getString("password"));
				return true;

			}

		}
		return false;

	}
}
