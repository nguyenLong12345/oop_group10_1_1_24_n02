
package module;


public class Booking {
    private String bookingID;
    private int roomID;
    private int customerID;
    private String checkInDate;
    private String checkOutDate;

    public Booking(String bookingID, int roomID, int customerID, String checkInDate, String checkOutDate) {
        this.bookingID = bookingID;
        this.roomID = roomID;
        this.customerID = customerID;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
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
