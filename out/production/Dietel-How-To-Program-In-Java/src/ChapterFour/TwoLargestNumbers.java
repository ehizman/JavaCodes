package ChapterFour;

import java.util.Scanner;

public class TwoLargestNumbers {

    public static void main(String[] args) {
        int larger = 0;
        int largest = 0;
        Scanner scanner = new Scanner(System.in);
        int input;

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Enter a new number: ");
            input = scanner.nextInt();
            if (input > largest){
                largest = input;
            }
            else{
                if (input > larger){
                    larger = input;
                }
            }
        }
        System.out.printf("The two largest numbers are %d and %d", largest, larger);
    }
}
