package assignments.ECommerceSystem;

import java.util.List;

public class Cart {
    private List<Product> products;
    private int quantity;
    private int price;

    public List<Product> addItemToCart(Product item) {
        products.add(item);
        return products;
    }

    public void setTotalPriceOfItemsInCart(Product product) {
        price += product.getProductPrice();
    }

    public int getTotalPriceOfItemsInCart() {
        return  price;
    }

    public List<Product> viewItemsInCart () {
        return products;
    }

    public void deleteItemsFromCart(String nameOfItemToDelete) {

    }

    public void Checkout() {
        Payment payment = new Payment();
    }

    public int getQuantityOfItemsInCart() {
        return quantity;
    }
}
