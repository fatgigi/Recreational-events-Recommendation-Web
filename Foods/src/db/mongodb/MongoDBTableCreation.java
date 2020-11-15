package db.mongodb;

import java.text.ParseException;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.IndexOptions;

public class MongoDBTableCreation {
// Run as Java application to create MongoDB collections with index.
	public static void main(String[] args) throws ParseException {
		// Step 1, connetion to MongoDB
		MongoClient mongoClient = new MongoClient();
		MongoDatabase db = mongoClient.getDatabase(MongoDBUtil.DB_NAME);
		//MongoDatabase db = mongoClient.getDatabase(MongoDBUtil.URL);
		// Step 2, remove old collections.
		db.getCollection("users").drop();
		db.getCollection("items").drop();
		
		// Step 3, create new collections
		IndexOptions options = new IndexOptions().unique(true);
		db.getCollection("users").createIndex(new Document("user_id", 1), options);
		
		// Step 4, insert fake user data and create index.
		db.getCollection("users").insertOne(
				new Document().append("user_id", "1111").append("password", "cc9284597026dcc021735c0970ca0c93")
						.append("first_name", "John").append("last_name", "Smith"));
		mongoClient.close();
		System.out.println("Import is done successfully.");
	}
}