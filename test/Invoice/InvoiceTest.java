package Invoice;

import ChapterThreeFiles.Invoice.Invoice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {
    Invoice invoice;

    @BeforeEach
    void testEachTestWithThis(){
        invoice = new Invoice("PRT001", "gearbox", 2, 5.0);
    }
    @Test
    void testThatConstructorInitializesFields(){
        assertAll(() -> assertEquals("PRT001", invoice.getPartNumber()),
                () -> assertEquals("gearbox", invoice.getPartDescription()),
                () -> assertEquals(2, invoice.getQuantity()),
                () -> assertEquals(5.0, invoice.getPrice()));
    }
    @Test
    void testThatPartDetailsCanBeSet(){
        invoice.setPartDescription("brake pad");
        invoice.setPartNumber("PRT 004");
        invoice.setPartQuantity(4);
        invoice.setPrice(200.00);
        assertAll(() -> assertEquals("brake pad", invoice.getPartDescription()),
                () -> assertEquals("PRT 004", invoice.getPartNumber()),
                () -> assertEquals(4, invoice.getQuantity()),
                () -> assertEquals(200.00, invoice.getPrice()));
    }
    @Test
    void testThatInvoiceAmountCanBeCalculated(){
        invoice.setPartQuantity(4);
        invoice.setPrice(250);
        assertEquals(1000, invoice.getInvoiceAmount(invoice.getPrice(), invoice.getQuantity()));
    }
    @Test
    void testThatQuantityIsAlwaysPositive(){
        invoice.setPartQuantity(-10);
        assertEquals(0, invoice.getQuantity());
    }

    @Test
    void testThatPriceIsAlwaysPositive(){
        invoice.setPrice(-10);
        assertEquals(0, invoice.getPrice());
    }
}
