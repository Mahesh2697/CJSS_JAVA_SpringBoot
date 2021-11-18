package model;

public class SkuModel {
    private String skuId;
    private String skuSize;
    private float price;

    public SkuModel(String skuId, String skuSize, float price) {
        this.skuId = skuId;
        this.skuSize = skuSize;
        this.price = price;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuSize() {
        return skuSize;
    }

    public void setSkuSize(String skuSize) {
        this.skuSize = skuSize;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

