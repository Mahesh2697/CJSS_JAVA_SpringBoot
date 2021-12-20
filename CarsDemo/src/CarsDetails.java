public class CarsDetails {
    private String carName;
    private double price;

    private QuantityDetails quantityDetails;

    public QuantityDetails getQuantityDetails() {
        return quantityDetails;
    }

    public void setQuantityDetails(QuantityDetails quantityDetails) {
        this.quantityDetails = quantityDetails;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
