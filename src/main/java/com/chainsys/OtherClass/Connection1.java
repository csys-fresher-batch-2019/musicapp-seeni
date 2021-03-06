package com.chainsys.OtherClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * To connect with the database
 * 
 * @return
 * @throws SQLException
 * @throws ClassNotFoundException
 */
public class Connection1 {

	public static Connection connection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", ErrorConstants.password);

	}
}
