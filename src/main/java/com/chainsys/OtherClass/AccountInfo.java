package com.chainsys.OtherClass;

public class AccountInfo {
	private String wantsToPrem;
	private long accountNo;
	private int userId;
	private int balance;
	private String premium;
	private int premiumBal;
	
	public String getWantsToPrem() {
		return wantsToPrem;
	}

	public void setWantsToPrem(String wantsToPrem) {
		this.wantsToPrem = wantsToPrem;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public int getPremiumBal() {
		return premiumBal;
	}

	public void setPremiumBal(int premiumBal) {
		this.premiumBal = premiumBal;
	}

	@Override
	public String toString() {
		return "AccountInfo [wantsToPrem=" + wantsToPrem + ", accountNo=" + accountNo + ", userId=" + userId
				+ ", balance=" + balance + ", premium=" + premium + ", premiumBal=" + premiumBal + "]";
	}

	public AccountInfo(String wantsToPrem, long accountNo, int userId, int balance, String premium, int premiumBal) {
		super();
		this.wantsToPrem = wantsToPrem;
		this.accountNo = accountNo;
		this.userId = userId;
		this.balance = balance;
		this.premium = premium;
		this.premiumBal = premiumBal;
	}
	
	
	
}
