package ChapterFour;
/*
*   A valid right angled triangle must first be a triangle and then
*   the square of the length of the longest side has to be equal to the
*   sum of the squares of the other two sides*/

import java.util.Scanner;

public class RightAngledTriangleValidator {
    public static Boolean isRightAngledTriangle(int firstSide, int secondSide, int thirdSide) {
        int largest;
        final boolean firstSideIsHypothenus =
                Math.pow(firstSide, 2.0) == Math.pow(secondSide, 2.0) + Math.pow(thirdSide,
                2.0);
        final boolean secondSideIsHypothenus =
                Math.pow(secondSide, 2.0) == Math.pow(firstSide, 2.0) + Math.pow(thirdSide,
                        2.0);
        final boolean thirdSideIsHypothenus =
                Math.pow(thirdSide, 2.0) == Math.pow(firstSide, 2.0) + Math.pow(secondSide,
                        2.0);

        return firstSideIsHypothenus || secondSideIsHypothenus || thirdSideIsHypothenus;
    }

    public static void main(String[] args) {
        final int firstSide;
        final int secondSide;
        final int thirdSide;
        final boolean isTriangle;
        final boolean isRightAngledTriangle;
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangle: ");
        firstSide = scanner.nextInt();
        System.out.print("Enter the length of the second side of the triangle: ");
        secondSide = scanner.nextInt();
        System.out.print("Enter the length of the third side of the triangle: ");
        thirdSide = scanner.nextInt();

        isTriangle = TriangleSideValidator.isTriangle(firstSide, secondSide, thirdSide);
        isRightAngledTriangle = isRightAngledTriangle(firstSide, secondSide, thirdSide);

        if (isTriangle && isRightAngledTriangle){
            System.out.println("The length of sides can form a right angled triangle");
        }
        else{
            System.out.println("The lengths inputted cannot form a right angled triangle");
        }
    }
}
