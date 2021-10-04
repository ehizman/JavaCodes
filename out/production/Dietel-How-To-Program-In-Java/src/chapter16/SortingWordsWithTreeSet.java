package chapter16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortingWordsWithTreeSet {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String [] tokens = sentence.toLowerCase().split(" ");
        Set<String> stringSet = new TreeSet<>(Arrays.asList(tokens));
        System.out.println(stringSet);
    }
}
