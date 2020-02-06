package add;

import java.sql.SQLException;

public interface UpdateTab1DAO {
	
	public void updatePhoneNo(long phNo,int userid) throws ClassNotFoundException, SQLException; 
	
}
