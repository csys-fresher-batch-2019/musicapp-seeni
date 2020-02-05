package add;
import java.util.ArrayList;
import java.util.List;

public class UserChoice {
	
	@Override
	public String toString() {
		return "UserChoice [userId=" + userId + ", songSequence=" + songSequence + ", songRating=" + songRating
				+ ", button=" + button + ", songWantsToPlay=" + songWantsToPlay + ", addToFavourites=" + addToFavourites
				+ ", premiumAmount=" + premiumAmount + "]";
	}

	public int userId;
	public String songSequence;
	public int songRating;
	public String button;
	public int songWantsToPlay;
	public String addToFavourites;
	public int premiumAmount;
	
	
}
