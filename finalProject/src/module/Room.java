
package module;


public class Room {
    private int roomID;
    private String roomType;
    private int price;
    private String status;

    public Room(int roomID, String roomType, int price, String status) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.price = price;
        this.status = status;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
