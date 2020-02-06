package add;

import java.sql.SQLException;

public interface ForgotPasswordTab1DAO {

	public String pwdChange(String emailId)throws SQLException, ClassNotFoundException;
	
}
