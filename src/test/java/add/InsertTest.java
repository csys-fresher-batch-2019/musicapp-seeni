package add;

public class InsertTest {
	public static void main(String[] args) throws Exception {
		
		SongList t1=new SongList();
		InsertTab2DAO i=new InsertTab2DAOImpl();
		i.insertSong(t1);
		
	}
}


