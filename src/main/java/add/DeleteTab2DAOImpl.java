package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteTab2DAOImpl implements DeleteTab2DAO {
	public void delRow(int sno) throws Exception {
		Connection con=Connection1.connection();String sql="delete song_list where song_number=?";
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, sno);
		System.out.println("Are you sure wants to delete the song");
		System.out.println("Enter yes for delete and no for cancel");
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		if(ch.equals("yes")) {
			int num=pst.executeUpdate();
			System.out.println("Song deleted");
			System.out.println("No. of rows deleted = "+num);
			
		}else if(ch.equals("no")){
			System.out.println("Deleted cancelled");
		}else {
			System.out.println("Incorrect operation");
		}
	}
}
