import java.util.List;

public class Products {

    private int productId;
    private String productName;
     List<Skus> skusList;

    public Products(int productId, String productName, List<Skus> skusList) {
        this.productId = productId;
        this.productName = productName;
        this.skusList = skusList;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Skus> getSkusList() {
        return skusList;
    }

    public void setSkusList(List<Skus> skusList) {
        this.skusList = skusList;
    }
}
