
package module;


public class Payment {
    private String paymentID;
    private String bookingID;
    private int total;
    private String paymentStatus;

    public Payment(String paymentID, String bookingID, int total, String paymentStatus) {
        this.paymentID = paymentID;
        this.bookingID = bookingID;
        this.total = total;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public int getTotal() {
        return total;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
}
