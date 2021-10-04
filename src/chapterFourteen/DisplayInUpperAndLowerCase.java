package chapterFourteen;

import java.util.Scanner;

public class DisplayInUpperAndLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("sentence in all uppercase-> %s%n", sentence.toUpperCase());
        System.out.printf("sentence in all lowercase-> %s%n", sentence.toLowerCase());
    }
}
