package ChapterSeven;

import chapterSeven.TotalSales;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputeTotalSalesTest {
    @Test
    void testCanAddToSalesTable(){
        TotalSales.addToSalesTable("1","1","500");
        assertEquals(500, TotalSales.getTotalSales()[0][0]);
    }

    @Test
    void thatThrowsInvalidNumberFormatExceptionWhenCharacterInputsEntered(){
        assertDoesNotThrow(()-> TotalSales.checkForExceptions("e","f","g"));
    }

    @Test
    void canCalculateTotalSalesBySalesPersons(){
        TotalSales.addToSalesTable("1","1","500");
        TotalSales.addToSalesTable("2","2","400");
        TotalSales.addToSalesTable("3","3","200");
        TotalSales.addToSalesTable("4","4","400");
        TotalSales.addToSalesTable("1","5","500");
        assertArrayEquals(new int[]{1000,400,200,400}, TotalSales.computeTotalSalesPerSalesPersons());
    }

    @Test
    void canCalculateTotalSalesByProducts(){
        TotalSales.addToSalesTable("1","1","500");
        TotalSales.addToSalesTable("2","2","400");
        TotalSales.addToSalesTable("3","3","200");
        TotalSales.addToSalesTable("4","4","400");
        TotalSales.addToSalesTable("1","5","500");
        assertArrayEquals(new int[]{500,400,200,400,500},TotalSales.computeTotalSalesPerProduct());
    }
}


