
package view;

import control.loadData;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ListPayment extends javax.swing.JFrame {
    private loadData loaddata;
    /**
     * Creates new form HoaDon
     */
    public ListPayment() {
        initComponents();
        loaddata = new loadData();
        displayPaymentData();
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
        jTable1 = new javax.swing.JTable();
        makepayment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "paymentID", "bookingID", "total", "status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        makepayment.setText("make payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(makepayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(makepayment)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayPaymentData() {
        // Lấy model của JTable
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

        // Xóa dữ liệu cũ
        tableModel.setRowCount(0);

        // Lấy dữ liệu từ loaddata
        List<Object[]> paymentData = loaddata.loadPaymentData();

        // Thêm dữ liệu vào bảng
        for (Object[] rowData : paymentData) {
            tableModel.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton makepayment;
    // End of variables declaration//GEN-END:variables
}
