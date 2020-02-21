package add;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.OtherClass.Logger;
import com.chainsys.SongList.SearchSongTab2DAO;
import com.chainsys.SongList.SearchSongTab2DAOImpl;
import com.chainsys.SongList.SelectByLikeTab2DAO;
import com.chainsys.SongList.SelectByLikeTab2DAOImpl;
import com.chainsys.SongList.SongBetweenDatesTab2DAO;
import com.chainsys.SongList.SongBetweenDatesTab2DAOImpl;
import com.chainsys.UserLogin.UpdateTab1DAO;
import com.chainsys.UserLogin.UpdateTab1DAOImpl;

public class Users {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Logger.info("Press 1 for update phone number");
		Logger.info("2 for change password");
		Logger.info("3 for display Song List");
		Logger.info("4 for search by song name");
		Logger.info("5 for search song between year");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		switch(num) {
		case 1:{
			UpdateTab1DAO u=new UpdateTab1DAOImpl();
			//u.updatePhoneNo(6379434293l,102);
			break;
		}/*case 2:{

			ForgotPasswordTab1DAO p=new ForgotPassword();
			p.pwdChange("s@gmail.com");
			break;
		}*/case 2:{
			SearchSongTab2DAO s=new SearchSongTab2DAOImpl();
			s.searchSongName();
			break;
		}case 3:{
			Logger.info("Enter song name ");
			String sname=sc.next().toUpperCase();
			SelectByLikeTab2DAO s=new SelectByLikeTab2DAOImpl();
			s.selectByLikeKey("%"+sname+"%");
			break;
		}case 4:{
			SongBetweenDatesTab2DAO s=new SongBetweenDatesTab2DAOImpl();
			System.out.println("Enter from year ");
			int fromYear=sc.nextInt();
			System.out.println("Enter To year  ");
			int toYear=sc.nextInt();
			s.selectSongs(fromYear, toYear);
			break;
		}
		}
	}
}
