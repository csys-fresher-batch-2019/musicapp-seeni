package com.chainsys.OtherClass;


public class SongList{
	private String songName;
	private String musicDirector;
	private String lyricist;
	private String singers;
	private String movieName;
	private String songLink;
	

	public String getSongLink() {
		return songLink;
	}


	public void setSongLink(String songLink) {
		boolean b=nullOrNot(songLink);
		if(b) {
			this.songLink = songLink;
		}
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		//boolean b=spellCheck(songName);
		boolean n=nullOrNot(songName);
		if( n) {
			this.songName=songName;
		}
	}


	public String getMusicDirector() {
		return musicDirector;
	}


	public void setMusicDirector(String musicDirector) {
		//boolean b=spellCheck(musicDirector);
		boolean n=nullOrNot(musicDirector);
		if( n) {
			this.musicDirector=musicDirector;
		}
	}


	public String getLyricist() {
		return lyricist;
	}


	public void setLyricist(String lyricist) {
		//boolean b=spellCheck(lyricist);
		boolean n=nullOrNot(lyricist);
		if( n) {
			this.lyricist=lyricist;
		}
	}


	public String getSingers() {
		return singers;
	}


	public void setSingers(String singers) {
		//boolean b=spellCheck(singers);
		boolean n=nullOrNot(singers);
		if( n) {
			this.singers=singers;
		}
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		//boolean b=spellCheck(movieName);
		boolean n=nullOrNot(movieName);
		if( n) {
			this.movieName=movieName;
		}
	}
	

	@Override
	public String toString() {
		
		return "SongList [ songName=" + songName + ", musicDirector=" + musicDirector
				+ ", lyricist=" + lyricist + ", singers=" + singers + ", movieName=" + movieName + "]";
	}
	/*public static boolean spellCheck(String nameCheck) {
		String str=nameCheck;
		char[] ch=str.toCharArray();
		String s="";
		for (char c : ch) {
			if((c==(char)(32))) {
				s=s+c;
			}
			for (int i=65;i<122;i++) {
				if(i==91||i==92||1==93||i==94||i==95||i==96) {
					continue;
				}
				else if(c==(char)(i)) {
					s=s+c;
				}
			}
		}if(s.equals(str)) {
			return true;
		}else {
			Logger.error(ErrorConstants.checkInput);
			return false;
		}
	}*/public static boolean nullOrNot(String name) {
		
		if(name.equals("")) {
			Logger.info(ErrorConstants.checkInput);
			return false;
		}else {
			return true;
		}
	}
}