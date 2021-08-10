package chapterFourteen;

import java.util.Scanner;

public class ComparingPortionsOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a sentence: ");
        String firstString = scanner.nextLine();
        System.out.print("\nPlease input a sub string to find in the sentence: ");
        String subString = scanner.nextLine();
        System.out.print("Enter the number of characters to compare: ");
        int numberOfCharactersToCompare = scanner.nextInt();
        System.out.println("Enter the starting index of the comparison for the first string");
        int startingIndexOfComparisonForFirstString = scanner.nextInt();

        System.out.println("Enter the starting index of the comparison for the first string");
        scanner.nextLine();
        int startingIndexOfComparisonForSecondString = scanner.nextInt();
        if (firstString.regionMatches(true,startingIndexOfComparisonForFirstString, subString,
                startingIndexOfComparisonForSecondString,
                numberOfCharactersToCompare)){
            System.out.println("The strings match");
        }
        else{
            System.out.println("The strings do not match");
        }

    }
}
