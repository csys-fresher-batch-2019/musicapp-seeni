package com.chainsys.SongList;

import java.sql.SQLException;
import java.util.List;

public interface SongBetweenDatesTab2DAO {

	public List<String> selectSongs(int releaseDateLd,int upto)  throws ClassNotFoundException, SQLException;
	
}
