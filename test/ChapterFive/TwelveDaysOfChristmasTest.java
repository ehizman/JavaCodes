package ChapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwelveDaysOfChristmasTest {
    @Test
    void testThatUserCanChooseLyricsOfDayToDisplay(){
        TwelveDaysOfChristmas displayLyricsApp = new TwelveDaysOfChristmas();
        String prompt = displayLyricsApp.displayPrompt();
        assertEquals("""
                -> Press 1 to display lyrics for the first day;
                -> Press 2 to dipaly lyrics for the second day;
                -> Press 3 to display lyrics for the third day;
                -> Press 4 to display lyrics for the fourth day;
                -> Press 5 to display lyrics for the fifth day;
                -> Press 6 to display lyrics for the sixth day;
                -> Press 7 to display lyrics for the seventh day;
                -> Press 8 to display lyrics for the eight day;
                -> Press 9 to display lyrics for the ninth day;
                -> Press 10 to display lyrics for the tenth day;
                -> Press 11 to display lyrics for the eleventh day;
                -> Press 12 to display lyrics for the twelveth day;
                """, prompt);
    }

    @Test
    void testThatUserCanChooseDayToDisplay(){
        TwelveDaysOfChristmas displayLyricsApp = new TwelveDaysOfChristmas();
        assertAll(
                () -> assertEquals("""
                        The first day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(1)),
                () -> assertEquals("""
                        The second day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(2)),
                () -> assertEquals("""
                        The third day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(3)),
                () -> assertEquals("""
                        The fourth day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(4)),
                () -> assertEquals("""
                        The fifth day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(5)),
                () -> assertEquals("""
                        The sixth day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(6)),
                () -> assertEquals("""
                        The seventh day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(7)),
                () -> assertEquals("""
                        The eight day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(8)),
                () -> assertEquals("""
                        The ninth day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(9)),
                () -> assertEquals("""
                        The tenth day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(10)),
                () -> assertEquals("""
                        The eleventh day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(11)),
                () -> assertEquals("""
                        The twelveth day of Christmas,
                        My true love sent to me
                        """, displayLyricsApp.chooseDay(12))
        );
    }

    @Test
    //a valid input is when a user selects a number between 1 and 12
    void testThatAppropriateErrorMessageIsDisplayedForAnInvalidInput(){
        TwelveDaysOfChristmas displayLyricsApp = new TwelveDaysOfChristmas();
        assertEquals("Please enter a valid input", displayLyricsApp.chooseDay(0));
    }

    @Test
    void testThatTheAppropriateLyricsIsDisplayedWhenUserEnterCorrectInput(){
        TwelveDaysOfChristmas displayLyricsApp = new TwelveDaysOfChristmas();
        String lyrics = displayLyricsApp.displayLyrics(1);
        System.out.println(lyrics);

//        assertTrue(lyrics.equals("""
//                Twelve drummers drumming,
//                Eleven pipers piping,
//                Ten lords a leaping,
//                Nine ladies dancing,
//                Eight maids a milking,
//                Seven swans a swimming,
//                Six geese a laying,
//                Five gold rings,
//                Four calling birds,
//                Three French hens
//                Two turtle doves, and
//                A partridge in a pear tree.
//                """));
    }
}
