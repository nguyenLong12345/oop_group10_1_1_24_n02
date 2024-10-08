
package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import main.DatabaseConnection;


public class listCustomerControl {
    public List<Object[]> loadCustomerData() {
        List<Object[]> CustomerData = new ArrayList<>();
        
        try {
            // Kết nối tới SQL Server
            Connection connection = DatabaseConnection.getConnection();
            String query = "SELECT customerID, name, phone, address FROM Customer";
            
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Lặp qua các dòng dữ liệu từ ResultSet
            while (rs.next()) {
                int customerID = rs.getInt("customerID");
                String name = rs.getString("name");
                int phone = rs.getInt("phone");
                String address = rs.getString("address");

                // Thêm dữ liệu vào danh sách
                CustomerData.add(new Object[]{customerID, name, phone, address});
            }

            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return CustomerData; // Trả về danh sách dữ liệu
    }
}
