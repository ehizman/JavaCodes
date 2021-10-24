package chapter18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Fibonacci_DynamicTest {
    @Test
    void calculateFibonacci(){
        Fibonacci_Dynamic calc = new Fibonacci_Dynamic();
        int result = calc.calculateFibonacciFor(3);
        assertEquals(2, result);
    }
    @Test
    void calculateFibonacci2(){
        Fibonacci_Dynamic calc = new Fibonacci_Dynamic();
        int result = calc.calculateFibonacciFor(5);
        assertEquals(5, result);
    }
    @Test
    void calculateFibonacci3(){
        Fibonacci_Dynamic calc = new Fibonacci_Dynamic();
        int result = calc.calculateFibonacciFor(6);
        assertEquals(8, result);
    }
}