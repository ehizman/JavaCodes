package Date;

import ChapterThreeFiles.DateClass.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {
    Date date;
    @BeforeEach
    void doThisBeforeEveryTest(){
        date = new Date(1994, "01", 28);
    }

    @Test
    void testThatConstructorInitializesDateFields(){
        assertAll(()-> assertEquals(1994, date.getYear()),
                ()-> assertEquals(1, date.getMonth()),
                () -> assertEquals(28, date.getDay()));
    }
    /*
    if an invalid value is entered for any of the date fields,
    constructor initializes to default:
    year - 2000
    month - 01
    day - 31
    */
    @Test
    void testThatConstructorValidatesFields(){
        //when
        date = new Date(1996, "2", 31);
        assertAll(() -> assertEquals(1996, date.getYear()),
                () -> assertEquals(2, date.getMonth()),
                () -> assertEquals(29, date.getDay()));
    }
    @Test
    void testThatDateCanBeDisplayedAccordingToFormat(){
        //when
        assertEquals("1994/1/28", date.displayDate());
    }
    @Test
    void testThatIfYearIsAfterCurrentYearThenReturnTheDefaultYear_2000(){
        date.setYear(2032);
        assertEquals(2000, date.getYear());
    }
    @Test
    void testThatYearCanBeSet(){
        date.setDay(45);
        assertEquals(31, date.getDay());
        date.setMonth("13");
        assertEquals(1, date.getMonth());
        date.setYear(2045);
        assertEquals(2000, date.getYear());
    }
    @Test
    void testThatMonthCanBeSet(){
        date.setMonth("12");
        assertEquals(12,date.getMonth() );
    }
    @Test
    void testThatMonthInputIsValid(){
        date.setMonth("14");
        assertEquals(1, date.getMonth());
    }

    @Test
    void testThatDayInputIsValidInA31DayMonth(){
        date.setMonth("1");
        assertEquals(1, date.getMonth());
        date.setDay(34);
        assertEquals(31, date.getDay());
    }
}
