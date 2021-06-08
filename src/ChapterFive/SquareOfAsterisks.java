package ChapterFive;

import java.util.Scanner;

public class SquareOfAsterisks {

    public static void main(String[] args) {
        int lengthOfSide;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side of square: ");
        lengthOfSide = scanner.nextInt();
        for (int i = 1; i <= lengthOfSide ; i++) {
            if (i == 1 || i == lengthOfSide){
                for (int j = 1; j <= lengthOfSide ; j++) {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for (int j = 1; j <= lengthOfSide - 2 ; j++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
