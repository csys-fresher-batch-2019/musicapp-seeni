package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;

public class ForgotPasswordTab1DAOImpl implements ForgotPasswordTab1DAO{
	
	public String passwordChange(String emailId) throws Exception {
		Connection con=Connection1.connection();
		String sql="select password from userlogin where email_id=?";
		Logger.Info(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, emailId);
		ResultSet rs=pst.executeQuery();
		String str="";
		if(rs.next()) {
			str=rs.getString("password");
		}
		Scanner sc=new Scanner(System.in);
		Logger.Info("Original password "+str);
		boolean pass=true;
		boolean pword=true;
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		String[] ch=characters.split("");
		
		while(pass) {
			Logger.Info("Enter your password :");
			String st=sc.next();
			if(str.equals(st)) {
				Logger.Info("You are successfully logged in");
				break;
			}else {
				Logger.Info("Incorrect password");
				Logger.Info("Press 0 for forget Password and 1 for try again and 2 for cancel");
				int num=sc.nextInt();
				if(num==1) {
					pass=true;
				}else if(num==0) {
					 Logger.Info("Enter your registered EmailId : ");
					 String email=sc.next();
					     	 if(emailId.equals(email)) {
							 Random rand=new Random();
							 String u="";
							 for(int i=0;i<7;i++) {
								 int p=rand.nextInt(14);
								 int k=i*p;
									 if(k<=characters.length()) {
										 u=u+ch[k];
									 }
								}Logger.Info("Your Password is "+u);
								while(pword) {
									Logger.Info("Enter your Generated password ");
									String pwd=sc.next();
									if(pwd.equals(u)) {
										Logger.Info("Successfully logged in");
										Logger.Info("Wants to change your generated password");
										Logger.Info("Press 0 for change Password and 1 for continue");
										int number=sc.nextInt();
										if(number==0) {
											Logger.Info("Set new password(Password must be greather than 7 characters) : ");
											String newpass=sc.next();
											Logger.Info("Confirm your password : ");
											String confirmpass=sc.next();
											if(newpass.equals(confirmpass)) {
												Logger.Info("Password successfully changed");
												String sql1="update userlogin set password=? where email_id=?";
												PreparedStatement pst1=con.prepareStatement(sql1);
												Logger.Info(sql1);
												Logger.Info("Your updated password is "+confirmpass);
												pst1.setString(1, confirmpass);
												pst1.setString(2, emailId);
												int row=pst1.executeUpdate();
												Logger.Info("No. of rows updated "+row);
												break;
											}else {
												Logger.Info("Incorrect password");
											}
										}
									}else {
										Logger.Info("Incorrect password");
										Logger.Info("Plesase check your Generated password");
										Logger.Info("press 1 for Re-enter password and 0 for cancel");
										int scan =sc.nextInt();
										if(scan==1) {
											Logger.Info("Re-enter password");
											pword=true;
										}else if(scan==0) {
											Logger.Info("Exit");
											pword=false;
										}else {
											Logger.Info("Incorrect operation");
										}
									}
								}
						 }else {
							 Logger.Info("Invalid EmailId");
						}
					 }else if(num==2){
							Logger.Info("Login cancelled");
							pass=false;
						}else {
							Logger.Info("Invalid operation");
						}
				}break;
			}
		return sql;
	}
}