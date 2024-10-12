
package control;

import java.util.List;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import main.DatabaseConnection;


public class loadData {
    public List<Object[]> loadRoomData() {
        List<Object[]> roomData = new ArrayList<>();
        
        try {
            // Kết nối tới SQL Server
            Connection connection = DatabaseConnection.getConnection();
            String query = "SELECT roomID, roomType, price, status FROM Room";
            
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Lặp qua các dòng dữ liệu từ ResultSet
            while (rs.next()) {
                int roomID = rs.getInt("roomID");
                String roomType = rs.getString("roomType");
                int price = rs.getInt("price");
                String status = rs.getString("status");

                // Thêm dữ liệu vào danh sách
                roomData.add(new Object[]{roomID, roomType, price, status});
            }

            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roomData; // Trả về danh sách dữ liệu
    }

    public List<Object[]> listRoomAvalable() {
        List<Object[]> roomAvalable = new ArrayList<>();
        
        try {
            // Kết nối tới SQL Server
            Connection connection = DatabaseConnection.getConnection();
            String query = "SELECT * FROM Room WHERE status = 'avalable'";
            
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Lặp qua các dòng dữ liệu từ ResultSet
            while (rs.next()) {
                int roomID = rs.getInt("roomID");
                String roomType = rs.getString("roomType");
                int price = rs.getInt("price");
                String status = rs.getString("status");

                // Thêm dữ liệu vào danh sách
                roomAvalable.add(new Object[]{roomID, roomType, price, status});
            }

            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roomAvalable; // Trả về danh sách dữ liệu
    }
    
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
    
    public List<Object[]> loadBookingData() {
        List<Object[]> BookingData = new ArrayList<>();
        
        try {
            // Kết nối tới SQL Server
            Connection connection = DatabaseConnection.getConnection();
            String query = "SELECT bookingID, customerID, roomID, checkInDate, checkOutDate, status FROM Booking";
            
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Lặp qua các dòng dữ liệu từ ResultSet
            while (rs.next()) {
                int bookingID = rs.getInt("bookingID");
                int customerID = rs.getInt("customerID");
                int roomID = rs.getInt("roomID");
                String checkInDate = rs.getString("checkInDate");
                String checkOutDate = rs.getString("checkOutDate");
                String status = rs.getString("status");
                // Thêm dữ liệu vào danh sách
                BookingData.add(new Object[]{bookingID, customerID, roomID, checkInDate, checkOutDate, status});
            }

            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return BookingData; // Trả về danh sách dữ liệu
    }
    
    public List<Object[]> loadPaymentData() {
        List<Object[]> PaymentData = new ArrayList<>();
        
        try {
            // Kết nối tới SQL Server
            Connection connection = DatabaseConnection.getConnection();
            String query = "SELECT paymentID, bookingID, total, paymentStatus FROM Payment";
            
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Lặp qua các dòng dữ liệu từ ResultSet
            while (rs.next()) {
                int paymentID = rs.getInt("paymentID");
                int bookingID = rs.getInt("bookingID");
                int total = rs.getInt("total");
                String paymentStatus = rs.getString("paymentStatus");

                // Thêm dữ liệu vào danh sách
                PaymentData.add(new Object[]{paymentID, bookingID, total, paymentStatus});
            }

            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return PaymentData; // Trả về danh sách dữ liệu
    }
}
