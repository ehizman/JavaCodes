package chapterSeven;

import java.util.ArrayList;

public class Fibonacci {
    public ArrayList<Integer>fibonnaciSequence;

    public ArrayList<Integer> fibonacci(int nthTerm) {
        int nthTermInZeroBasedIndex = nthTerm -1;
        this.fibonnaciSequence = new ArrayList<>();
        this.fibonnaciSequence.add(0);
        this.fibonnaciSequence.add(1);

        if (nthTerm != 2) {
            for (int i = 2; i <= nthTermInZeroBasedIndex; i++) {
                int term =
                        fibonnaciSequence.get(i - 2) + fibonnaciSequence.get(i - 1);
                fibonnaciSequence.add(term);
            }
        }
        return fibonnaciSequence;
    }
}
