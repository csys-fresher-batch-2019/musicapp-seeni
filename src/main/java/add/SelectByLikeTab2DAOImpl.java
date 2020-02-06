package add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectByLikeTab2DAOImpl implements SelectByLikeTab2DAO{
	public List<String> selectByLikeKey(String str)  throws ClassNotFoundException, SQLException{
		Connection con=Connection1.connection();
		String sql="select song_name from song_list where song_name like ?";
		Logger.info(sql);
		PreparedStatement pst =con.prepareStatement(sql);
		pst.setString(1, str);
		ResultSet rs=pst.executeQuery();
		List<String> li=new ArrayList<String>();
		while(rs.next()) {
			li.add(rs.getString("song_name"));
			
		}
		for (String string : li) {
			Logger.info(string);
		}
		return li;
	}
}
