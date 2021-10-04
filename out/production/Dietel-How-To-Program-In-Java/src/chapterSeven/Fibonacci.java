package chapterSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fibonacci {

    public static int fibonacci(int nthTerm) {
        List<Integer> fibonnaciSequence = new ArrayList<>();
        fibonnaciSequence.add(0);
        fibonnaciSequence.add(1);

        if (nthTerm != 2) {
            for (int i = 2; i <= nthTerm; i++) {
                int term =
                        fibonnaciSequence.get(i - 2) + fibonnaciSequence.get(i - 1);
                fibonnaciSequence.add(term);
            }
        }
        return fibonnaciSequence.get(nthTerm);
    }

    public static void main(String[] args) {
//        int fibonnaciNumber = fibonacci(6);
//        System.out.println(fibonnaciNumber);
//
//        int fibonnacciNumber = fibonnaciWithRecursion(5);
//        System.out.println(fibonnacciNumber);

        //generate fibonnacci numbers upto 20th term and display those that are even

        //generate an infinite stream of even numbers
//        Stream<Integer> infiniteStreamOfEvenNumbers = Stream.iterate(0, n -> n + 2);
//        infiniteStreamOfEvenNumbers.limit(10).forEach(System.out::println);

        //generate an infinite stream of even numbers
//        Stream<Integer> infiniteStreamOfOddNumbers = Stream.iterate(1, n -> n + 2);
//        infiniteStreamOfOddNumbers.limit(10).forEach(System.out::println);

        //generate an infinite stream of fibonnacci numbers



    }
    public static int fibonnaciWithRecursion(int nthTerm){
        if (nthTerm < 2){
            return nthTerm;
        }
        else{
            return fibonnaciWithRecursion(nthTerm - 2) + fibonnaciWithRecursion(nthTerm - 1);
        }
    }
}
