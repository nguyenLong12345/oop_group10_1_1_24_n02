
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.DatabaseConnection;
import module.Room;


public class modifyRoomControl {
    public boolean modifyRoomToDatabase(Room room) {
        try {
            Connection connection = DatabaseConnection.getConnection();
           
            String query = "UPDATE Room SET roomType = ?, price = ?, status = ? WHERE roomID = ?";

            // Chuẩn bị câu lệnh SQL
            PreparedStatement pstm = connection.prepareStatement(query);
            pstm.setInt(4, room.getRoomID());
            pstm.setString(1, room.getRoomType());
            pstm.setInt(2, room.getPrice());
            pstm.setString(3, room.getStatus());

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
