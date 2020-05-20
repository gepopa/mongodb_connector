package mongodb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import pojos.MongodbBaseTree;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static mongodb.MongoConstants.*;


public class MongoService {

    private static final MongoConnector connector = new MongoConnector(MONGODB_LOCALHOST, MONGODB_LOCALHOST_PORT,
            MONGODB_LOCALHOST_DBNAME, MONGODB_LOCALHOST_COLLECTION_NAME);
    private static final MongoCollection<Document> collection = connector.getCollection();

    public static void addDocument(Document doc) {
        collection.insertOne(doc);
    }

    public static Document getFirstDocument() {
        return collection.find().first();
    }


    public static MongodbBaseTree getMongodbDocument(Document doc, ObjectMapper mapper, String fileName) throws IOException {

        FileWriter file = new FileWriter(fileName);

        try {
            file.write(doc.toJson());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            file.flush();
            file.close();
        }
        return mapper.readValue(new File(fileName), MongodbBaseTree.class);

    }

}
