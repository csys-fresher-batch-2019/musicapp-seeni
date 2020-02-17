package com.chainsys.UserLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import add.Connection1;

public class ForgotPassword {
	public static String pwdChange(String emailId) throws SQLException, ClassNotFoundException {
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		Connection con=Connection1.connection();
		String[] ch=characters.split("");
		Random rand=new Random();
		String u="";
		for(int i=0;i<7;i++) {
			int p=rand.nextInt(14);
			int k=i*p;
			if(k<=characters.length()) {
				u+=ch[k];
			}
		}System.out.println(u);
		String sql="update userlogin set password=? where email_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, u);
		pst.setString(2, emailId);
		int rows=pst.executeUpdate();
		System.out.println("No. of rows updated :"+rows);
		return u;
	}
	public boolean newPassUpdate(String newPassword,String email) throws ClassNotFoundException, SQLException {
		Connection con=Connection1.connection();
		String sql="update userlogin set password=? where email_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, newPassword);
		pst.setString(2, email);
		int rows=pst.executeUpdate();
		System.out.println("No. of rows updated "+rows);
		return true;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	pwdChange("s@gmail.com");
	}
}
