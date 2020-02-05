package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;

public class ForgotPasswordTab1DAOImpl implements ForgotPasswordTab1DAO{
	
	public String passwordChange(String emailId) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		String sql="select password from userlogin where email_id=?";
		System.out.println(sql);
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, emailId);
		ResultSet rs=pst.executeQuery();
		String str="";
		if(rs.next()) {
			str=rs.getString("password");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Original password "+str);
		boolean pass=true;
		boolean pword=true;
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		String[] ch=characters.split("");
		
		while(pass) {
			System.out.print("Enter your password :");
			String st=sc.next();
			if(str.equals(st)) {
				System.out.println("You are successfully logged in");
				break;
			}else {
				System.out.println("Incorrect password");
				System.out.println("Press 0 for forget Password and 1 for try again and 2 for cancel");
				int num=sc.nextInt();
				if(num==1) {
					pass=true;
				}else if(num==0) {
					 System.out.println("Enter your registered EmailId : ");
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
								}System.out.println("Your Password is "+u);
								while(pword) {
									System.out.println("Enter your Generated password ");
									String pwd=sc.next();
									if(pwd.equals(u)) {
										System.out.println("Successfully logged in");
										System.out.println("Wants to change your generated password");
										System.out.println("Press 0 for change Password and 1 for continue");
										int number=sc.nextInt();
										if(number==0) {
											System.out.println("Set new password(Password must be greather than 7 characters) : ");
											String newpass=sc.next();
											System.out.println("Confirm your password : ");
											String confirmpass=sc.next();
											if(newpass.equals(confirmpass)) {
												System.out.println("Password successfully changed");
												String sql1="update userlogin set password=? where email_id=?";
												PreparedStatement pst1=con.prepareStatement(sql1);
												System.out.println(sql1);
												System.out.println("Your updated password is "+confirmpass);
												pst1.setString(1, confirmpass);
												pst1.setString(2, emailId);
												int row=pst1.executeUpdate();
												System.out.print("No. of rows updated "+row);
												break;
											}else {
												System.out.println("Incorrect password");
											}
										}
									}else {
										System.out.println("Incorrect password");
										System.out.println("Plesase check your Generated password");
										System.out.println("press 1 for Re-enter password and 0 for cancel");
										int scan =sc.nextInt();
										if(scan==1) {
											System.out.println("Re-enter password");
											pword=true;
										}else if(scan==0) {
											System.out.println("Exit");
											pword=false;
										}else {
											System.out.println("Incorrect operation");
										}
									}
								}
						 }else {
							 System.out.println("Invalid EmailId");
						}
					 }else if(num==2){
							System.out.println("Login cancelled");
							pass=false;
						}else {
							System.out.println("Invalid operation");
						}
				}break;
			}
		return sql;
	}
}