package add;

import java.util.Scanner;

public class SongBetweenDatesTest {
	public static void main(String[] args) throws Exception {
		SongBetweenDatesTab2DAO s=new SongBetweenDatesTab2DAOImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter from year ");
		int fromYear=sc.nextInt();
		System.out.println("Enter To year  ");
		int toYear=sc.nextInt();
		s.selectSongs(fromYear, toYear);
	}
}
