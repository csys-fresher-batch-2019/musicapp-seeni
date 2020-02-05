package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SongBetweenDatesTab2DAOImpl implements SongBetweenDatesTab2DAO{
	
public List<String> selectSongs(int releaseYearLd,int upto) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		String sql="select song_name from song_list where song_number in (select song_number from year where release_year between ? and ?)";
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, releaseYearLd);
		pst.setInt(2, upto);
		ResultSet rs=pst.executeQuery();
		ArrayList<String> li=new ArrayList<String>();
		while(rs.next()) {
			li.add(rs.getString("song_name"));
		}
		for (String string : li) {
			System.out.println(string);
		}
		return li;
		
	}

public List<String> selectSongs(LocalDate releaseDateLd, LocalDate upto) throws Exception {
	// TODO Auto-generated method stub
	return null;
}
}
