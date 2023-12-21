package view;

import utils.FoodUtils;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
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
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.bson.types.ObjectId; // Import ObjectId class
import view.DatBan;

/**
 *
 * @author kevin
 * @param <cmdAdj>
 * @param <cmdAdj>
 * @param <cmdAdj>
 * @param <cmdAdj>
 */
public class GoiMon extends javax.swing.JFrame {

    List<JFrame> openWindows = new ArrayList<>();

    private int table_Number;
//    System.out.println(idBill);
    public ObjectId idNV;

    // Assuming you have a valid ObjectId to pass
    ObjectId someObjectId = new ObjectId(); // Example ObjectId, replace with a valid one

    // Create an instance of DatBan with the idBill
    DatBan datBanInstance = new DatBan(idNV);

    // Now you can call getIdBill() on this instance
    ObjectId idBill = datBanInstance.getIdBill();

    public ObjectId getIdBill() {
        return idBill;
    }

    // Print idBill    
    // Add this line to declare the tablePanel variable
    private javax.swing.JPanel tablePanel;

    /**
     * Creates new form DatBan
     */
    public GoiMon() {
    }

    public GoiMon(int table_Number) {
        this.table_Number = table_Number;
        initComponents();
        createTables();
        displayTableName();
    }

    public GoiMon(int table_Number, ObjectId idNV) {
        this.idNV = idNV;
        this.table_Number = table_Number;
        initComponents();
        createTables();
        displayTableName();
    }

