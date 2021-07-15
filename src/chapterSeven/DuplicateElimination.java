package chapterSeven;

import commonOperations.IoOperations;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DuplicateElimination {
    private static int[] array = new int[5];

    public static boolean checkIfNewElementIsDuplicated(int number, int lastIndexOfArray) {
        for (int i = 0; i <=lastIndexOfArray ; i++) {
            if(number == array[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number;
        int counter = 0;
        int numberOfElementsEntered = 0;
        boolean isElementDuplicated;
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.print("Enter a number: ");
                number = Integer.parseInt(scanner.next());

                if (number < 10 || number > 100){
                    throw new NoSuchElementException();
                }
                numberOfElementsEntered++;
                isElementDuplicated = checkIfNewElementIsDuplicated(number,counter);
                if(!isElementDuplicated){
                    array[counter] = number;
                    counter++;
                }
            }
            catch(NoSuchElementException e){
                System.out.println("number should be between 10 and 100");
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a valid number");
            }
        }while(numberOfElementsEntered < 5);

        System.out.print("Unique elements in the array are -> ");
        System.out.print("[ ");
        for (int i = 0; i < counter ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
