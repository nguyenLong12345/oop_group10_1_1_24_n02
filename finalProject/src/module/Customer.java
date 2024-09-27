
package module;


public class Customer {
    private int customerID;
    private String name;
    private int phone;
    private String address;

    public Customer(int customerID, String name, int phone, String address) {
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
