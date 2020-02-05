package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SearchSongTab2DAOImpl implements SearchSongTab2DAO{

	public ArrayList<String> searchSongName() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		String sql="select song_name from song_list";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		System.out.println(sql);
		ArrayList<String> arli=new ArrayList<String>();
		while(rs.next()) {
			arli.add(rs.getString("song_name"));
		}System.out.println(arli);
		return arli;
	}


	
}
