package add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTab2DAOImpl implements InsertTab2DAO{
	public void insertSong(SongList sl) throws ClassNotFoundException, SQLException  {
		Connection con=Connection1.connection();
		String sql ="insert into song_list(song_number,song_name,music_director,lyricist,singers,movie_name) "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		Logger.info("Enter song number ");
		int number=sc.nextInt();
		sc.nextLine();
		sl.setSongNumber(number);
		pst.setInt(1,sl.getSongNumber());
		Logger.info("Enter song name ");
		String sname=sc.nextLine();
		sl.setSongName(sname);
		pst.setString(2, sl.getSongName());
		Logger.info("Enter music director");
		String mdir=sc.nextLine();
		sl.setMusicDirector(mdir);
		pst.setString(3, sl.getMusicDirector());
		Logger.info("Enter Lyricist name ");
		String lyricist=sc.nextLine();
		sl.setLyricist(lyricist);
		pst.setString(4, sl.getLyricist());
		Logger.info("Enter singers name ");
		String singers=sc.nextLine();
		sl.setSingers(singers);
		pst.setString(5, sl.getSingers());
		Logger.info("Enter movie name ");
		String mname=sc.nextLine();
		sl.setMovieName(mname);
		pst.setString(6, sl.getMovieName());
		int rows=pst.executeUpdate();
		pst.close();
		Logger.info(sql);
		Logger.info("No.of Rows Inserted = "+rows);
	}

}
