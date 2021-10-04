package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        countDuplicates(sentence);
    }

    private static void countDuplicates(String sentence) {
        String[] tokens = sentence.replaceAll("[,.'\"=+\\-]", "").toLowerCase().split(" ");
        Arrays.stream(tokens).sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .forEach(element -> {
                    System.out.printf("%s - %d%n", element, Collections.frequency(Arrays.asList(tokens), element));
                });

    }
}
