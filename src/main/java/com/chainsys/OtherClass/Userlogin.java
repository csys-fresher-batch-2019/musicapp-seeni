package com.chainsys.OtherClass;
public class Userlogin{
	private int userId;
	private String userName;
	private String emailId;
	private String password;
	private Long mobileNo;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
	@Override
	public String toString() {
		return "Userlogin [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + ", mobileNo=" + mobileNo + "]";
	}
	public Userlogin(int userId, String userName, String emailId, String password, Long mobileNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	public Userlogin() {
	
	}
}