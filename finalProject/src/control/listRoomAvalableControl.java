
package control;
import main.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class listRoomAvalableControl {
    public List<Object[]> listRoomAvalable() {
        List<Object[]> roomData = new ArrayList<>();
        
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
}
