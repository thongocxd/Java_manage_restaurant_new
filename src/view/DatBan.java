/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.UpdateOptions;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import org.bson.Document;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import org.bson.types.ObjectId;
import view.GoiMon;


/**
 *
 * @author kevin
 * @param <cmdAdj>
 * @param <cmdAdj>
 * @param <cmdAdj>
 * @param <cmdAdj>
 */
public class DatBan extends javax.swing.JFrame {
private ObjectId idBill; // Khai báo idBill ở đây

public ObjectId getIdBill(){
    return idBill;
}
    // Add this line to declare the tablePanel variable
private javax.swing.JPanel tablePanel;
private Login loginForm;
    /**
     * Creates new form DatBan
     */
    public DatBan() {
        initComponents();
        createTables();
        loginForm = new Login();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Menu");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Đặt Bàn");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Đăng Xuất");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tài Khoản");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(108, 91, 123));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Title");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 584, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAdjActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         loginForm.setVisible(true);
    this.dispose();  // Close the current form
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:    createTables();
       createTables();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        createTables();
    }//GEN-LAST:event_jButton1ActionPerformed

private void createNewBill(int tableNumber) {
    try {
        MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
        MongoDatabase database = mongoClient.getDatabase("restaurant");
        MongoCollection<Document> billCollection = database.getCollection("bill");

        // Generate a new ObjectId for idBill
        idBill = new ObjectId(); // Sử dụng biến instance idBill đã khai báo trước đó

        Document newBill = new Document("table_number", tableNumber)
                .append("idBill", idBill) // Add idBill field
                .append("bill", new Document("bill_date", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                        .append("total_price", null))
                .append("order", Arrays.asList()) // Danh sách món ăn trống
                .append("payment_status", "unpaid");
        billCollection.insertOne(newBill);

        // Lưu trữ ID của hóa đơn mới tạo để sử dụng sau này
        String billId = newBill.getObjectId("idBill").toString();
        System.out.println("Searching for idBill: " + idBill); // In ra giá trị của idBill

        System.out.println("New bill created for table number: " + tableNumber);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error creating new bill. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    
public void createTables() {
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            try {
                MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
                MongoDatabase database = mongoClient.getDatabase("restaurant");
                MongoCollection<Document> collection = database.getCollection("table");

                tablePanel = new JPanel(new GridLayout(3, 4)); // Adjust grid layout as needed
                tablePanel.setBounds(150, 50, 900, 500);

                for (Document document : collection.find()) {
                    Integer tableNumber = document.getInteger("table_number");
                    String tableName = document.getString("table_name");
                    String trangThai = document.getString("trangthai");

                    // Debugging print
                    System.out.println("Table Number: " + tableNumber + ", Table Name: " + tableName);

                    JLabel status = new JLabel(tableName + " - Tình trạng: " + trangThai);
                    JPanel tablePanelItem = new JPanel(new BorderLayout());

                    // Ensure the imagePath is correctly retrieved and valid
                    String imagePath = document.getString("imagePath");
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    JLabel imageLabel = new JLabel(imageIcon);
                    imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/caiban/images.jpg")));
                    
                    
                    // Create a panel for buttons and add it to the SOUTH position
                    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

                    JButton actionButton = new JButton();
                    buttonPanel.add(actionButton);
                    tablePanelItem.add(buttonPanel, BorderLayout.SOUTH);

                    // Create buttons based on the table status
                    if ("Ban Trong".equals(trangThai)) {
                        actionButton.setText("Đặt Bàn");
                        actionButton.addActionListener(e -> {
                            // Display a confirmation dialog
                            int result = JOptionPane.showConfirmDialog(null, "Xác nhận đặt bàn cho bàn số " + tableNumber + "?", "Xác Nhận", JOptionPane.YES_NO_OPTION);

                            if (result == JOptionPane.YES_OPTION) {
                                // Update the table status in the database (assuming you have a method to update the database)
                                updateTableStatus(tableNumber, "Ban Da Dat");

                                // Change the button text to "Gọi Món"
                                actionButton.setText("Gọi Món");

                                // Add "Hủy Bàn" button
                                JButton cancelButton = new JButton("Hủy Bàn");
                                cancelButton.addActionListener(cancelEvent -> {
                                     int result1 = JOptionPane.showConfirmDialog(null, "Xác nhận đặt bàn cho bàn số " + tableNumber + "?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
                                     updateTableStatus(tableNumber, "Ban Trong");
                                    actionButton.setText("Đặt Bàn");
                                     // Remove "Gọi Món" and "Hủy Bàn" buttons
                                    buttonPanel.removeAll();
                                    buttonPanel.add(actionButton);
                                    // Repaint the panel
                                    tablePanelItem.revalidate();
                                    tablePanelItem.repaint();
                                });

                                // Add "Gọi Món" button
                                JButton orderButton = new JButton("Gọi Món");
                                orderButton.addActionListener(orderEvent -> {
                                      createNewBill(tableNumber);
                                    // Add code to handle the action when the "Gọi Món" button is clicked
                                    System.out.println("Gọi Món clicked for table number: " + tableNumber);
                                    GoiMon goiMonFrame = new GoiMon(tableNumber);
                                    goiMonFrame.setVisible(true);
                                    dispose();  // Close the current form
                                });

                                // Add buttons to the buttonPanel   
                                buttonPanel.removeAll();
                                buttonPanel.add(orderButton);
                                buttonPanel.add(cancelButton);

                                // Repaint the panel
                                tablePanelItem.revalidate();
                                tablePanelItem.repaint();
                            }
                        });
                    } else if ("Ban Da Dat".equals(trangThai)) {
    actionButton.setText("Gọi Món");
    actionButton.addActionListener(orderEvent -> {
        
        createNewBill(tableNumber);
        // Add code to handle the action when the "Gọi Món" button is clicked
        System.out.println("Gọi Món clicked for table number: " + tableNumber);
        openGoiMon(tableNumber);

    });

    // Add "Hủy Bàn" button
    JButton cancelButton = new JButton("Hủy Bàn");
    cancelButton.addActionListener(cancelEvent -> {
        // Add code to handle the action when the "Hủy Bàn" button is clicked
        updateTableStatus(tableNumber, "Ban Trong");
        actionButton.setText("Đặt Bàn");

        // Remove "Gọi Món" and "Hủy Bàn" buttons
        buttonPanel.removeAll();

        // Add "Đặt Bàn" button
        actionButton.addActionListener(e -> {
            // Display a confirmation dialog
            int result = JOptionPane.showConfirmDialog(null, "Xác nhận đặt bàn cho bàn số " + tableNumber + "?", "Xác Nhận", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                // Update the table status in the database (assuming you have a method to update the database)
                updateTableStatus(tableNumber, "Ban Da Dat");

                // Change the button text to "Gọi Món"
                actionButton.setText("Gọi Món");

                // Add "Hủy Bàn" button
                JButton newCancelButton = new JButton("Hủy Bàn");
                newCancelButton.addActionListener(newCancelEvent -> {
                    updateTableStatus(tableNumber, "Ban Trong");
                    actionButton.setText("Đặt Bàn");
                    // Remove "Gọi Món" and "Hủy Bàn" buttons
                    buttonPanel.removeAll();
                    // Add "Đặt Bàn" button
                    buttonPanel.add(actionButton);
                    // Repaint the panel
                    tablePanelItem.revalidate();
                    tablePanelItem.repaint();
                });

                // Add "Gọi Món" button
                JButton newOrderButton = new JButton("Gọi Món");
                newOrderButton.addActionListener(newOrderEvent -> {
                     createNewBill(tableNumber);
                    // Add code to handle the action when the "Gọi Món" button is clicked
                    System.out.println("Gọi Món clicked for table number: " + tableNumber);
                    openGoiMon(tableNumber);
                    dispose();  // Close the current form
                });

                // Add buttons to the buttonPanel   
                buttonPanel.removeAll();
                buttonPanel.add(newOrderButton);
                buttonPanel.add(newCancelButton);

                // Repaint the panel
                tablePanelItem.revalidate();
                tablePanelItem.repaint();
            }
        });

        // Add the actionButton to the buttonPanel
        buttonPanel.add(actionButton);

        // Repaint the panel    
        tablePanelItem.revalidate();
        tablePanelItem.repaint();
    });

    // Add buttons to the buttonPanel
    buttonPanel.add(actionButton);
    buttonPanel.add(cancelButton);

    // Repaint the panel
    tablePanelItem.revalidate();
    tablePanelItem.repaint();
}

                    // Set the foreground color to make the text visible on the background
                    status.setForeground(Color.WHITE);

                    // Set other properties, e.g., opaque to make the background color visible
                    status.setOpaque(true);

                    tablePanelItem.add(status, BorderLayout.NORTH);
                    tablePanelItem.add(imageLabel, BorderLayout.CENTER);

                    tablePanel.add(tablePanelItem);
                }

                jPanel1.add(tablePanel);
                jPanel1.revalidate();
                jPanel1.repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
}


    
    private void updateTableStatus(int tableNumber, String newStatus) {
        try {
            // Connect to MongoDB
            MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
            MongoDatabase database = mongoClient.getDatabase("restaurant");
            MongoCollection<Document> collection = database.getCollection("table");

            // Prepare the filter based on the table number
            Document filter = new Document("table_number", tableNumber);

            // Prepare the update with the new status
            Document update = new Document("$set", new Document("trangthai", newStatus));

            // Set the update options
            UpdateOptions options = new UpdateOptions().upsert(false);

            // Update the document in the collection
            collection.updateOne(filter, update, options);

            // Print a message to the console for debugging
            System.out.println("Table status updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating table status. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void openGoiMon(int tableNumber) {
    // Assuming idBill is already generated/set in DatBan class
    GoiMon goiMonFrame = new GoiMon(tableNumber, this.idBill);
    goiMonFrame.setVisible(true);
    this.dispose(); // or other logic as per your application flow
}
    
     private void tableButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Handle table button click event if needed
        // You can add specific actions when a table button is clicked
        // For now, I'll just print a message to the console
        JButton clickedButton = (JButton) evt.getSource();
        System.out.println("Table clicked: " + clickedButton.getText());
    }
  
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatBan().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
