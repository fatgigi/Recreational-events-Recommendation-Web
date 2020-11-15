package db.mongodb;

public class MongoDBUtil {
	private static final String HOSTNAME = "localhost";
	private static final String PORT_NUM = "8081"; // change it to your mysql port number
	public static final String DB_NAME = "foodproject";
	public static final String URL = HOSTNAME + ":" + PORT_NUM + "/db/" + DB_NAME;
}
