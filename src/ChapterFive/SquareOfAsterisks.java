package ChapterFive;

import java.util.Scanner;

public class SquareOfAsterisks {

    public static void main(String[] args) {
        int lengthOfSide;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side of square: ");
        lengthOfSide = scanner.nextInt();

        for (int i = 0; i < lengthOfSide ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i < (lengthOfSide-1); i++) {
            System.out.print("*");
            for (int j = 1; j < (lengthOfSide-1) ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int j = 0; j < lengthOfSide ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
