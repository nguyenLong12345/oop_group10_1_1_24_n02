package control;

import main.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class deleteRoomControl {
    public boolean isRoomDataExist(int roomID) {
        boolean exists = false;
        try {
            Connection connection = DatabaseConnection.getConnection();
            String sql = "SELECT roomID FROM Booking WHERE roomID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, roomID);
            ResultSet rs = stmt.executeQuery();
            exists = rs.next(); // true nếu tồn tại
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exists;
    }
    
    public void delRoomToDatabase(int id) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "DELETE FROM Room WHERE roomID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
