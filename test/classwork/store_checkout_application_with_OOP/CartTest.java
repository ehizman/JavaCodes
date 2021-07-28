package classwork.store_checkout_application_with_OOP;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    void testConstructor(){
        Cart newCart = new Cart();
        assertNotNull(newCart);
    }

    @Test
    void canAddItemsToCart(){
        Cart newCart = new Cart();
        Item item = new Item("2 Cartons of Indomie", BigDecimal.valueOf(2600.00), 4);
        newCart.add(item);
        assertEquals(1, newCart.getItemsInCart().size());
    }

    @Test
    void canRemoveItemsFromCart(){
        Cart newCart = new Cart();
        Item item = new Item("2 Cartons of Indomie", BigDecimal.valueOf(2600.00), 4);
        newCart.add(item);
        newCart.remove(item);
        assertEquals(0, newCart.getItemsInCart().size());
    }

    @Test
    void cannotAddToCartList(){
        Cart newCart = new Cart();
        Item item = new Item("2 Cartons of Indomie", BigDecimal.valueOf(2600.00), 4);
        newCart.add(item);
        List<Item> cartList = newCart.getItemsInCart();
        try{
            cartList.add(item);
            fail(()->"Should throw instance of UnsupportedOperationException");
        }
        catch (UnsupportedOperationException error){
            assertEquals(1, newCart.getItemsInCart().size(), ()-> "Should throw " +
                    "instance UnsupportedOperationException");
        }
    }

    @Test
    void cannotAddANullItemToCart(){
        Cart newCart = new Cart();
        Item item = null;
        try{
            newCart.add(item);
            fail(()-> "Should throw Assertion error");
        }
        catch (AssertionError e){
            assertEquals(0, newCart.getItemsInCart().size());
        }
    }

    @Test
    void canAddMultipleItemsAtOnce(){
        Cart newCart = new Cart();
        Item item = new Item("2 Cartons of Indomie", BigDecimal.valueOf(2600.00), 4);
        Item itemTwo = new Item("2 Big of Rice", BigDecimal.valueOf(26000.00), 2);
        newCart.add(item, itemTwo);
        assertEquals(2, newCart.getItemsInCart().size());
    }

    @Test
    void canAddCalculateTotalWorthOfItemsInCart(){
        Cart newCart = new Cart();
        Item item = new Item("Cartons of Indomie", BigDecimal.valueOf(2600.00), 4);
        Item itemTwo = new Item("Big of Rice", BigDecimal.valueOf(26000.00), 2);
        newCart.add(item, itemTwo);
        newCart.calculateTotalWorthOfItems();
        assertEquals(BigDecimal.valueOf(62400.0), newCart.calculateTotalWorthOfItems());
    }
}
