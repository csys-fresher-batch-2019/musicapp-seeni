package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAOImpl implements LoginDAO{
	public boolean login(String email,String pass) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		String sql="select email_id,password from userlogin where email_id=? and password=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, email);
		pst.setString(2, pass);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			rs.getString("email_id");
			rs.getString("password");
			return true;
		}else {
			return false;
		}
	}
}
