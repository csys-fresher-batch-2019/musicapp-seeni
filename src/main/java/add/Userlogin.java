package add;
public class Userlogin{
	public int userId;
	public String userName;
	public String emailId;
	public String password;
	public Long mobileNo;
	@Override
	public String toString() {
		return "Userlogin [user_id=" + userId + ", userName=" + userName + ", email_id=" + emailId + ", password="
				+ password + ", mobileNo=" + mobileNo + "]";
	}
	public Userlogin(int userId, String userName, String email_id, String password, Long mobileNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = email_id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public Userlogin() {
	
	}
}