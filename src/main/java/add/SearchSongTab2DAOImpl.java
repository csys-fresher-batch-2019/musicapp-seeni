package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SearchSongTab2DAOImpl implements SearchSongTab2DAO{

	public ArrayList<String> searchSongName() throws Exception{
		Connection con=Connection1.connection();
		String sql="select song_name from song_list";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		Logger.Info(sql);
		ArrayList<String> arli=new ArrayList<String>();
		while(rs.next()) {
			arli.add(rs.getString("song_name"));
		}Logger.Info(arli);
		return arli;
	}


	
}
