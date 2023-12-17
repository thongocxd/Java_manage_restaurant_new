package utils;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class FoodUtils {
    public static String getFoodNameFromMongoDB(MongoDatabase database, int foodId) {
        MongoCollection<Document> foodCollection = database.getCollection("food");
        Document foodDocument = foodCollection.find(new Document("foodId", foodId)).first();
        if (foodDocument != null) {
            return foodDocument.getString("foodName");
        } else {
            return "Tên món không xác định";
        }
    }

    public static Integer getFoodPriceFromMongoDB(MongoDatabase database, int foodId) {
        MongoCollection<Document> foodCollection = database.getCollection("food");
        Document foodDocument = foodCollection.find(new Document("foodId", foodId)).first();
        if (foodDocument != null) {
            String priceAsString = foodDocument.getString("price");
            try {
                return Integer.parseInt(priceAsString);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return 0;
        }
    }
}
