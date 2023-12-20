package view;
import utils.FoodUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.util.ArrayList;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.Document;
import javax.swing.*;
import org.bson.types.ObjectId;
import org.bson.types.ObjectId;
import view.GoiMon;
import view.DatBan;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.UpdateOptions;
import java.awt.print.PrinterException;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import java.io.InputStream;
import java.text.Normalizer;
/**
 *
 * @author kevin
 */
public class ThanhToan extends javax.swing.JFrame {
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel tablePanel;
    private int table_Number;
    
    // Assuming you have a valid ObjectId to pass
    ObjectId someObjectId = new ObjectId(); // Example ObjectId, replace with a valid one

    // Create an instance of DatBan with the idBill
    
    DatBan datBanInstance = new DatBan();
    
    public ObjectId getIdBill(){
    return idBill;
    }
    

    // Now you can call getIdBill() on this instance
    ObjectId idBill = datBanInstance.getIdBill();

    /**
     * Creates new form ThanhToan
     */
    public ThanhToan() {
        initComponents();
          // Kết nối tới cơ sở dữ liệu MongoDB và lấy dữ liệu từ collection "bill"
        displayBillInfoInTextField();
    }
    public ThanhToan(int table_Number, ObjectId idBill) {
        this.table_Number = table_Number;
        this.idBill = idBill; // Đảm bảo rằng idBill đã được khởi tạo
        initComponents();
        displayBillInfoInTextField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 40, 278, 224));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Xác nhận thanh toán");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 323, 170, 40));

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setText("Hủy");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 323, 90, 40));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 276, 167, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tổng tiền:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 281, 93, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("HÓA ĐƠN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // Connect to MongoDB database
            com.mongodb.client.MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
            MongoDatabase database = mongoClient.getDatabase("restaurant");
            MongoCollection<Document> billCollection = database.getCollection("bill");
            MongoCollection<Document> tableCollection = database.getCollection("table");
            Document billDocument = billCollection.find(new Document("idBill", this.idBill)).first();
            int totalPrice = calculateTotalPrice(database, billDocument);

            // Confirm payment with the user
            int confirm = JOptionPane.showConfirmDialog(this, "Xác nhận thanh toán tổng cộng: " + totalPrice + " VND?", "Xác Nhận Thanh Toán", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Update payment status in the database
                Document updatedValues = new Document("bill.total_price", totalPrice).append("payment_status", "paid");
                Document updateOperation = new Document("$set", updatedValues);
                billCollection.updateOne(Filters.eq("idBill", this.idBill), updateOperation);

                // Update table status to "Ban Trong"
                int tableNumber = billDocument.getInteger("table_number");
                tableCollection.updateOne(Filters.eq("table_number", tableNumber), new Document("$set", new Document("trangthai", "Ban Trong")));

                // Notify user about the payment update
                JOptionPane.showMessageDialog(this, "Thanh toán thành công và đã cập nhật trong cơ sở dữ liệu.");

                // Ask user if they want to print the bill
                int print = JOptionPane.showConfirmDialog(this, "Bạn có muốn in hóa đơn không?", "In Hóa Đơn", JOptionPane.YES_NO_OPTION);
                if (print == JOptionPane.YES_OPTION) {
                    // Generate and save the bill as a PDF
                    generatePDFBill(billDocument, totalPrice);
                }

                // Close the current window and open the DatBan window
                this.dispose();
                DatBan datBanForm = new DatBan();
                datBanForm.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            // Close the current ThanhToan form
    this.dispose();

    // Create an instance of the DatBan form
    GoiMon goiMonForm = new GoiMon();

    // Make the DatBan form visible
    goiMonForm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void generatePDFBill(Document billDocument, int totalPrice) {
        // Connect to MongoDB database
    com.mongodb.client.MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
    MongoDatabase database = mongoClient.getDatabase("restaurant");
    MongoCollection<Document> billCollection = database.getCollection("bill");
    try (PDDocument document = new PDDocument()) {
        PDPage page = new PDPage();
        document.addPage(page);

        try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
            contentStream.beginText();
            contentStream.setFont(PDType1Font.COURIER_BOLD, 14);
            contentStream.setLeading(14.5f);
            contentStream.newLineAtOffset(25, 750);

            // Restaurant Name and Address
            contentStream.showText("Nha Hang PKNQ");
            contentStream.newLine();
            contentStream.showText("Dia chi: 273 An Duong Vuong, Phuong 3, Quan 5, TP. HCM");
            contentStream.newLine();
            contentStream.newLine();

            // Bill Title
            contentStream.setFont(PDType1Font.COURIER_BOLD, 18);
            contentStream.showText("HOA DON THANH TOAN");
            contentStream.newLine();
            contentStream.newLine();

            // Bill Information
            contentStream.setFont(PDType1Font.COURIER, 12);
            contentStream.showText("Ma hoa don: " + billDocument.getObjectId("idBill").toHexString());
            contentStream.newLine();
            contentStream.showText("So ban: " + billDocument.getInteger("table_number"));
            contentStream.newLine();
            Document billSubDocument = (Document) billDocument.get("bill");
            String billDate = billSubDocument.getString("bill_date");
            contentStream.showText("Ngay gio: " + billDate);
            contentStream.newLine();
            contentStream.newLine();

            // Column Titles
            contentStream.showText(String.format("%-20s %-10s %-10s %-10s", "Ten mon", "So luong", "Don gia", "Thanh tien"));
            contentStream.newLine();

            // Order Items
            List<Document> orderList = (List<Document>) billDocument.get("order");
            for (Document item : orderList) {
                String foodName = FoodUtils.getFoodNameFromMongoDB(database, item.getInteger("foodId"));
                foodName = removeDiacritics(foodName);
                int quantity = item.getInteger("quantity");
                int unitPrice = FoodUtils.getFoodPriceFromMongoDB(database, item.getInteger("foodId"));
                int lineTotal = quantity * unitPrice;

                contentStream.showText(String.format("%-20s %-10d %-10d %-10d", foodName, quantity, unitPrice, lineTotal));
                contentStream.newLine();
            }

            // Total
            contentStream.newLine();
            contentStream.showText(String.format("%-20s %-10s %-10s %-10d", "Tong:", "", "", totalPrice));
            contentStream.newLine();
            contentStream.newLine();

            // Thank You Note
            contentStream.showText("Cam on quy khach da su dung dich vu cua chung toi!");
            contentStream.endText();
        }

        document.save("Bill.pdf");
        JOptionPane.showMessageDialog(this, "Hoa don da duoc luu: Bill.pdf");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Loi khi tao hoa don PDF: " + e.getMessage());
    }
}

    
    public static String removeDiacritics(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{M}", "");
    }

    private void displayBillInfoInTextField() {
    try {
        com.mongodb.client.MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> collection = database.getCollection("bill");

        Document billDocument = collection.find(new Document("idBill", this.idBill)).first();

        if (billDocument != null) {
            StringBuilder billInfo = new StringBuilder();
            StringBuilder billTotal = new StringBuilder();

            // Extracting and formatting each field
            Document bill = (Document) billDocument.get("bill");
            List<Document> order = (List<Document>) billDocument.get("order");
            
            billInfo.append("Bill ID: ").append(billDocument.getObjectId("idBill").toHexString()).append("\n");
            billInfo.append("Table Number: ").append(billDocument.getInteger("table_number")).append("\n");
            billInfo.append("Bill Date: ").append(bill.get("bill_date")).append("\n");
            billInfo.append("Order Details:\n");
            
            
            int maxWidth = 278; // Độ dài tối đa cho mỗi dòng

            for (Document item : order) {
                int foodId = item.getInteger("foodId");
                int quantity = item.getInteger("quantity");

                String foodName = FoodUtils.getFoodNameFromMongoDB(database, foodId);
                int foodPrice = FoodUtils.getFoodPriceFromMongoDB(database, foodId);
                int totalPrice = foodPrice * quantity;

                // Tạo một chuỗi định dạng cho món ăn
                String formattedLine = String.format("   Món: %-20s x%-10d %6d VND", foodName, quantity, totalPrice);

                // Cắt chuỗi nếu quá dài
                if (formattedLine.length() > maxWidth) {
                    formattedLine = formattedLine.substring(0, maxWidth);
                }

                // Thêm vào thông tin hóa đơn
                billInfo.append(formattedLine).append("\n");
                
            }
            billTotal.append(" ").append(calculateTotalPrice(database,billDocument)).append(" VND");                

            
            // Setting the text to jTextField
            jTextArea1.setText(billInfo.toString());
            jTextField2.setText(billTotal.toString());
        } else {
            jTextArea1.setText("Bill not found");
        }
    } catch (Exception e) {
        e.printStackTrace();
        jTextArea1.setText("Error connecting to MongoDB: " + e.getMessage());
    }
}   
    
       // You need to implement this method to calculate the total price based on the ordered items
    private int calculateTotalPrice(MongoDatabase database, Document billDocument) {
        int totalPrice = 0;

        List<Document> orderList = (List<Document>) billDocument.get("order");
        if (orderList != null && !orderList.isEmpty()) {
            for (Document order : orderList) {
                Integer foodId = order.getInteger("foodId");
                Integer quantity = order.getInteger("quantity");

                if (foodId != null && quantity != null) {
                    int foodPrice = FoodUtils.getFoodPriceFromMongoDB(database, foodId);
                    totalPrice += foodPrice * quantity;
                } else {
                    // Handle the case where foodId or quantity is null
                    System.err.println("Invalid data in the order.");
                    return 0; // Or handle it in an appropriate way
                }
            }
        }

        return totalPrice;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
