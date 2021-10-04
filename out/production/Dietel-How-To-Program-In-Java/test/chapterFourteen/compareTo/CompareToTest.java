package chapterFourteen.compareTo;

import chapterFourteen.CompareTo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompareToTest {
    @Test
    void testThatTwoStringAreEqual(){
        String firstString = "hello";
        String secondString = "hello";
        Assertions.assertThat(CompareTo.compare(firstString, secondString)).isEqualTo("hello is equal to hello");
    }

    @Test
    void testThatFirstStringIsGreaterThanSecondString(){
        String firstString = "Hello";
        String secondString = "George";
        assertThat(CompareTo.compare(firstString, secondString)).isEqualTo("Hello is greater than George");
    }

    @Test
    void testThatFirstStringIsLessThanSecondString(){
        String firstString =  "George" ;
        String secondString ="Hello";
        assertThat(CompareTo.compare(firstString, secondString)).isEqualTo("George is less than Hello");
    }

}