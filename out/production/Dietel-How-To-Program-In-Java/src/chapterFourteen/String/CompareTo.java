package chapterFourteen.String;

import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Input the second string: ");
        String secondString = scanner.nextLine();
        if (firstString.compareTo(secondString) < 0){
            System.out.printf("%s is less than %s", firstString, secondString);
        }
        else{
            if (firstString.compareTo(secondString) == 0){
                System.out.println("Both strings are equal");
            }
            else{
                System.out.printf("%s is greater than %s", firstString, secondString);
            }
        }
    }
}
