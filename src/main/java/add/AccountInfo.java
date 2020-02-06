package add;

public class AccountInfo {
	String wantsToPrem;
	public long accountNo;
	public int userId;
	public int balance;
	public String premium;
	public int premiumBal;
	
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
