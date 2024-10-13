
package module;


public class Booking {
    private String bookingID;
    private int customerID;
    private int roomID;
    private String checkInDate;
    private String checkOutDate;
    private String status;

    public Booking(int customerID, int roomID, String checkOutDate) {
        this.customerID = customerID;
        this.roomID = roomID;
        this.checkOutDate = checkOutDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookingID() {
        return bookingID;
    }

    public int getRoomID() {
        return roomID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    
}
