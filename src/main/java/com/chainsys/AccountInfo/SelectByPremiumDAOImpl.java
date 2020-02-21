package com.chainsys.AccountInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.OtherClass.Connection1;

public class SelectByPremiumDAOImpl {
	public List<String> premiumMembers(String str) throws SQLException, ClassNotFoundException{
		String sql="select email_id from userlogin where user_id in (select user_id from account_info where premium=?)";
		List<String> li=null;
		try(Connection con=Connection1.connection();
				PreparedStatement pst=con.prepareStatement(sql);){
			pst.setString(1, str);
			ResultSet rs=pst.executeQuery();
			li=new ArrayList<>();
			while(rs.next()) {
				li.add(rs.getString("email_id"));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return li;
		
	}
}
