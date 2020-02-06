package add;

import java.sql.Date;
import java.time.LocalDate;

public class Year {
	
	private int songNumber;
	private Date songReleasedDate;
	private String songTone;
	private int songDurationInSeconds;
	private int songSizeInMB;
	private String songLang;
	private Date downloadDate;
	
	@Override
	public String toString() {
		return "Year [songNumber=" + songNumber + ", songReleasedDate=" + songReleasedDate + ", songTone=" + songTone
				+ ", songDurationInSeconds=" + songDurationInSeconds + ", songSizeInMB=" + songSizeInMB + ", songLang="
				+ songLang + ", downloadDate=" + downloadDate + "]";
	}
	

}
