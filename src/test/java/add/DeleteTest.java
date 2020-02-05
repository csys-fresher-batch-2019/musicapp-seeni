package add;

import java.util.Scanner;

public class DeleteTest {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the song number = ");
		int num=sc.nextInt();
		DeleteTab2DAO d=new DeleteTab2DAOImpl();
		d.delRow(4);
	}
}
