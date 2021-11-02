package chapter17;

import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomStream {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Long> map = random.ints(6_000_000, 1,7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.printf("%-11s %11s%n","Face", "Frequency");
        map.forEach((face, frequency) -> {
            System.out.printf("%-11d %11d%n", face, frequency);
        });
    }
}
