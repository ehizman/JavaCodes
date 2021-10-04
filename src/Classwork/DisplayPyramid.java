package Classwork;
import java.util.Scanner;
public class DisplayPyramid {

    public static void main(String[] args) {
        int numberOfLines;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        numberOfLines = scanner.nextInt();

        for (int i = 1; i <= numberOfLines; i++) {

            for (int j = 1; j <= numberOfLines - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
