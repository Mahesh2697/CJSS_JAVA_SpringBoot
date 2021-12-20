public class Skus {
    private  int skuId;
    private  String skuSize;
    private double price;

    public Skus(int skuId, String skuSize, double price) {
        this.skuId = skuId;
        this.skuSize = skuSize;
        this.price = price;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

    public String getSkuSize() {
        return skuSize;
    }

    public void setSkuSize(String skuSize) {
        this.skuSize = skuSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
