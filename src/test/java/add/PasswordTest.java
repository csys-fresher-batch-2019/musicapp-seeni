package add;

public class PasswordTest {
	
	public static void main(String[] args) throws Exception {
		
		ForgotPasswordTab1DAO p=new ForgotPasswordTab1DAOImpl();
		p.pwdChange("s@gmail.com");
	}
}
