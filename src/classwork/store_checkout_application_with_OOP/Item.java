package classwork.store_checkout_application_with_OOP;

import java.math.BigDecimal;

public class Item {
    private String productName;
    private BigDecimal pricePerUnit;
    private int quantity;

    public Item(String productName, BigDecimal pricePerUnit, int quantity){
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public String getProductName(){
        return productName;
    }

    public BigDecimal getPricePerUnit(){
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }
}
