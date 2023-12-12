/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.*;
/**
 *
 * @author kevin
 */
public class ThanhToan1 extends javax.swing.JFrame {

    /**
     * Creates new form ThanhToan1
     */
    public ThanhToan1() {
        initComponents();
          // Kết nối tới cơ sở dữ liệu MongoDB và lấy dữ liệu từ collection "bill"
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

        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void displayBillInfoInTextField() {
    try {
        com.mongodb.client.MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> collection = database.getCollection("bill");

        // Lấy một bản ghi từ collection "bill" (điều này phải được điều chỉnh cho phù hợp)
        Document billDocument = collection.find(new Document("_id", new org.bson.types.ObjectId("65783d4b3908780de642d77c"))).first();

        if (billDocument != null) {
            // Lấy dữ liệu từ Document và hiển thị nó trong jTextField1
            String billInfo = billDocument.toJson();
            jTextField1.setText(billInfo);
        } else {
            // Xử lý khi không tìm thấy dữ liệu
            jTextField1.setText("Không tìm thấy hóa đơn");
        }

        // Đóng kết nối MongoClient khi hoàn thành
        mongoClient.close();
    } catch (Exception e) {
        e.printStackTrace();
        jTextField1.setText("Lỗi khi kết nối và lấy dữ liệu từ MongoDB");
    }
}
    public class ThanhToan1Export {
    public static void main(String[] args) {
        // Tạo một đối tượng Document tương ứng với dữ liệu bạn muốn xuất
        Document thanhToanDocument = new Document();
        thanhToanDocument.append("_id", new org.bson.types.ObjectId("65783d4b3908780de642d77c"));
        thanhToanDocument.append("idBill", new org.bson.types.ObjectId("657842d288ce1c34761701f6"));
        thanhToanDocument.append("table_number", 4);

        Document billDocument = new Document();
        billDocument.append("bill_date", "2023-12-12 18:00:27");
        billDocument.append("total_price", null);

        thanhToanDocument.append("bill", billDocument);
        thanhToanDocument.append("order", new ArrayList<>());
        thanhToanDocument.append("payment_status", "unpaid");

        // Chuyển đối tượng Document thành chuỗi JSON
        String json = thanhToanDocument.toJson();

        // In ra chuỗi JSON
        System.out.println(json);
    }
}
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThanhToan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
