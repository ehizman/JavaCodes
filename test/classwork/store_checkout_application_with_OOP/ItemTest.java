package classwork.store_checkout_application_with_OOP;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {
    @Test
    void canCreateConstructor(){
        Item item = new Item("Dettol Soap", BigDecimal.valueOf(450.00), 5);
        assertAll(
                () -> assertEquals("Dettol Soap", item.getProductName()),
                () -> assertEquals(BigDecimal.valueOf(450.00), item.getPricePerUnit()),
                () -> assertEquals(5, item.getQuantity())
        );
    }

    @Test
    void testToStringMethod(){
        Item item = new Item("Dettol Soap", BigDecimal.valueOf(450.00), 5);
        assertEquals(String.format("%-15s%-15.2f%-10d%-10.2f%n","Dettol Soap", BigDecimal.valueOf(450.00), 5,
                BigDecimal.valueOf(450.00).multiply(BigDecimal.valueOf(5))), item.toString());
    }
}
