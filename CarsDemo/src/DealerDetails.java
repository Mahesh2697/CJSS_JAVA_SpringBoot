import java.util.List;

public class DealerDetails {
    private String name;
    private String address;
    private String number;
    private List<CarsDetails> carsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<CarsDetails> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<CarsDetails> carsList) {
        this.carsList = carsList;
    }


}
