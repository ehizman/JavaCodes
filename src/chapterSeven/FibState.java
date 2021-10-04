package chapterSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.LongSupplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FibState {
    private long[] prev = new long[2];
    private int index = 0;

    public long nextFib(){
        long result = 0;
        if (index == 0){
            result = 1;
        }
        else{
            if (index == 1){
                result = 1;
            }
            else{
                result = prev[0] + prev[1];
                prev[0] = prev[1];
                prev[1] = result;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongStream longStream = LongStream.generate(new FibSupplier());
        longStream.limit(5).forEach(System.out::println);
    }
}

class FibSupplier implements LongSupplier{
    Long current = 0L;
    Long previous = 1L;

    @Override
    public long getAsLong() {
        Long result = current;
        current = previous + current;
        previous = result;
        return result;
    }
}
