package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.DatabaseConnection;
import module.Booking;
import module.Customer;

public class bookRoomControl {

    public boolean isCustomerExist(int customerID) {
        boolean exists = false;
        try {
            Connection connection = DatabaseConnection.getConnection();
            String sql = "SELECT customerID FROM Customer WHERE customerID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, customerID);
            ResultSet rs = stmt.executeQuery();
            exists = rs.next(); // true nếu tồn tại
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }

    public void saveCustomer(Customer customer) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String customerSQL = "INSERT INTO Customer (customerID, name, phone, address) VALUES (?, ?, ?, ?)";
            PreparedStatement customerStmt = connection.prepareStatement(customerSQL);
            customerStmt.setInt(1, customer.getCustomerID());
            customerStmt.setString(2, customer.getName());
            customerStmt.setInt(3, customer.getPhone());
            customerStmt.setString(4, customer.getAddress());
            customerStmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void saveBooking(Booking booking) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String bookingSQL = "INSERT INTO Booking (customerID, roomID, checkOutDate) VALUES (?, ?, ?)";
            PreparedStatement bookingStmt = connection.prepareStatement(bookingSQL);
            bookingStmt.setInt(1, booking.getCustomerID());
            bookingStmt.setInt(2, booking.getRoomID());
            bookingStmt.setString(3, booking.getCheckOutDate());
            bookingStmt.executeUpdate();

            // Cập nhật trạng thái phòng
            String query = "UPDATE Room SET status = ? WHERE roomID = ?";
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setString(1, "full");
            pstm.setInt(2, booking.getRoomID());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
