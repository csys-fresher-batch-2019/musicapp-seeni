package add;

public class PasswordTest {
	
	public static void main(String[] args) throws Exception {
		
		ForgotPasswordTab1DAO p=new ForgotPasswordTab1DAOImpl();
		p.passwordChange("s@gmail.com");
	}
}
