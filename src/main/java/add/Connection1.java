package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1 {
	private Connection1(){
		
	}
	public static Connection connection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		
	}
}
