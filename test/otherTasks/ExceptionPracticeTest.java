package otherTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionPracticeTest {
    @Test
    void testThrowsException(){
        ExceptionPractice practice = new ExceptionPractice();
        assertThrows(GreaterThanFiveException.class,
                ()-> practice.check(5));
    }
}