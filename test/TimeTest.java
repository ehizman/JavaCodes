import chapterEight.Time;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeTest {

    @Test
    void setTime(){
        Time clock = new Time();
        clock.setTime(12,4,56);
        assertEquals("12:04:56", clock.displayUniversalTime());
    }

    @Test
    void throwsExceptionWhenInvalidInputIsEntered(){
        Time clock = new Time();
        assertThrows(NoSuchElementException.class, ()-> clock.setTime(25,61,56));
    }

    @Test
    void displaysTimeInAM_PM_Format(){
        Time clock = new Time();
        clock.setTime(22,4,56);
        assertEquals("10:04:56PM", clock.displayUniversalTime());
    }
}
