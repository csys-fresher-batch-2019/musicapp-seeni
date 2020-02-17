package com.chainsys.SongList;

import java.sql.SQLException;
import java.util.List;

public interface SearchSongTab2DAO {

	public List<String> searchSongName()  throws ClassNotFoundException, SQLException;
	
}
