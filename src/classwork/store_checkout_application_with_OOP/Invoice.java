package classwork.store_checkout_application_with_OOP;

public class Invoice {
    Cart cart;
    public Invoice(Cart cart){
        this.cart = cart;
    }
    void displayInvoice(){
        final int[] count = {1};
        System.out.printf("%-4s%-15s%-15s%-10s%-10s%n", "S/N", "Product", "Unit Price", "Quantity", "Total");
        cart.getItemsInCart().forEach(item -> {
            System.out.printf("%-4d",count[0]);
            System.out.println(item.toString());
            count[0]++;
        });
        System.out.printf("Amount to pay: %.2f", cart.calculateTotalWorthOfItems());
    }
}
