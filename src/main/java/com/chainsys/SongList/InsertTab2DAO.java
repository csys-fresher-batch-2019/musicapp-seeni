package com.chainsys.SongList;

import java.sql.SQLException;

import add.SongList;

public interface InsertTab2DAO {
	
	public boolean insertSong(SongList songList)  throws Exception;
	
}
