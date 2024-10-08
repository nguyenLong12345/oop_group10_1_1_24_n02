
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.DatabaseConnection;
import module.Customer;


public class modifyCustomerControl {
    public boolean modifyCustomerToDatabase(Customer customer) {
        try {
            Connection connection = DatabaseConnection.getConnection();
           
            String query = "UPDATE Customer SET name = ?, phone = ?, address = ? WHERE customerID = ?";

            // Chuẩn bị câu lệnh SQL
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setInt(4, customer.getCustomerID());
            pstm.setString(1, customer.getName());
            pstm.setInt(2, customer.getPhone());
            pstm.setString(3, customer.getAddress());

            // Thực thi câu lệnh SQL
            int rowsInserted = pstm.executeUpdate();

            // Đóng kết nối
            pstm.close();
            connection.close();

            return rowsInserted > 0;  // Trả về true nếu sửa thành công

        } catch (SQLException e) {
            e.printStackTrace();
            return false;  // Trả về false nếu có lỗi xảy ra
        }
    }
}