    public GoiMon(int table_Number, ObjectId idBill, ObjectId idNV) {
        this.idNV = idNV;
        this.table_Number = table_Number;
        this.idBill = idBill; // Đảm bảo rằng idBill đã được khởi tạo
        initComponents();
        createTables();
        displayTableName();
        System.out.println(idBill);
        GoiMon goiMonForm = new GoiMon();
        openWindows.add(goiMonForm);
        goiMonForm.setVisible(true);
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
        jTextField1 = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Mã bàn");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("Món đã gọi");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setText("Quay lại");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 255));
        jButton4.setText("Thanh Toán");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 934, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAdjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAdjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAdjActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Create an instance of ThanhToan class and pass necessary parameters
        ThanhToan thanhToan = new ThanhToan(this.table_Number, this.idBill);
        thanhToan.setVisible(true); // Display the ThanhToan frame
//            this.dispose(); // Optionally, close the current GoiMon frame

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        // Create an instance of DatBan and show it
        DatBan datBanForm = new DatBan(idNV);
        datBanForm.setVisible(true);
        this.dispose();  // Close the current form

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
            MongoDatabase database = mongoClient.getDatabase("restaurant");
            MongoCollection<Document> billCollection = database.getCollection("bill");

            Document billDocument = billCollection.find(eq("idBill", idBill)).first();
            if (billDocument != null) {
                List<Document> orderedItems = (List<Document>) billDocument.get("order");
                StringBuilder billInfo = new StringBuilder("Order Details:\n");

                for (Document item : orderedItems) {
                    int foodId = item.getInteger("foodId");
                    int quantity = item.getInteger("quantity");

                    String foodName = FoodUtils.getFoodNameFromMongoDB(database, foodId);
                    int foodPrice = FoodUtils.getFoodPriceFromMongoDB(database, foodId);
                    int totalPrice = foodPrice * quantity;

                    String formattedLine = String.format("   Món: %-20s x%-10d %6d VND", foodName, quantity, totalPrice);
                    billInfo.append(formattedLine).append("\n");
                }

                JOptionPane.showMessageDialog(this, billInfo.toString(), "Món Đã Gọi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy hóa đơn.", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi truy vấn cơ sở dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void openThanhToan(int tableNumber) {
        // Assuming idBill is already generated/set in DatBan class
        ThanhToan thanhToanFrame = new ThanhToan(tableNumber, idBill);
        thanhToanFrame.setVisible(true);
        this.dispose();
    }

    private void displayTableName() {
        try {
            MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
            MongoDatabase database = mongoClient.getDatabase("restaurant");
            MongoCollection<Document> tableCollection = database.getCollection("table");

            Document tableDocument = tableCollection.find(new Document("table_number", table_Number)).first();
            if (tableDocument != null) {
                String tableName = tableDocument.getString("table_Name");
                jButton1.setText(tableName); // Hiển thị tên bàn trên nút
                jTextField1.setText("Bàn số  " + table_Number); // Hiển thị số và tên bàn trong jTextField1
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving table name. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
//Update hóa đơn

    private void updateOrderInBill(ObjectId idBill, Document foodDocument) {
        try {
            MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
            MongoDatabase database = mongoClient.getDatabase("restaurant");
            MongoCollection<Document> billCollection = database.getCollection("bill");

            // Find the bill with the specified idBill
            Document query = new Document("idBill", idBill);
            Document billDocument = billCollection.find(query).first();
            System.out.println(foodDocument);

            if (billDocument != null) {
                // Proceed with updating the order
                List<Document> orderList = (List<Document>) billDocument.get("order");
                orderList.add(foodDocument);
                // Update the bill in MongoDB
                System.out.print("dayneeeeeeeeeeeeeeeeeeeee");
                billCollection.updateOne(query, new Document("$set", new Document("order", orderList)));
            } else {
                System.out.println("Bill not found for ID: " + idBill);
                // Handle the case where the bill is not found
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating order in bill. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void createTables() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
                    MongoDatabase database = mongoClient.getDatabase("restaurant");
                    MongoCollection<Document> collection = database.getCollection("food");

                    tablePanel = new JPanel(new GridLayout(4, 6)); // Adjust grid layout as needed
                    tablePanel.setBounds(130, 0, 980, 600);
                    tablePanel.setBackground(new Color(216, 250, 216));

                    for (Document document : collection.find()) {
                        String foodName = document.getString("foodName");
                        String price = document.getString("price");
                        String status = document.getString("status");
                        Integer foodId = document.getInteger("foodId");
                        String images = document.getString("image");

                        System.out.println(images);
                        // Debugging print
                        System.out.println("Food name: " + foodName + ", Price: " + price);
                        // Display the first foodName in the jTextField1

                        JLabel status1 = new JLabel("   " + foodName + " - " + status);
                        status1.setHorizontalAlignment(JLabel.CENTER); // Canh ngang giữa
                        status1.setVerticalAlignment(JLabel.CENTER);
                        status1.setBackground(new Color(216, 250, 216));
                        JPanel tablePanelItem = new JPanel(new BorderLayout());
                        // Add Increase and Decrease buttons
                        JButton increaseButton = new JButton("+");
                        JButton decreaseButton = new JButton("-");

                        // Ensure the imagePath is correctly retrieved and valid
                        String imagePath = document.getString("imagePath");
                        ImageIcon imageIcon = new ImageIcon(imagePath);
                        JLabel imageLabel = new JLabel(imageIcon);
                        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(images)));
                        imageLabel.setPreferredSize(new Dimension(300, 300));
                        imageLabel.setMinimumSize(new Dimension(300, 300));

                        // Create a panel for buttons and add it to the SOUTH position
                        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                        buttonPanel.setBackground(new Color(216, 250, 216));

                        JButton actionButton = new JButton();
                        buttonPanel.add(actionButton);

                        increaseButton.addActionListener(e -> {
                            // Implement logic to increase the quantity of the product
                            System.out.println("Increase quantity for " + foodName);
                        });

                        decreaseButton.addActionListener(e -> {
                            // Implement logic to decrease the quantity of the product
                            System.out.println("Decrease quantity for " + foodName);
                        });

                        // Add buttons to the button panel
                        buttonPanel.setBackground(new Color(216, 250, 216));
                        buttonPanel.add(increaseButton);
                        buttonPanel.add(decreaseButton);

                        // Create buttons based on the table status
                        if ("Mon An".equals(status)) {
                            actionButton.setText("Đặt Bàn");
                            actionButton.addActionListener(e -> {
                                // Display a confirmation dialog
                                int result = JOptionPane.showConfirmDialog(null, "Xác nhận đặt bàn cho bàn số " + foodName + "?", "Xác Nhận", JOptionPane.YES_NO_OPTION);

                                if (result == JOptionPane.YES_OPTION) {
                                    // Update the table status in the database (assuming you have a method to update the database)
                                    updateTableStatus(foodName, "Ban Da Dat");

                                    // Change the button text to "Gọi Món"
                                    actionButton.setText("Gọi Món");

                                    // Add "Hủy Bàn" button
                                    JButton cancelButton = new JButton("Hủy Bàn");
                                    cancelButton.addActionListener(cancelEvent -> {
                                        updateTableStatus(foodName, "");
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
                                        // Add code to handle the action when the "Gọi Món" button is clicked
                                        System.out.println("Gọi Món clicked for table number: " + foodName);
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
                        } else if ("Ban Da Dat".equals(status)) {
                            actionButton.setText("Gọi Món");
                            actionButton.addActionListener(orderEvent -> {
                                // Add code to handle the action when the "Gọi Món" button is clicked
                                System.out.println("Gọi Món clicked for table number: " + foodName);
                            });

                            // Add "Hủy Bàn" button
                            JButton cancelButton = new JButton("Hủy Bàn");
                            cancelButton.addActionListener(cancelEvent -> {
                                // Add code to handle the action when the "Hủy Bàn" button is clicked
                                updateTableStatus(foodName, "Ban Trong");
                                actionButton.setText("Đặt Bàn");

                                // Remove "Gọi Món" and "Hủy Bàn" buttons
                                buttonPanel.removeAll();

                                // Add "Đặt Bàn" button
                                actionButton.addActionListener(e -> {
                                    // Display a confirmation dialog
                                    int result = JOptionPane.showConfirmDialog(null, "Xác nhận đặt bàn cho bàn số " + foodName + "?", "Xác Nhận", JOptionPane.YES_NO_OPTION);

                                    if (result == JOptionPane.YES_OPTION) {
                                        // Update the table status in the database (assuming you have a method to update the database)
                                        updateTableStatus(foodName, "Ban Da Dat");

                                        // Change the button text to "Gọi Món"
                                        actionButton.setText("Gọi Món");

                                        // Add "Hủy Bàn" button
                                        JButton newCancelButton = new JButton("Hủy Bàn");
                                        newCancelButton.addActionListener(newCancelEvent -> {
                                            updateTableStatus(foodName, "Ban Trong");
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
                                            // Add code to handle the action when the "Gọi Món" button is clicked
                                            System.out.println("Gọi Món clicked for table number: " + foodName);
                                        });

                                        // Add buttons to the buttonPanel   
                                        buttonPanel.removeAll();
                                        buttonPanel.setBackground(new Color(216, 250, 216));
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
                                tablePanelItem.setBackground(new Color(216, 250, 216));
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
                        status1.setForeground(Color.BLUE);

// Set other properties, e.g., opaque to make the background color visible
                        status1.setOpaque(true);
                        tablePanel.add(tablePanelItem);
                        JTextField quantityField = new JTextField(2); // 5 là chiều rộng của trường văn bản
                        quantityField.setText("0"); // Set initial quantity to 0
                        increaseButton.addActionListener(e -> {
                            // Increment the quantity when the + button is clicked
                            int currentQuantity = Integer.parseInt(quantityField.getText());
                            quantityField.setText(String.valueOf(currentQuantity + 1));
                        });

                        decreaseButton.addActionListener(e -> {
                            // Decrement the quantity, but not below 0, when the - button is clicked
                            int currentQuantity = Integer.parseInt(quantityField.getText());
                            if (currentQuantity > 0) {
                                quantityField.setText(String.valueOf(currentQuantity - 1));
                            }
                        });
                        JButton addOrder = new JButton("Gọi Món");
                        addOrder.addActionListener(orderEvent -> {
                            try {
                                JOptionPane.showMessageDialog(null, "Đã thêm " + Integer.parseInt(quantityField.getText()) + " " + foodName + " vào hóa đơn.", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                                // Get the quantity from the quantityField
                                int quantity = Integer.parseInt(quantityField.getText());
                                // Create a Document representing the order
                                Document orderDocument = new Document();
                                orderDocument.append("foodId", foodId)
                                        .append("quantity", quantity);

                                // Add the order to the current bill (assuming you have the bill ID)
                                System.out.println("okkkkkkkkkkkkkkkkkkkkkkkkkkkkk" + idBill);
                                updateOrderInBill(idBill, orderDocument);

                                // Print a message or perform other actions as needed
                                System.out.println("Added order to the current bill: " + foodName + " - Quantity: " + quantity);

                            } catch (NumberFormatException e) {
                                // Handle the case where the quantityField doesn't contain a valid number
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);

                            } catch (Exception e) {
                                // Handle other exceptions
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Error updating order in bill. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        });
                        // Create a panel for quantity-related buttons
                        JPanel quantityPanel = new JPanel();
                        quantityPanel.setLayout(new FlowLayout()); // Use FlowLayout to arrange components from left to right
                        quantityPanel.add(decreaseButton);
                        quantityPanel.add(quantityField); // Add quantity field
                        quantityPanel.add(increaseButton);
                        quantityPanel.setBackground(new Color(216, 250, 216));

                        // Create a new panel for both "Gọi Món" and quantity-related buttons
                        JPanel buttonPanel1 = new JPanel();
                        buttonPanel1.setLayout(new BorderLayout());

                        // Add "Gọi Món" button to the top of the new panel
                        buttonPanel1.add(addOrder, BorderLayout.SOUTH);

                        // Add the quantity-related buttons panel to the center of the new panel
                        buttonPanel1.add(quantityPanel, BorderLayout.CENTER);

                        // Add components to the tablePanelItem
                        tablePanelItem.setLayout(new BorderLayout());
                        tablePanelItem.add(status1, BorderLayout.NORTH); // Place status1 at the top
                        tablePanelItem.add(imageLabel, BorderLayout.CENTER); // Center the image
                        tablePanelItem.add(buttonPanel1, BorderLayout.SOUTH); // Add the panel with buttons at the bottom

                    }

                    jPanel1.add(tablePanel);
                    jPanel1.revalidate();
                    jPanel1.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void updateTableStatus(String foodName, String ban_Da_Dat) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    private void updateTableStatus(int foodName, String newStatus) {
        try {
            // Connect to MongoDB
            MongoClient mongoClient = MongoClients.create("mongodb+srv://phucpro2104:phuc123@cluster0.7834cva.mongodb.net/");
            MongoDatabase database = mongoClient.getDatabase("restaurant");
            MongoCollection<Document> collection = database.getCollection("food");

            // Prepare the filter based on the table number
            Document filter = new Document("foodName", foodName);

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
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GoiMon(1).setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
