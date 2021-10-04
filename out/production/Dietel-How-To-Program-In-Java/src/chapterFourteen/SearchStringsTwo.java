package chapterFourteen;

import java.util.*;

public class SearchStringsTwo {
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase().replaceAll(" ", "");
        String[] letters = sentence.split("");

        Set<String> uniqueLetters = new HashSet<>(List.of(letters));
        Map<String, Integer> mapOfLettersAndCount = new HashMap<>();
        int count;

        for (String letter: uniqueLetters) {
            count = SearchingStrings.getCount(sentence, letter);
            mapOfLettersAndCount.put(letter, count);
        }

        System.out.println("""
                Letter    |     Count
                _____________________""");
        for (String key: mapOfLettersAndCount.keySet()) {
            System.out.printf("%-10s|%10d%n",key, mapOfLettersAndCount.get(key));
        }
    }
}
