package add;

import java.util.Scanner;

import com.chainsys.AccountInfo.AccountTab5Tab1DAO;
import com.chainsys.AccountInfo.AccountTab5Tab1DAOImpl;
import com.chainsys.OtherClass.Logger;
import com.chainsys.OtherClass.SongList;
import com.chainsys.SongList.InsertTab2DAO;
import com.chainsys.SongList.InsertTab2DAOImpl;

public class Admin {
	public static void main(String[] args) throws Exception {

		Logger.info("---------------------ADMIN-------------------- ");

		Logger.info("Press 1 for Songs to insert");
		Logger.info("2 for delete song");
		Logger.info("3 for users premium activation");

		Scanner sa = new Scanner(System.in);
		int num = sa.nextInt();
		switch (num) {
		case 1: {

			SongList t1 = new SongList();
			InsertTab2DAO i = new InsertTab2DAOImpl();
			i.insertSong(t1);
			break;
		}
		/*case 2: {

			System.out.print("Enter the song number = ");
			int n = sc.nextInt();
			DeleteTab2DAO d = new DeleteTab2DAOImpl();
			//d.delRow(n);
			break;
		}*/
		case 3: {

			AccountTab5Tab1DAO a = new AccountTab5Tab1DAOImpl();
			a.accountInfo("Y");
			break;
		}
		}
	}
}
