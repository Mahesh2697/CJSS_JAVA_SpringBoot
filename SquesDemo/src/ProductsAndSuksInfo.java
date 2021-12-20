import java.util.ArrayList;
import java.util.List;

public class ProductsAndSuksInfo {
    public static void main(String args[]){

        Skus sku1 = new Skus(1, "Medium", 300);
        Skus sku2 = new Skus(2, "Extra Large", 500);
        Skus sku3 = new Skus(1, "Large", 400);
        Skus sku4 = new Skus(3, "XXL", 650);
        Skus sku5 = new Skus(1, "Small", 250);

        List<Skus> sku = new ArrayList<>();
        sku.add(sku1);
        sku.add(sku2);
        sku.add(sku3);
        sku.add(sku4);
        sku.add(sku5);
        List<Skus> sk1 = new ArrayList<>();
        sk1.add(sku1);
        sk1.add(sku3);
        sk1.add(sku5);

        Products products1 = new Products(101,"T-Shirt", sk1);
        Products products2= new Products(102, "Shirt", sku);

        List<Products> product = new ArrayList<>();
        product.add(products1);
        product.add(products2);

        for(Products p: product){
            System.out.println(p.getProductId()+" "+p.getProductName());

            for (Skus sk: p.getSkusList() ){
                System.out.println(sk.getSkuId()+" "+sk.getSkuSize()+" "+sk.getPrice());
            }


        }

    }
}
