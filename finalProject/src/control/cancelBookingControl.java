
package control;

import main.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class cancelBookingControl {
    public void cancelBooking(int bookingID) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "DELETE FROM Booking WHERE bookingID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, bookingID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateStatusRoom(int roomID) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "UPDATE Room SET status = 'avalable' WHERE roomID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, roomID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
