package chapter17;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringStreamOperations {
    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue"
        ,"indigo", "Violet"};

        Predicate<String> stringPredicate = (element) -> element.compareToIgnoreCase("n") < 0;

        System.out.println("Strings greater than m sorted ascending order" +Arrays.stream(strings)
                .filter(stringPredicate.negate())
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));
    }

}
