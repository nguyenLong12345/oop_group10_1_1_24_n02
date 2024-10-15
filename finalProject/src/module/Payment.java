
package module;


public class Payment {
    private int paymentID;
    private int bookingID;
    private int total;
    private String paymentStatus;

    public Payment(int bookingID, int total) {
        this.bookingID = bookingID;
        this.total = total;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public int getTotal() {
        return total;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
}
