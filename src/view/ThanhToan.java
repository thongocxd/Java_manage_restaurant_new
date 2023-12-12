package view;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ThanhToan extends JFrame {
    private JTextArea billTextArea;
    private JButton confirmPaymentButton;

    // Hàm khởi tạo
    public ThanhToan() {
        setTitle("Hóa đơn");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo các thành phần giao diện
        billTextArea = new JTextArea();
        confirmPaymentButton = new JButton("Xác nhận thanh toán");

        // Đặt layout cho frame
        setLayout(new BorderLayout());

        // Thêm các thành phần vào frame
        add(new JScrollPane(billTextArea), BorderLayout.CENTER);
        add(confirmPaymentButton, BorderLayout.SOUTH);

        // Gán sự kiện cho nút xác nhận thanh toán
        confirmPaymentButton.addActionListener(e -> confirmPayment());
    }

    // Hàm để hiển thị thông tin hóa đơn
    public void displayBill(String billInfo) {
        billTextArea.setText(billInfo);
    }

    
    // Hàm xác nhận thanh toán
private void confirmPayment() {
//    MongoClient mongoClient = null;
//    try {
//        mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
//        MongoDatabase database = mongoClient.getDatabase("restaurant");
//        MongoCollection<Document> billCollection = database.getCollection("bill");
//
//        // Retrieve the current bill document
//        Document currentBillDocument = billCollection.find(new Document("_id", new ObjectId("6577d6c2c7df30a99362a18a"))).first();
//
//        if (currentBillDocument != null) {
//            // Update payment_status to "paid"
//            currentBillDocument.put("payment_status", "paid");
//
//            // Get the total price
//            int totalPrice = calculateTotalPrice(database, currentBillDocument);
//
//            // Update total_price
//            currentBillDocument.put("total_price", totalPrice);
//
//            // Update the document in MongoDB
//            billCollection.replaceOne(new Document("_id", currentBillDocument.getObjectId("_id")), currentBillDocument);
//
//            // Display the updated bill information
//            displayBill(getBillInfoFromMongoDB());
//        } else {
//            // Handle the case where the current bill document is not found
//            System.err.println("No current bill document found.");
//        }
//    } catch (Exception e) {
//        e.printStackTrace(); // Handle the exception appropriately (log it, show a message, etc.)
//    } finally {
//        if (mongoClient != null) {
//            mongoClient.close();
//        }
//    }
}

    // You need to implement this method to calculate the total price based on the ordered items
//    private int calculateTotalPrice(MongoDatabase database, Document billDocument) {
//        int totalPrice = 0;
//
//        List<Document> orderList = (List<Document>) billDocument.get("order");
//        if (orderList != null && !orderList.isEmpty()) {
//            for (Document order : orderList) {
//                Integer foodId = order.getInteger("foodId");
//                Integer quantity = order.getInteger("quantity");
//
//                if (foodId != null && quantity != null) {
//                    Integer foodPrice = getFoodPriceFromMongoDB(database, foodId);
//                    totalPrice += foodPrice * quantity;
//                } else {
//                    // Handle the case where foodId or quantity is null
//                    System.err.println("Invalid data in the order.");
//                    return 0; // Or handle it in an appropriate way
//                }
//            }
//        }
//
//        return totalPrice;
//    }
//
//    
//
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ThanhToan billPage = new ThanhToan();

            // Lấy dữ liệu từ MongoDB và hiển thị
            String billInfo = getBillInfoFromMongoDB();
            billPage.displayBill(billInfo);

            billPage.setVisible(true);
        });
    }


    private static String getBillInfoFromMongoDB() {
    MongoClient mongoClient = null;
    try {
        // Kết nối tới MongoDB
        mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("restaurant");

        // Lấy bảng bill từ MongoDB
        MongoCollection<Document> billCollection = database.getCollection("bill");

        // Thực hiện truy vấn để lấy dữ liệu hóa đơn (ví dụ)
        Document billDocument = billCollection.find(new Document("_id", new ObjectId("65783d4b3908780de642d77c"))).first();

        // Lấy thông tin từ Document và hiển thị nó
        if (billDocument != null) {
            String billId = billDocument.getObjectId("_id").toString();
            int tableNumber = billDocument.getInteger("table_number");
            Document billInfo = billDocument.get("bill", Document.class);
            String billDate = billInfo.getString("bill_date");
            String paymentStatus = billDocument.getString("payment_status");

            // Lấy danh sách món ăn từ mảng order
            List<Document> orderList = (List<Document>) billDocument.get("order");

            // Kiểm tra xem orderList có tồn tại hay không
            if (orderList != null && !orderList.isEmpty()) {
                // Tạo danh sách thông tin món
                StringBuilder orderInfoBuilder = new StringBuilder("Danh sách món:\n");
                int totalPrice = 0; // Tổng giá tiền

                for (Document order : orderList) {
                    Integer foodId = order.getInteger("foodId");
                    Integer quantity = order.getInteger("quantity");

                    // Kiểm tra xem foodId và quantity có tồn tại hay không
                    if (foodId != null && quantity != null) {
                        // Lấy thông tin món từ collection "food"
                        String foodName = getFoodNameFromMongoDB(database, foodId);
                        Integer foodPrice = getFoodPriceFromMongoDB(database, foodId);

                        // Thêm thông tin món vào danh sách
                        orderInfoBuilder.append(String.format("  - Món: %s (x%d) - Giá: %d VND\n", foodName, quantity.intValue(), foodPrice * quantity));

                        // Cộng dồn giá tiền
                        totalPrice += foodPrice * quantity;
                    } else {
                        // Xử lý khi foodId hoặc quantity là null
                        return "Dữ liệu không đầy đủ trong đơn hàng";
                    }
                }

                // Hiển thị thông tin hóa đơn
                return String.format("Mã hóa đơn: %s\nBàn số: %d\nNgày hóa đơn: %s\n%sTổng tiền: %d VND\nTrạng thái thanh toán: %s",
                        billId, tableNumber, billDate, orderInfoBuilder.toString(), totalPrice, paymentStatus);
            } else {
                // Xử lý khi không có thông tin trong orderList
                return "Không có thông tin đơn hàng trong hóa đơn";
            }
        } else {
            return "Không tìm thấy hóa đơn";
        }
    } catch (Exception e) {
        e.printStackTrace(); // Handle the exception appropriately (log it, show a message, etc.)
        return "Lỗi khi lấy dữ liệu từ MongoDB";
    } finally {
        if (mongoClient != null) {
            mongoClient.close(); // Close the MongoClient in the finally block to release resources
        }
    }
}

    
    // Hàm để lấy tên món từ MongoDB dựa trên foodId
    private static String getFoodNameFromMongoDB(MongoDatabase database, int foodId) {
        MongoCollection<Document> foodCollection = database.getCollection("food");

        // Thực hiện truy vấn để lấy dữ liệu món ăn
        Document foodDocument = foodCollection.find(new Document("foodId", foodId)).first();

        // Lấy tên món từ Document
        if (foodDocument != null) {
            return foodDocument.getString("foodName");
        } else {
            return "Tên món không xác định";
        }
    }
    
  // Hàm để lấy giá món từ MongoDB dựa trên foodId
private static Integer getFoodPriceFromMongoDB(MongoDatabase database, int foodId) {
    MongoCollection<Document> foodCollection = database.getCollection("food");

    // Thực hiện truy vấn để lấy dữ liệu món ăn
    Document foodDocument = foodCollection.find(new Document("foodId", foodId)).first();

    // Lấy giá món từ Document
    if (foodDocument != null) {
        String priceAsString = foodDocument.getString("price");

        // Convert string price to Integer
        try {
            return Integer.parseInt(priceAsString);
        } catch (NumberFormatException e) {
            // Handle the case where the price is not a valid integer
            e.printStackTrace(); // Log the exception or handle it according to your needs
            return 0; // Return a default value or throw an exception as appropriate
        }
    } else {
        return 0; // Giá mặc định khi không tìm thấy giá món
    }
}


}