package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import main.DatabaseConnection;
import module.Room;

public class searchRoomControl {

    private Room room;

    public Room searchRoom(int ID) {

        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Room WHERE roomID = ?";

            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setInt(1, ID);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                int roomID = rs.getInt("roomID");
                String roomType = rs.getString("roomType");
                int price = rs.getInt("price");
                String status = rs.getString("status");
                room = new Room(roomID, roomType, price, status);
            }

            rs.close();
            pstm.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return room;
    }
}
