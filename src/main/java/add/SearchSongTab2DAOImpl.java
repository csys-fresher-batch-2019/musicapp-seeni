package add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchSongTab2DAOImpl implements SearchSongTab2DAO{

	public List<String> searchSongName() throws ClassNotFoundException, SQLException {
		Connection con=Connection1.connection();
		String sql="select song_name from song_list";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		Logger.info(sql);
		List<String> arli=new ArrayList<String>();
		while(rs.next()) {
			arli.add(rs.getString("song_name"));
		}
		return arli;
	}


	
}
