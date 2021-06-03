package OtherProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTask {

    public int findMaximumElement(int[] arrayOfNumbers) {
        int maximumElement = Integer.MIN_VALUE;
        for (int element : arrayOfNumbers) {
            maximumElement = Math.max(element, maximumElement);
        }
        return maximumElement;
    }

    public int findSmallestElement(int[] arrayOfNumbers) {
        int minimumElement = Integer.MAX_VALUE;
        for (int element : arrayOfNumbers){
            minimumElement = Math.min(element, minimumElement);
        }
        return minimumElement;
    }

    public int sumOfElementsInArray(int[] arrayOfNumbers) {
        int sum = 0;
        for(int element: arrayOfNumbers){
            sum = sum + element;
        }
        return sum;
    }

    public int getRangeOfElementsInArray(int[] arrayOfNumbers) {
        int range = findMaximumElement(arrayOfNumbers) - findSmallestElement(arrayOfNumbers);
        return range;
    }

    public boolean searchForElements(int numberToSearchFor, int[] arrayOfNumbers) {
        for (int element : arrayOfNumbers) {
            if (element == numberToSearchFor)
            return true;
        }
        return false;
    }

    public int[] deleteElement(int[] arrayOfNumbers, int elementToDelete) {
        List <Integer> newList = new ArrayList<>();
        for (int element : arrayOfNumbers) {
            if (element !=  elementToDelete){
                newList.add(element);
            }
        }
        int[]  updatedArray = new int[newList.size()];
        for (int i = 0; i < updatedArray.length; i++) {
            updatedArray[i] = newList.get(i);
        }
        return updatedArray;
    }

    public String findTwoLargestNumbers(int[] arrayOfNumbers) {
        int[] largestNumbers = new int[2];
        largestNumbers[0] = findMaximumElement(arrayOfNumbers);
        int[] newArray = deleteElement(arrayOfNumbers, largestNumbers[0]);
        largestNumbers[1] = findMaximumElement(newArray);
        return Arrays.toString(largestNumbers);
    }

    public double findAverage(int[] arrayOfNumbers) {
        int sum = sumOfElementsInArray(arrayOfNumbers);
        return ((double)sum/ arrayOfNumbers.length);
    }

    public boolean findElement(int[] arrayOfNumbers, int elementToSearchFor) {
        for (int element: arrayOfNumbers) {
            if (element == elementToSearchFor){
                return true;
            }
        }
        return false;
    }

    public String findTwoSmallestNumbers(int[] arrayOfNumbers) {
        int[] smallestNumbers = new int[2];
        smallestNumbers[0] = findSmallestElement(arrayOfNumbers);
        int[] newArray = deleteElement(arrayOfNumbers, smallestNumbers[0]);
        smallestNumbers[1] = findSmallestElement(newArray);
        return Arrays.toString(smallestNumbers);
    }
//
//    public int[] sortArray() {
//
//    }
}
