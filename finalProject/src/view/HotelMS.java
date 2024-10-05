package view;

import control.addRoomControl;
import control.deleteRoomControl;
import control.listRoomAvalableControl;
import control.loadData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import module.Room;

public class HotelMS extends javax.swing.JFrame {

    private loadData loadroom;
    private addRoomControl addroom;
    private deleteRoomControl delroom;
    private listRoomAvalableControl roomavalable;

    /**
     * Creates new form HotelMS
     */
    public HotelMS() {
        initComponents();
        loadroom = new loadData();
        addroom = new addRoomControl();
        delroom = new deleteRoomControl();
        roomavalable = new listRoomAvalableControl();
        displayRoomData();
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
        jLabel1 = new javax.swing.JLabel();
        addRoom = new javax.swing.JButton();
        modifyRoom = new javax.swing.JButton();
        deleteRoom = new javax.swing.JButton();
        listRoomAvalable = new javax.swing.JButton();
        bookRoom = new javax.swing.JButton();
        makePayment = new javax.swing.JButton();
        roomIDField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        roomTypeField = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        statusField = new javax.swing.JComboBox<>();
        LoadButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("HotelManagementSystem");

        addRoom.setText("thêm phòng");
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });

        modifyRoom.setText("sửa phòng");
        modifyRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyRoomActionPerformed(evt);
            }
        });

        deleteRoom.setText("xóa phòng");
        deleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomActionPerformed(evt);
            }
        });

        listRoomAvalable.setText("avalable room");
        listRoomAvalable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listRoomAvalableActionPerformed(evt);
            }
        });

        bookRoom.setText("đặt phòng");
        bookRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomActionPerformed(evt);
            }
        });

        makePayment.setText("tạo hóa đơn");

        jLabel2.setText("roomID");

        roomTypeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "normal", "noble", "royal", " " }));

        jLabel3.setText("roomType");

        jLabel4.setText("price");

        jLabel5.setText("status");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "roomID", "roomType", "price", "status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        statusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "avalable", "full", "repairing" }));

        LoadButton.setText("all room");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        jButton1.setText("tìm phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(addRoom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(modifyRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bookRoom)
                                .addGap(18, 18, 18)
                                .addComponent(makePayment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(listRoomAvalable)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1)))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(roomTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(addRoom)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadButton)
                    .addComponent(listRoomAvalable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteRoom)
                    .addComponent(modifyRoom)
                    .addComponent(bookRoom)
                    .addComponent(makePayment)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listRoomAvalableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRoomAvalableActionPerformed
        // TODO add your handling code here:
        displayRoomAvalableData();
    }//GEN-LAST:event_listRoomAvalableActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        // TODO add your handling code here:

        int roomID = Integer.parseInt(roomIDField.getText());
        String roomType = (String) roomTypeField.getSelectedItem();
        int price = Integer.parseInt(priceField.getText());
        String status = (String) statusField.getSelectedItem();

        // Tạo đối tượng Room
        Room room = new Room(roomID, roomType, price, status);

        // Gọi RoomController để thêm phòng vào database
        boolean success = addroom.addRoomToDatabase(room);

        if (success) {
            JOptionPane.showMessageDialog(this, "Thêm phòng thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi thêm phòng.");
        }
    }//GEN-LAST:event_addRoomActionPerformed

    private void modifyRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyRoomActionPerformed

    private void bookRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookRoomActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        displayRoomData();
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void deleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Lấy ID của dòng được chọn
            int id = (int) jTable1.getValueAt(selectedRow, 0);

            // Xóa dòng khỏi JTable
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);

            // Xóa dữ liệu khỏi cơ sở dữ liệu
            delroom.delRoomToDatabase(id);
            
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_deleteRoomActionPerformed

    private void displayRoomData() {
        // Lấy model của JTable
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        // Xóa dữ liệu cũ
        tableModel.setRowCount(0);

        // Lấy dữ liệu từ RoomController
        List<Object[]> roomData = loadroom.loadRoomData();

        // Thêm dữ liệu vào bảng
        for (Object[] rowData : roomData) {
            tableModel.addRow(rowData);
        }
    }
    
    private void displayRoomAvalableData() {
        // Lấy model của JTable
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        // Xóa dữ liệu cũ
        tableModel.setRowCount(0);

        // Lấy dữ liệu từ RoomController
        List<Object[]> roomavalableData = roomavalable.listRoomAvalable();

        // Thêm dữ liệu vào bảng
        for (Object[] rowData : roomavalableData) {
            tableModel.addRow(rowData);
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton addRoom;
    private javax.swing.JButton bookRoom;
    private javax.swing.JButton deleteRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listRoomAvalable;
    private javax.swing.JButton makePayment;
    private javax.swing.JButton modifyRoom;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField roomIDField;
    private javax.swing.JComboBox<String> roomTypeField;
    private javax.swing.JComboBox<String> statusField;
    // End of variables declaration//GEN-END:variables
}
