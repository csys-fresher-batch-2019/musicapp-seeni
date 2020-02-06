package add;

public class Logger {
	/*public static Logger getInstanceOf() {
		Logger logger =new Logger();
		return logger;
	}*/
	public static void Info(Object message) {
		System.out.println(message);
	}
	public static void warn(Object message) {
		System.out.println(message);
	}
	public static void error(Object message) {
		System.err.println(message);
	}
}
