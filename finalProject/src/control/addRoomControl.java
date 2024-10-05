
package control;

import main.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import module.Room;

public class addRoomControl {
    public boolean addRoomToDatabase(Room room) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            
            // SQL Insert Query
            String query = "INSERT INTO Room (roomID, roomType, price, status) VALUES (?, ?, ?, ?)";

            // Chuẩn bị câu lệnh SQL
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setInt(1, room.getRoomID());
            pstm.setString(2, room.getRoomType());
            pstm.setInt(3, room.getPrice());
            pstm.setString(4, room.getStatus());

            // Thực thi câu lệnh SQL
            int rowsInserted = pstm.executeUpdate();

            // Đóng kết nối
            pstm.close();
            connection.close();

            return rowsInserted > 0;  // Trả về true nếu thêm thành công

        } catch (SQLException e) {
            e.printStackTrace();
            return false;  // Trả về false nếu có lỗi xảy ra
        }
    }

}
