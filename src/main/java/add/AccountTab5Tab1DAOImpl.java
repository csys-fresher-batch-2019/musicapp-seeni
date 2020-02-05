package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountTab5Tab1DAOImpl implements AccountTab5Tab1DAO{
	public List<String> accountInfo(String str) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		int premiumAmount=400;
		String sql="select username from userlogin where user_id=(select user_id from account_info where wants_to_premium=? and balance>="+premiumAmount+")";
		PreparedStatement pst=con.prepareStatement(sql);
		System.out.println(sql);
		pst.setString(1, str);
		ResultSet rs=pst.executeQuery();
		List<String> li=new ArrayList<String>();
		while(rs.next()) {
			li.add(rs.getString("username"));
		}
		for (String string : li) {
			
			System.out.println(string);
		}
		return li;
	}
	
}
