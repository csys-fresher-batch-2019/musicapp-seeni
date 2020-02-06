package add;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTab1DAOImpl implements UpdateTab1DAO{
		public void updatePhoneNo(long phNo,int userid)  throws ClassNotFoundException, SQLException{
			Connection con=Connection1.connection();
			String sql="update userlogin set mobile_no=? where user_id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setLong(1, phNo);
			pst.setInt(2, userid);
			final long in= 6379434293l;
			Logger.info("Enter your number :"+in);
			Scanner s=new Scanner(System.in);
			boolean phoneNum=true;
			while(phoneNum) {
				if(phNo==in) {
					int otp=Msg91.msg();
					Logger.info("SMS sent to your mobile number");
					Logger.info("Please Enter your OTP ");
					int num=s.nextInt();
					if(otp==num) {
						Logger.info("Phone number is successfully updated ");
						Logger.info("Updated Phone number is "+phNo);
						int row=pst.executeUpdate();
						Logger.info("No. of rows updated = "+row);
						phoneNum=false;
					}
					else {
						Logger.info("Wrong OTP");
						Logger.info("Press 1 for resend OTP and 0 to quit: ");
						int n=s.nextInt();
						if(n==0) {
							Logger.info("Check your mobile number");
						}else if(n==1) {
							continue;
						}else {
							Logger.info("Incorrect operation");
						}
					}
				}else {
					Logger.info("Please check your number");						
				}
			break;
		}
		pst.close();
		con.close();
	}

}