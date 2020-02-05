package add;

import java.sql.Date;
import java.time.LocalDate;

public class Year {
	
	public int songNumber;
	public Date songReleasedDate;
	public String songTone;
	public int songDurationInSeconds;
	public int songSizeInMB;
	public String songLang;
	public Date downloadDate;
	
	@Override
	public String toString() {
		return "Year [songNumber=" + songNumber + ", songReleasedDate=" + songReleasedDate + ", songTone=" + songTone
				+ ", songDurationInSeconds=" + songDurationInSeconds + ", songSizeInMB=" + songSizeInMB + ", songLang="
				+ songLang + ", downloadDate=" + downloadDate + "]";
	}
	

}
