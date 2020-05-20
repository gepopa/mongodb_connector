import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.Document;
import org.bson.types.ObjectId;
import pojos.MongodbBaseTree;

import java.io.IOException;
import java.util.Date;


import static json.Json.getObjectMapper;
import static mongodb.MongoService.*;
import static utils.FormattingUtils.getTimestampToIsoDate;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
         * Add new document in mongodb
         */

        Date date = new Date();
        Document doc = new Document("name", "Document Name")
                .append("type", "database")
                .append("processed", false)
                .append("processRequested", date)
                .append("createdBy", "Firstname Lastname")
                .append("blob", "11052020163528_categories-images2.csv")
                .append("code", "X_FtkLDYF9S76tBnvYNBAe");
        addDocument(doc);

        /*
         * Get the first document in mongodb
         */
        Document getDoc = getFirstDocument();

        /*
         * Get object mapper
         */
        ObjectMapper mapper = getObjectMapper();

        /*
         * Get the DocumentID and save it to jsonDocument.txt
         */
        MongodbBaseTree pojo = getMongodbDocument(getDoc, mapper,"src/main/java/mongodb/files/jsonDocument.txt");
        System.out.println(pojo.getId().get$oid());

        /*
         * Get timestamp from DocumentID
         */
        String id = pojo.getId().get$oid();
        ObjectId objectId = new ObjectId(id);
        System.out.println(objectId.getTimestamp());

        /*
         * Transform timestamp from DocumentID to Formatted Date
         */
        System.out.println(getTimestampToIsoDate(objectId.getTimestamp()));


    }
}
