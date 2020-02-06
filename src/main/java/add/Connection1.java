package add;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {
	public static Connection connection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		return con;
	}
}
