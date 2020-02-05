package add;

import java.util.List;

public interface SongBetweenDatesTab2DAO {

	public List<String> selectSongs(int releaseDateLd,int upto) throws Exception;
	
}
