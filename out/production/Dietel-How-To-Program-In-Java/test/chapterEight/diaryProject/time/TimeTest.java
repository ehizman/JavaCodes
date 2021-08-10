package chapterEight.diaryProject.time;

import chapterEight.Time;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimeTest {

    @Test
    void setTime(){
        Time clock = new Time(12,4,56);
        assertEquals("12:04:56", clock.displayUniversalTime());
    }

    @Test
    void throwsExceptionWhenInvalidInputIsEntered(){
        Time clock = new Time(25,61,56);
        assertEquals(0,clock.getHour());
    }

    @Test
    void displaysTimeInAM_PM_Format(){
        Time clock = new Time(22,4,56);
        assertEquals("10:04:56PM", clock.displayTwelveHourTime());
    }

    @Test
    void createsConstructor_With_Only_Hour_Parameter(){
        Time clock = new Time(0);
        assertEquals("12:00:00AM", clock.displayTwelveHourTime());
    }

    @Test
    void createsConstructor_With_Only_Hour_Parameter_And_Minute_Parameter(){
        Time clock = new Time(12, 23);
        assertEquals("12:23:00PM", clock.displayTwelveHourTime());
    }
}
