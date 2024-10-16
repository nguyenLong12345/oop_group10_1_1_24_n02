package view;

import control.loadData;
import control.addRoomControl;
import control.bookRoomControl;
import control.deleteRoomControl;
import control.modifyRoomControl;
import control.searchRoomControl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import module.Booking;
import module.Customer;
import module.Room;

public class HotelMS extends javax.swing.JFrame {

    private loadData loaddata;
    private addRoomControl addroom;
    private deleteRoomControl delroom;
    private modifyRoomControl modifyroom;
    private searchRoomControl search;
    private bookRoomControl bookroom;

    /**
     * Creates new form HotelMS
     */
    public HotelMS() {
        initComponents();
        loaddata = new loadData();
        addroom = new addRoomControl();
        delroom = new deleteRoomControl();
        modifyroom = new modifyRoomControl();
        search = new searchRoomControl();
        bookroom = new bookRoomControl();
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
        searchRoom = new javax.swing.JButton();
        listcustomer = new javax.swing.JButton();
        phoneField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerIDField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        listbooking = new javax.swing.JButton();
        listpayment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Hotel Management System");

        addRoom.setText("add room");
        addRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomActionPerformed(evt);
            }
        });

        modifyRoom.setText("modify room");
        modifyRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyRoomActionPerformed(evt);
            }
        });

        deleteRoom.setText("delete room");
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

        bookRoom.setText("book room");
        bookRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomActionPerformed(evt);
            }
        });

        roomIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomIDFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Room ID");

        roomTypeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "normal", "noble", "royal" }));

        jLabel3.setText("Room Type");

        jLabel4.setText("Price");

        jLabel5.setText("Status");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "roomID", "roomType", "price", "status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        statusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "avalable", "repairing" }));
        statusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusFieldActionPerformed(evt);
            }
        });

        LoadButton.setText("all room");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        searchRoom.setText("search room");
        searchRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRoomActionPerformed(evt);
            }
        });

        listcustomer.setText("list customer");
        listcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listcustomerActionPerformed(evt);
            }
        });

        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone");

        jLabel7.setText("Address");

        jLabel8.setText("Customer ID");

        jLabel9.setText("Name");

        listbooking.setText("list booking");
        listbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbookingActionPerformed(evt);
            }
        });

        listpayment.setText("list payment");
        listpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(roomIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                            .addComponent(priceField))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(roomTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(141, 141, 141)
                                                .addComponent(jLabel8)))
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(listcustomer)
                                        .addGap(18, 18, 18)
                                        .addComponent(listbooking)
                                        .addGap(18, 18, 18)
                                        .addComponent(listpayment)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(listRoomAvalable)
                                        .addGap(51, 51, 51)
                                        .addComponent(LoadButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(customerIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(nameField))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(49, 49, 49))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteRoom)
                                .addGap(18, 18, 18)
                                .addComponent(searchRoom)
                                .addGap(18, 18, 18)
                                .addComponent(addRoom)
                                .addGap(18, 18, 18)
                                .addComponent(modifyRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookRoom)
                                .addGap(156, 156, 156)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(321, 321, 321))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(roomTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(roomIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteRoom)
                    .addComponent(searchRoom)
                    .addComponent(bookRoom)
                    .addComponent(addRoom)
                    .addComponent(modifyRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listcustomer)
                    .addComponent(LoadButton)
                    .addComponent(listRoomAvalable)
                    .addComponent(listbooking)
                    .addComponent(listpayment))
                .addGap(35, 35, 35))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressField, customerIDField, nameField, phoneField, priceField, roomIDField});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listRoomAvalableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRoomAvalableActionPerformed
        // TODO add your handling code here:
        displayRoomAvalableData();
    }//GEN-LAST:event_listRoomAvalableActionPerformed

    private void addRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomActionPerformed
        // TODO add your handling code here:
        addRoom();
    }//GEN-LAST:event_addRoomActionPerformed

    private void modifyRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyRoomActionPerformed
        // TODO add your handling code here:
        modifyRoom();
    }//GEN-LAST:event_modifyRoomActionPerformed

    private void bookRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomActionPerformed
        // TODO add your handling code here:
        bookRoom();
    }//GEN-LAST:event_bookRoomActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        displayRoomData();
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void deleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomActionPerformed
        // TODO add your handling code here:
        deleteRoom();
    }//GEN-LAST:event_deleteRoomActionPerformed

    private void listcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listcustomerActionPerformed
        // TODO add your handling code here:        
        ListCustomer lc = new ListCustomer();
        lc.setVisible(true);
    }//GEN-LAST:event_listcustomerActionPerformed

    private void searchRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRoomActionPerformed
        // TODO add your handling code here:
        searchRoom();
    }//GEN-LAST:event_searchRoomActionPerformed

    private void listbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbookingActionPerformed
        // TODO add your handling code here:
        ListBookRoom lb = new ListBookRoom();
        lb.setVisible(true);
    }//GEN-LAST:event_listbookingActionPerformed

    private void listpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listpaymentActionPerformed
        // TODO add your handling code here:
        ListPayment lp = new ListPayment();
        lp.setVisible(true);
    }//GEN-LAST:event_listpaymentActionPerformed

    private void roomIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomIDFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void statusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusFieldActionPerformed

    private void displayRoomData() {
        // Lấy model của JTable
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        // Xóa dữ liệu cũ
        tableModel.setRowCount(0);

        // Lấy dữ liệu từ loaddata
        List<Object[]> roomData = loaddata.loadRoomData();

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

        // Lấy dữ liệu từ roomavalableData
        List<Object[]> roomavalableData = loaddata.listRoomAvalable();

        // Thêm dữ liệu vào bảng
        for (Object[] rowData : roomavalableData) {
            tableModel.addRow(rowData);
        }
    }

    private void addRoom() {
        String ID = roomIDField.getText();
        String roomType = (String) roomTypeField.getSelectedItem();
        String p = priceField.getText();
        String status = (String) statusField.getSelectedItem();

        if (ID.trim().isEmpty() || p.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phải nhập đủ thông tin.");
        } else {
            try {
                // Chuyển đổi về int
                int roomID = Integer.parseInt(ID);
                int price = Integer.parseInt(p);
                // Tạo đối tượng Room
                Room room = new Room(roomID, roomType, price, status);

                // Gọi addRoomControl để thêm phòng vào database
                boolean success = addroom.addRoomToDatabase(room);

                if (success) {
                    JOptionPane.showMessageDialog(this, "Thêm phòng thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Phòng tồn tại!.");
                }
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Nhập sai định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void modifyRoom() {
        String ID = roomIDField.getText();
        String roomType = (String) roomTypeField.getSelectedItem();
        String p = priceField.getText();
        String status = (String) statusField.getSelectedItem();

        if (ID.trim().isEmpty() || p.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phải nhập đủ thông tin.");
        } else {
            try {
                // Chuyển đổi về int
                int roomID = Integer.parseInt(ID);
                int price = Integer.parseInt(p);
                // Tạo đối tượng Room
                Room room = new Room(roomID, roomType, price, status);

                // Gọi addRoomControl để thêm phòng vào database
                boolean success = modifyroom.modifyRoomToDatabase(room);

                if (success) {
                    JOptionPane.showMessageDialog(this, "Sửa phòng thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Phòng không tồn tại!");
                }
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Nhập sai định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void deleteRoom() {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Lấy roomID của dòng được chọn
            int roomID = (int) jTable1.getValueAt(selectedRow, 0);
            boolean exit = delroom.isRoomDataExist(roomID);
            if (exit) {
                JOptionPane.showMessageDialog(this, "Không thể xóa!.");
            } else {
                // Xóa dòng khỏi JTable
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.removeRow(selectedRow);

                // Xóa dữ liệu khỏi cơ sở dữ liệu
                delroom.delRoomToDatabase(roomID);
                JOptionPane.showMessageDialog(this, "Xóa thành công.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa.");
        }
    }

    private void searchRoom() {
        String roomIdText = roomIDField.getText();
        if (!roomIdText.isEmpty()) {
            try {
                // Chuyển roomID thành số nguyên
                int roomId = Integer.parseInt(roomIdText);
                Room room = search.searchRoom(roomId);
                if (room != null) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setRowCount(0);
                    model.addRow(new Object[]{room.getRoomID(), room.getRoomType(), room.getPrice(), room.getStatus()});
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy phòng.");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chưa nhập ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bookRoom() {
        String ID = customerIDField.getText();
        String name = nameField.getText();
        String p = phoneField.getText();
        String address = addressField.getText();
        int selectedRow = jTable1.getSelectedRow();

        if (ID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phải nhập customerID.");
            return;
        }

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Chưa chọn phòng.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!jTable1.getValueAt(selectedRow, 3).equals("avalable")) {
            JOptionPane.showMessageDialog(null, "Phải chọn phòng còn trống.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Chuyển đổi về int
            int customerID = Integer.parseInt(ID);
            int roomID = (int) jTable1.getValueAt(selectedRow, 0);

            // Kiểm tra xem customerID đã tồn tại hay chưa
            if (bookroom.isCustomerExist(customerID)) {
                // Nếu khách hàng đã tồn tại, không cần nhập thông tin khác
                String checkOutDate = JOptionPane.showInputDialog(null, "Enter Check-out Date (YYYY/MM/DD):");

                // Tạo đối tượng Booking
                Booking booking = new Booking(customerID, roomID, checkOutDate);
                bookroom.saveBooking(booking);
            } else {
                // Nếu khách hàng chưa tồn tại, kiểm tra các trường thông tin khác
                if (name.trim().isEmpty() || p.trim().isEmpty() || address.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Phải nhập đủ thông tin khách hàng nếu chưa có.");
                    return;
                }

                int phone = Integer.parseInt(p);
                String checkOutDate = JOptionPane.showInputDialog(null, "Enter Check-out Date (YYYY/MM/DD):");

                // Tạo đối tượng Customer và Booking
                Customer customer = new Customer(customerID, name, phone, address);
                Booking booking = new Booking(customerID, roomID, checkOutDate);

                // Lưu cả customer và booking
                bookroom.saveCustomer(customer);
                bookroom.saveBooking(booking);
            }

            // Cập nhật trạng thái phòng trong bảng
            jTable1.setValueAt("full", selectedRow, 3);
            JOptionPane.showMessageDialog(null, "Đặt phòng thành công!", "Success", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Nhập sai định dạng!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton addRoom;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton bookRoom;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JButton deleteRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton listRoomAvalable;
    private javax.swing.JButton listbooking;
    private javax.swing.JButton listcustomer;
    private javax.swing.JButton listpayment;
    private javax.swing.JButton modifyRoom;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField roomIDField;
    private javax.swing.JComboBox<String> roomTypeField;
    private javax.swing.JButton searchRoom;
    private javax.swing.JComboBox<String> statusField;
    // End of variables declaration//GEN-END:variables
}
