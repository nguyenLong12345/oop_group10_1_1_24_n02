
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.DatabaseConnection;
import module.Payment;

public class makePaymentControl {
    public void updatePaymentStatus(int paymentID) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String sql = "UPDATE Payment SET paymentStatus = 'done' WHERE paymentID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, paymentID);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public int getRoomIDForMakePayment(int bookingID) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String sql = "SELECT roomID FROM Booking WHERE bookingID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, bookingID);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("roomID");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
