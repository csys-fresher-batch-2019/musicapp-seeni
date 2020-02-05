package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertTab2DAOImpl implements InsertTab2DAO{
	public void insertSong(SongList songList) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		String sql ="insert into song_list(song_number,song_name,music_director,lyricist,singers,movie_name) "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, songList.songNumber);
		pst.setString(2, songList.songName);
		pst.setString(3, songList.musicDirector);
		
		pst.setString(4, songList.lyricist);
		
		pst.setString(5, songList.singers);
		pst.setString(6, songList.movieName);
		int rows=pst.executeUpdate();
		pst.close();
		System.out.println(sql);
		System.out.println("No.of Rows Inserted = "+rows);
	}

}
