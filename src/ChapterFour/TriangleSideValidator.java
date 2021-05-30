package ChapterFour;
/*
* For a valid triangle,
*   the sum of the lengths of any two sides of a triangle is always greater than the length of the third side
*   Similarly, the difference between the lengths of any two sides of a triangle is always less than the lenght of
*   the third side*/

import java.util.Scanner;

public class TriangleSideValidator {

    public static Boolean isValidTriangle(int firstSide, int secondSide, int thirdSide){
        boolean isTriangle = false;
        final boolean is_Sum_Of_FirstSide_And_SecondSide_Is_Greater_Than_Length_Of_ThirdSide =
                (firstSide + secondSide) > thirdSide;
        final boolean is_Sum_Of_FirstSide_And_ThirdSide_Is_Greater_Than_Length_Of_SecondSide =
                (firstSide + thirdSide) > secondSide;
        final boolean is_Sum_Of_SecondSide_And_ThirdSide_Is_Greater_Than_Length_Of_FirstSide =
                (secondSide + thirdSide) > firstSide;
        final boolean is_Difference_Between_Lengths_Of_FirstSide_And_SecondSide_Is_Less_Than_Length_Of_ThirdSide =
                (firstSide - secondSide) < thirdSide;
        final boolean is_Difference_Between_Lengths_Of_FirstSide_And_ThirdSide_Is_Less_Than_Length_Of_SecondSide =
                (firstSide - thirdSide) < secondSide;
        final boolean  is_Difference_Between_Lengths_Of_SecondSide_And_ThirdSide_Is_Less_Than_Length_Of_FirstSide =
                (secondSide - thirdSide) < firstSide;

        if (is_Sum_Of_FirstSide_And_SecondSide_Is_Greater_Than_Length_Of_ThirdSide && is_Sum_Of_FirstSide_And_ThirdSide_Is_Greater_Than_Length_Of_SecondSide && is_Sum_Of_SecondSide_And_ThirdSide_Is_Greater_Than_Length_Of_FirstSide){

            isTriangle = true;
        }

        if (!(is_Difference_Between_Lengths_Of_FirstSide_And_SecondSide_Is_Less_Than_Length_Of_ThirdSide && is_Difference_Between_Lengths_Of_FirstSide_And_ThirdSide_Is_Less_Than_Length_Of_SecondSide && is_Difference_Between_Lengths_Of_SecondSide_And_ThirdSide_Is_Less_Than_Length_Of_FirstSide && isTriangle)){
            isTriangle = false;
        }
        return isTriangle;
    }

    public static void main(String[] args) {
        final int firstSideOfTriangle;
        final int secondSideOfTriangle;
        final int thirdSideOfTriangle;
        final boolean isValidTriangle;
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of first side of the triangle: ");
        firstSideOfTriangle = scanner.nextInt();

        System.out.print("Enter the length of second side of the triangle: ");
        secondSideOfTriangle = scanner.nextInt();

        System.out.print("Enter the length of third side of the triangle: ");
        thirdSideOfTriangle = scanner.nextInt();

        isValidTriangle = isValidTriangle(firstSideOfTriangle, secondSideOfTriangle, thirdSideOfTriangle);
        if (isValidTriangle){
            System.out.println("The lengths are appropriate to form a triangle");
        }
    }
}
