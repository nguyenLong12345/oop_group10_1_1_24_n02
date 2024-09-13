package Code1Week2;

public class NameNumber {
    private String lastName;
    private String telNumber;

    public NameNumber() {
    }

    public NameNumber(String name, String num) {
        this.lastName = name;
        this.telNumber = num;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getTelNumber() {
        return this.telNumber;
    }
}