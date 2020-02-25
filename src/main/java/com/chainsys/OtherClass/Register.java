package com.chainsys.OtherClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
			String sql = "insert into userlogin(user_id,username,email_id,password,mobile_no) values(uid_seq.nextval,?,?,?,?)";

			try (PreparedStatement pst = con.prepareStatement(sql);) {
				pst.setString(1, ul.getUserName());
				pst.setString(2, ul.getEmailId());
				pst.setString(3, ul.getPassword());
				pst.setLong(4, ul.getMobileNo());
				int row = pst.executeUpdate();
				Logger.getInstanceOf().info(row);

			}
			return true;
		}
	}
}
