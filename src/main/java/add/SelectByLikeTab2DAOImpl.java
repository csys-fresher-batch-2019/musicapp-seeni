package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectByLikeTab2DAOImpl implements SelectByLikeTab2DAO{
	public String selectByLikeKey(String str) throws Exception {
		Connection con=Connection1.connection();
		String sql="select song_name from song_list where song_name like ?";
		Logger.Info(sql);
		PreparedStatement pst =con.prepareStatement(sql);
		pst.setString(1, str);
		ResultSet rs=pst.executeQuery();
		List<String> li=new ArrayList<String>();
		while(rs.next()) {
			li.add(rs.getString("song_name"));
			
		}
		for (String string : li) {
			Logger.Info(string);
		}
		return sql;
	}
}
