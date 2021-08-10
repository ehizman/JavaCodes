package classwork.store_checkout_application_with_OOP;

import assignments.E_Store.Items;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cart {
    private List<Item> collectionOfItems;

    public Cart(){
        collectionOfItems = new ArrayList<>();
    }
    public void add(Item item) {
        assert (item != null);
        collectionOfItems.add(item);
    }

    public List<Item> getItemsInCart(){
        return Collections.unmodifiableList(collectionOfItems);
    }

    public void remove(Item item) {
        collectionOfItems.remove(item);
    }

    public BigDecimal calculateTotalWorthOfItems() {
        BigDecimal totalWorthOfItemsInCart = BigDecimal.ZERO;
        for (Item item: collectionOfItems) {
            totalWorthOfItemsInCart =
                    totalWorthOfItemsInCart.add(item.getPricePerUnit().multiply(BigDecimal.valueOf(item.getQuantity())));
        }
        return totalWorthOfItemsInCart;
    }
}
