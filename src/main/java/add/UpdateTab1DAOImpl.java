package add;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class UpdateTab1DAOImpl implements UpdateTab1DAO{
		public void updatePhoneNo(long phNo,int userid) throws Exception{
			Connection con=Connection1.connection();
			String sql="update userlogin set mobile_no=? where user_id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setLong(1, phNo);
			pst.setInt(2, userid);
			final long in= 6379434293l;
			System.out.println("Enter your number :"+in);
			Scanner s=new Scanner(System.in);
			boolean phoneNum=true;
			while(phoneNum) {
				if(phNo==in) {
					int otp=msg91.msg();
					System.out.println("SMS sent to your mobile number");
					System.out.println("Please Enter your OTP ");
					int num=s.nextInt();
					if(otp==num) {
						System.out.println("Phone number is successfully updated ");
						System.out.println("Updated Phone number is "+phNo);
						int row=pst.executeUpdate();
						System.out.println("No. of rows updated = "+row);
						break;
					}
					else if(otp!=num) {
						System.out.println("Wrong OTP");
						System.out.print("Press 1 for resend OTP and 0 to quit: ");
						int n=s.nextInt();
						if(n==0) {
							phoneNum=false;
							System.out.println("Check your mobile number");
						}else if(n==1) {
							continue;
						}else {
							System.out.println("Incorrect operation");
						}
					}
				}else {
					System.out.println("Please check your number");						
				}
			break;
		}
		pst.close();
		con.close();
	}

}