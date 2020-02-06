package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertTab2DAOImpl implements InsertTab2DAO{
	public void insertSong(SongList songList) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		String sql ="insert into song_list(song_number,song_name,music_director,lyricist,singers,movie_name) "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		songList=new SongList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter song number ");
		int number=sc.nextInt();
		sc.nextLine();
		songList.setSongNumber(number);
		pst.setInt(1,songList.getSongNumber());
		System.out.println("Enter song name ");
		String sname=sc.nextLine();
		songList.setSongName(sname);
		pst.setString(2, songList.getSongName());
		System.out.println("Enter music director");
		String mdir=sc.nextLine();
		songList.setMusicDirector(mdir);
		pst.setString(3, songList.getMusicDirector());
		System.out.println("Enter Lyricist name ");
		String lyricist=sc.nextLine();
		songList.setLyricist(lyricist);
		pst.setString(4, songList.getLyricist());
		System.out.println("Enter singers name ");
		String singers=sc.nextLine();
		songList.setSingers(singers);;
		pst.setString(5, songList.getSingers());
		System.out.println("Enter movie name ");
		String mname=sc.nextLine();
		songList.setMovieName(mname);
		pst.setString(6, songList.getMovieName());
		int rows=pst.executeUpdate();
		pst.close();
		System.out.println(sql);
		System.out.println("No.of Rows Inserted = "+rows);
	}

}
