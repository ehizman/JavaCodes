package chapter18;

public class Fibonacci_Dynamic {

    public int calculateFibonacciFor(int term) {
        int[] lookout = new int[term+1];
        if (term <= 1){
            if (term == 0){
                return 0;
            }
            else{
                return 1;
            }
        }
        if (lookout[term] != 0){
            return lookout[term];
        }
        else{
            lookout[term] = calculateFibonacciFor(term-2)+calculateFibonacciFor(term-1);
            return lookout[term];
        }
    }
}
