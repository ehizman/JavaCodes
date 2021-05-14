package ECommerceSystem;

import java.util.Random;

public class Product {
    private int productId;
    private String productName;
    private String supplierDetails;
    private int price;

    public void setProductId(){
        productId = new Random().nextInt(4848489);
    }

    public void updateProductInformation(String name, String supplierDetails, int price){
        this.supplierDetails = supplierDetails;
        this.price = price;
        this.productName = name;
    }

    public String getProductInformation() {
        return (productName + ":" + productId + ":" + supplierDetails + ":" + price);
    }


    public int getProductPrice() {
        return price;
    }

}
