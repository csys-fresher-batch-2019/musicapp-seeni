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
			int premiumAmount=400;
			String sql="select username from userlogin where user_id in (select user_id from account_info where wants_to_premium=? and balance>="+premiumAmount+")";
			try(Connection con=Connection1.connection();
					PreparedStatement pst=con.prepareStatement(sql);)
			{
			Logger.Info(sql);
			pst.setString(1, str);
				try(ResultSet rs=pst.executeQuery();){
				li = new ArrayList<String>();
				while(rs.next()) {
					li.add(rs.getString("username"));
				}
			}catch(Exception e) {
				Logger.error(e);
			}
			for (String string : li) {
				Logger.Info(string);
			}pst.close();
		} catch (Exception e) {
			Logger.error(e.getMessage());
		}
		return li;
	}
}
