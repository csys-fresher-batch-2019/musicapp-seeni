package add;

import java.sql.SQLException;
import java.util.List;

public interface SelectByLikeTab2DAO {
	
	public List<String> selectByLikeKey(String str)  throws ClassNotFoundException, SQLException;

}
