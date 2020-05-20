package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoConnector {

    private final String dbUrl;
    private final int dbPort;
    private final String dbName;
    private final String dbCollectionName;

    public MongoConnector(String dbUrl, int dbPort, String dbName, String dbCollectionName) {
        this.dbUrl = dbUrl;
        this.dbPort = dbPort;
        this.dbName = dbName;
        this.dbCollectionName = dbCollectionName;
    }

    public MongoClient getClient(){
        return new MongoClient( dbUrl , dbPort );
    }

    public MongoDatabase getDatabase() {
        return getClient().getDatabase(dbName);
    }

    public MongoCollection<Document> getCollection() {
        return getDatabase().getCollection(dbCollectionName);
    }
}
