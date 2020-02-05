package add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	public boolean register(Userlogin a) throws Exception {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Id ");
		int userId=sc.nextInt();
		a.userId=userId;
		System.out.println("Enter user name ");
		String userName=sc.next();
		a.userName=userName;
		System.out.println("Enter EmailID ");
		String emailId=sc.next();
		a.emailId=emailId;
		System.out.println("Enter Password ");
		String password=sc.next();
		a.password=password;
		System.out.println("Enter Mobile Number ");
		Long mobileNo=sc.nextLong();
		a.mobileNo=mobileNo;
		*/
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CSLH2013:1521:XE", "system", "oracle");
		String sql="insert into userlogin(user_id,username,email_id,password,mobile_no) values("+a.userId+",'"+a.userName+"','"+a.emailId+"','"+a.password+"',"+a.mobileNo+")";
		boolean insertion=true;
		if (insertion) {
			Statement st = con.createStatement();
			int row = st.executeUpdate(sql);
			System.out.println("Number of rows inserted " + row);
			return true;
		}else {
			return false;
		}
	}
}