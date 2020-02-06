package add;

import java.sql.Date;

public class Year {
	
	private int songNumber;
	private Date songReleasedDate;
	private String songTone;
	private int songDurationInSeconds;
	private int songSizeInMB;
	private String songLang;
	private Date downloadDate;
	
	public int getSongNumber() {
		return songNumber;
	}

	public void setSongNumber(int songNumber) {
		this.songNumber = songNumber;
	}

	public Date getSongReleasedDate() {
		return songReleasedDate;
	}

	public void setSongReleasedDate(Date songReleasedDate) {
		this.songReleasedDate = songReleasedDate;
	}

	public String getSongTone() {
		return songTone;
	}

	public void setSongTone(String songTone) {
		this.songTone = songTone;
	}

	public int getSongDurationInSeconds() {
		return songDurationInSeconds;
	}

	public void setSongDurationInSeconds(int songDurationInSeconds) {
		this.songDurationInSeconds = songDurationInSeconds;
	}

	public int getSongSizeInMB() {
		return songSizeInMB;
	}

	public void setSongSizeInMB(int songSizeInMB) {
		this.songSizeInMB = songSizeInMB;
	}

	public String getSongLang() {
		return songLang;
	}

	public void setSongLang(String songLang) {
		this.songLang = songLang;
	}

	public Date getDownloadDate() {
		return downloadDate;
	}

	public void setDownloadDate(Date downloadDate) {
		this.downloadDate = downloadDate;
	}

	@Override
	public String toString() {
		return "Year [songNumber=" + songNumber + ", songReleasedDate=" + songReleasedDate + ", songTone=" + songTone
				+ ", songDurationInSeconds=" + songDurationInSeconds + ", songSizeInMB=" + songSizeInMB + ", songLang="
				+ songLang + ", downloadDate=" + downloadDate + "]";
	}
	

}
