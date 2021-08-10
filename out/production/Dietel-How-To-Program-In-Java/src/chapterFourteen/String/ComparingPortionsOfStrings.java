package chapterFourteen.String;

import java.util.Scanner;

public class ComparingPortionsOfStrings {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Input the second string: ");
        String secondString = scanner.nextLine();

        System.out.println("Enter the number of characters to be compared: ");
        int numberOfCharactersToCompare = scanner.nextInt();

        System.out.println("Enter the starting index of the comparison: ");
        int startingIndexOfComparison = scanner.nextInt();

        boolean isAMatch = firstString.regionMatches(true, startingIndexOfComparison, secondString, startingIndexOfComparison,
                numberOfCharactersToCompare);
        if (isAMatch){
            System.out.println("The strings are equal");
        }
        else{
            System.out.println("The two strings are not equal");
        }
    }
}
