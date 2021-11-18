package model;
import java.util.List;

public class ProductsModel {
    private String productId;
    private String productName;
    List<SkuModel> skus;

    public ProductsModel(String productId, String productName, List<SkuModel> skus) {
        this.productId = productId;
        this.productName = productName;
        this.skus =skus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<SkuModel> getSkus() {
        return skus;
    }

    public void setSkus(List<SkuModel> skus) {
        this.skus = skus;
    }
}
