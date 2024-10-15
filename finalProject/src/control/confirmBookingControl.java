package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.DatabaseConnection;
import module.Payment;

public class confirmBookingControl {

    public void updateBookingStatus(int bookingID) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String sql = "UPDATE Booking SET status = 'confirm' WHERE bookingID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, bookingID);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public int getRoomPriceFromBooking(int bookingID) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String sql = "SELECT r.price FROM Booking b JOIN Room r ON b.roomID = r.roomID WHERE b.bookingID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, bookingID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("price");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public void savePayment(Payment payment) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String sql = "INSERT INTO Payment (bookingID, total) VALUES (?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, payment.getBookingID());
            stmt.setDouble(2, payment.getTotal());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
