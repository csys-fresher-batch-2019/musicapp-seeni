package add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAOImpl implements LoginDAO{
	public boolean login(String email,String pass) throws ClassNotFoundException, SQLException {
		Connection con=Connection1.connection();
		System.out.println(email);
		System.out.println(pass);
		String sql="select email_id,password from userlogin where email_id=? and password=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, email);
		pst.setString(2, pass);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			return true;
		}else {
			return false;
		}
	}
}
