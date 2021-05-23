package chapterTwo;

import java.util.Scanner;

public class CircleDimensions {

    public static void main(String[] args) {

        int radius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        radius = scanner.nextInt();

        System.out.printf("Diameter of circle: %d%n", (2*radius));
        System.out.printf("Circumference of circle: %.2f%n", (2 * Math.PI * radius));
        System.out.printf("Area of circle: %.2f%n", (Math.PI) * Math.pow(radius, 2));
    }
}
