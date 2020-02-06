package add;

import java.sql.SQLException;

public interface InsertTab2DAO {
	
	public void insertSong(SongList songList)  throws ClassNotFoundException, SQLException;
	
}
