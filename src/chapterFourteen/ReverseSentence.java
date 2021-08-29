package chapterFourteen;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and I will reverse the words: ");
        String sentence = scanner.nextLine();
        String[] tokens = sentence.split(" ");
        for (int i = tokens.length - 1; i >= 0 ; i--) {
            System.out.printf("%s ", tokens[i]);
        }
    }
}
