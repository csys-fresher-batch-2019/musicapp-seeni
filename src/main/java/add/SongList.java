package add;

import java.util.Scanner;

public class SongList{
	private int songNumber;
	private String songName;
	private String musicDirector;
	private String lyricist;
	private String singers;
	private String movieName;
	

	public int getSongNumber() {
		return songNumber;
	}


	public void setSongNumber(int songNumber) {
		this.songNumber = songNumber;
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public String getMusicDirector() {
		return musicDirector;
	}


	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}


	public String getLyricist() {
		return lyricist;
	}


	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}


	public String getSingers() {
		return singers;
	}


	public void setSingers(String singers) {
		this.singers = singers;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	

	@Override
	public String toString() {
		
		return "SongList [songNumber=" + songNumber + ", songName=" + songName + ", musicDirector=" + musicDirector
				+ ", lyricist=" + lyricist + ", singers=" + singers + ", movieName=" + movieName + "]";
	}
}
