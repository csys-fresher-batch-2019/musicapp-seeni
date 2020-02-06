package add;

import java.sql.Connection;
import java.sql.Statement;

public class Register {
	public boolean register(Userlogin a) throws Exception {
		Connection con=Connection1.connection();
		String sql="insert into userlogin(user_id,username,email_id,password,mobile_no) values("+a.getUserId()+",'"+a.getUserName()+"','"+a.getEmailId()+"','"+a.getPassword()+"',"+a.getMobileNo()+")";
		boolean insertion=true;
		if (insertion) {
			Statement st = con.createStatement();
			int row = st.executeUpdate(sql);
			Logger.info("Number of rows inserted " + row);
			return true;
		}else {
			return false;
		}
	}
}