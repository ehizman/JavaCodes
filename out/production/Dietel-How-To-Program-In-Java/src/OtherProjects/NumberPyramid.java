package OtherProjects;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the highest factor of 2: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number + 1; i++) {
            for (int j = 1; j <= number + 1 - i; j++) {
                System.out.printf("%3s","  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d",(int)Math.pow(2,j));
            }
            for (int j = 0; j <= i-1 ; j++) {
                System.out.printf("%3d",(int)Math.pow(2,j));
            }
            System.out.println();
        }
    }
}