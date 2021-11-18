import model.ProductsModel;
import model.SkuModel;
import java.util.ArrayList;
import java.util.List;

public class ProductsSkusData {
    public static void main(String args[]){
        SkuModel sku1 = new SkuModel("sku1", "M", 200f);
        SkuModel sku2 = new SkuModel("sku2", "L", 210f);
        SkuModel sku3 = new SkuModel("sku3", "S", 190f);
        SkuModel sku4 = new SkuModel("sku4", "M", 300f);

        List<SkuModel> skus1 = new ArrayList<>();
        skus1.add(sku1);
        skus1.add(sku2);
        skus1.add(sku3);
        List<SkuModel> skus2 = new ArrayList<>();
        skus2.add(sku4);
        skus2.add(sku2);

        ProductsModel product1 = new ProductsModel("product1", "pName1", skus1);
        ProductsModel product2 = new ProductsModel("product2", "pName2", skus2);

        List<ProductsModel> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        products.forEach(product -> {
            System.out.println("\nProductName: " + product.getProductName());
            product.getSkus().forEach(sku -> {
                System.out.println("\nsku: " + sku.getSkuId());
            });
        });

    }
}

