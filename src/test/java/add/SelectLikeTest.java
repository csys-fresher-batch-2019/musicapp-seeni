package add;

public class SelectLikeTest {
	public static void main(String[] args) throws Exception {
		SelectByLikeTab2DAO s=new SelectByLikeTab2DAOImpl();
		s.selectByLikeKey("%JAI%");
	}
}
