package add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTab2DAOImpl implements InsertTab2DAO{
	public void insertSong(SongList songList) throws ClassNotFoundException, SQLException  {
		Connection con=Connection1.connection();
		String sql ="insert into song_list(song_number,song_name,music_director,lyricist,singers,movie_name) "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		songList=new SongList();
		Scanner sc=new Scanner(System.in);
		Logger.info("Enter song number ");
		int number=sc.nextInt();
		sc.nextLine();
		songList.setSongNumber(number);
		pst.setInt(1,songList.getSongNumber());
		Logger.info("Enter song name ");
		String sname=sc.nextLine();
		songList.setSongName(sname);
		pst.setString(2, songList.getSongName());
		Logger.info("Enter music director");
		String mdir=sc.nextLine();
		songList.setMusicDirector(mdir);
		pst.setString(3, songList.getMusicDirector());
		Logger.info("Enter Lyricist name ");
		String lyricist=sc.nextLine();
		songList.setLyricist(lyricist);
		pst.setString(4, songList.getLyricist());
		Logger.info("Enter singers name ");
		String singers=sc.nextLine();
		songList.setSingers(singers);
		pst.setString(5, songList.getSingers());
		Logger.info("Enter movie name ");
		String mname=sc.nextLine();
		songList.setMovieName(mname);
		pst.setString(6, songList.getMovieName());
		int rows=pst.executeUpdate();
		pst.close();
		Logger.info(sql);
		Logger.info("No.of Rows Inserted = "+rows);
	}

}
