package chapterFourteen.compareTo;

import chapterFourteen.CompareTo;

import java.util.Scanner;

public class CompareToMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("\nPlease input the second string: ");
        String secondString = scanner.nextLine();
        String result = CompareTo.compare(firstString, secondString);
        System.out.printf("%n%s", result);
    }
}
