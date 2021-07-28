package classwork.store_checkout_application_with_OOP;

import assignments.E_Store.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cart {
    private List<Item> collectionOfItems;

    public Cart(){
        collectionOfItems = new ArrayList<>();
    }
    public void add(Item... items) {
        for (Item item: items) {
            assert (item != null);
        }
        collectionOfItems.addAll(Arrays.asList(items));
    }

    public List<Item> getItemsInCart(){
        return Collections.unmodifiableList(collectionOfItems);
    }

    public void remove(Item item) {
        collectionOfItems.remove(item);
    }
}
