package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountTab5Tab1DAOImpl implements AccountTab5Tab1DAO{
	public List<String> accountInfo(String str) throws Exception{
		List<String> li=null;
		ResultSet rs=null;

			int premiumAmount=400;
			String sql="select username from userlogin where user_id in (select user_id from account_info where wants_to_premium=? and balance>="+premiumAmount+")";
			try(Connection con=Connection1.connection())
			{
			System.out.println(sql);
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, str);
			rs=pst.executeQuery();
			li = new ArrayList<String>();
			while(rs.next()) {
				li.add(rs.getString("username"));
			}rs.close();
			for (String string : li) {
				System.out.println(string);
			}pst.close();
			con.close();
		} catch (Exception e) {
			Logger.error(e.getMessage());
		}
		
		return li;
		
	}
	
}
