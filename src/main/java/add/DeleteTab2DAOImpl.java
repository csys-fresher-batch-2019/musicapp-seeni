package add;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTab2DAOImpl implements DeleteTab2DAO {
	public void delRow(int sno) throws SQLException, ClassNotFoundException {
		Connection con=Connection1.connection();
		String sql="delete song_list where song_number=?";
		Logger.info(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, sno);
		Logger.info("Are you sure wants to delete the song");
		Logger.info("Enter yes for delete and no for cancel");
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		if(ch.equals("yes")) {
			int num=pst.executeUpdate();
			Logger.info("Song deleted");
			Logger.info("No. of rows deleted = "+num);
			
		}else if(ch.equals("no")){
			Logger.info("Deleted cancelled");
		}else {
			Logger.info("Incorrect operation");
		}
	}
}
