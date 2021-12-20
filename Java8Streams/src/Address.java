public class Address {
    private String location;
    private String pinCode;

    public Address(String location, String pinCode) {
        this.location = location;
        this.pinCode = pinCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPinCode() {
        return pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;

    }

}
