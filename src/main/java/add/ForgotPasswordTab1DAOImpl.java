package add;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class ForgotPasswordTab1DAOImpl implements ForgotPasswordTab1DAO{
	private static final String incorrectPwd="Incorrect password";
	
	public String pwdChange(String emailId) throws SQLException, ClassNotFoundException {
		
		String sql="select password from userlogin where email_id=?";
		Logger.info(sql);
		try(Connection con=Connection1.connection();
				PreparedStatement pst=con.prepareStatement(sql);){
		
		pst.setString(1, emailId);
		ResultSet rs=pst.executeQuery();
		String str="";
		if(rs.next()) {
			str=rs.getString("password");
		}
		Scanner sc=new Scanner(System.in);
		Logger.info("Original password "+str);
		boolean pass=true;
		boolean pword=true;
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		String[] ch=characters.split("");
		
		while(pass) {
			Logger.info("Enter your password :");
			String st=sc.next();
			if(str.equals(st)) {
				Logger.info("You are successfully logged in");
				pass=false;
			}else {
				Logger.info(incorrectPwd);
				Logger.info("Press 0 for forget Password and 1 for try again and 2 for cancel");
				int num=sc.nextInt();
				if(num==0) {
					 Logger.info("Enter your registered EmailId : ");
					 String email=sc.next();
					     	 if(emailId.equals(email)) {
							 Random rand=new Random();
							 StringBuilder u=new StringBuilder();
							 for(int i=0;i<7;i++) {
								 int p=rand.nextInt(14);
								 int k=i*p;
									 if(k<=characters.length()) {
										 u.append(ch[k]);
									 }
								}Logger.info("Your Password is "+u);
								while(pword) {
									Logger.info("Enter your Generated password ");
									String pwd=sc.next();
									if(pwd.contentEquals(u)) {
										Logger.info("Successfully logged in");
										Logger.info("Wants to change your generated password");
										Logger.info("Press 0 for change Password and 1 for continue");
										int number=sc.nextInt();
										if(number==0) {
											Logger.info("Set new password(Password must be greather than 7 characters) : ");
											String newpass=sc.next();
											Logger.info("Confirm your password : ");
											String confirmpass=sc.next();
											Logger.info(newpass);
											Logger.info(confirmpass);
											if(newpass.equals(confirmpass)) {
												Logger.info("Password successfully changed");
												String sql1="update userlogin set password=? where email_id=?";
												PreparedStatement pst1=con.prepareStatement(sql1);
												Logger.info(sql1);
												Logger.info("Your updated password is "+confirmpass);
												pst1.setString(1, confirmpass);
												pst1.setString(2, emailId);
												int row=pst1.executeUpdate();
												Logger.info("No. of rows updated "+row);
												pword=false;
											}else {
												Logger.info(incorrectPwd);
											}
										}
									}else {
										Logger.info(incorrectPwd);
										Logger.info("Plesase check your Generated password");
										Logger.info("press 1 for Re-enter password and 0 for cancel");
										int scan =sc.nextInt();
										if(scan==1) {
											Logger.info("Re-enter password");
											pword=true;
										}else if(scan==0) {
											Logger.info("Exit");
											pword=false;
										}else {
											Logger.info("Incorrect operation");
										}
									}
								}
						 }else {
							 Logger.info("Invalid EmailId");
						}
					 }else if(num==2){
							Logger.info("Login cancelled");
							
						}else {
							Logger.info("Invalid operation");
						}
				}break;
			}
		}catch(Exception e) {
				Logger.error(e);
		}
		return sql;
	}
}