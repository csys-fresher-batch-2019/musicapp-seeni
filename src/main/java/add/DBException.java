package add;

public class DBException extends Exception{
	public String message;
	public DBException(String message) {
		super(message);
	}
	public String getMessage() {
		return message;
	}
}

