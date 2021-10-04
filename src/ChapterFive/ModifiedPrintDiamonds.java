package ChapterFive;

import java.util.Scanner;

public class ModifiedPrintDiamonds {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number between 1 and 19: ");
        int number = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <=number ; i+=2) {
            for (int j = 1; j <= ((number + 1)/2) - ((i +1)/2) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= ((number + 1)/2) - ((i +1)/2) ; j++) {
                System.out.print("  ");
            }
            Thread.sleep(1000);
            System.out.println();
        }
        for (int i = 1; i <= (number - 1); i+=2) {
            for (int j = 1; j <= ((i + 1)/2) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= number - 1 - i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= ((i + 1)/2) ; j++) {
                System.out.print("  ");
            }
            Thread.sleep(1000);
            System.out.println();
        }
    }
}
