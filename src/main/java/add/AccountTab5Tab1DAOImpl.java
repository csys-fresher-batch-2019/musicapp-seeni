package add;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountTab5Tab1DAOImpl implements AccountTab5Tab1DAO{
	public List<Object> accountInfo(String str){
		List<Object> li=null;
			int premiumAmount=400;
			String sql="select username from userlogin where user_id in (select user_id from account_info where wants_to_premium=? and balance>="+premiumAmount+")";
			try(Connection con=Connection1.connection();
					PreparedStatement pst=con.prepareStatement(sql);)
			{
			Logger.info(sql);
			pst.setString(1, str);
				li = nestTry(li, pst);
			for (Object string : li) {
				Logger.info(string);
			}
		} catch (Exception e) {
			Logger.error(e.getMessage());
		}
		return li;
	}

	private List<Object> nestTry(List<Object> li, PreparedStatement pst) {
		try(ResultSet rs=pst.executeQuery();){
		li = new ArrayList<Object>();
		while(rs.next()) {
			li.add(rs.getString("username"));
		}
		}catch(Exception e) {
		Logger.error(e);
		}
		return li;
	}
}
