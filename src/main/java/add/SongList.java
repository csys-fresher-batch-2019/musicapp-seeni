package add;

import java.util.Scanner;

public class SongList{
	public int songNumber;
	public String songName;
	public String musicDirector;
	public String lyricist;
	public String singers;
	public String movieName;
	

	public SongList(int songNumber, String songName, String musicDirector, String lyricist, String singers,
			String movieName) {
		super();
		this.songNumber = songNumber;
		this.songName = songName;
		this.musicDirector = musicDirector;
		this.lyricist = lyricist;
		this.singers = singers;
		this.movieName = movieName;
	}
	

	@Override
	public String toString() {
		
		return "SongList [songNumber=" + songNumber + ", songName=" + songName + ", musicDirector=" + musicDirector
				+ ", lyricist=" + lyricist + ", singers=" + singers + ", movieName=" + movieName + "]";
	}


}
