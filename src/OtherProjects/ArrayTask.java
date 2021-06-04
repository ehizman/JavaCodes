package OtherProjects;
import java.util.Arrays;
import java.time.*;

public class ArrayTask {
    private int numberOfMultipleOccurrencesOfDuplicates;
    public int findLargestElement(int[] arrayOfNumbers) {
        int maximumElement = arrayOfNumbers[0];
        for (int element : arrayOfNumbers) {
            if (element > maximumElement) {
                maximumElement = element;
            }
        }
        return maximumElement;
    }

    public int findSmallestElement(int[] arrayOfNumbers) {
        int minimumElement = arrayOfNumbers[0];
        for (int element : arrayOfNumbers){
            if (element < minimumElement){
                minimumElement = element;
            }
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
        int range = findLargestElement(arrayOfNumbers) - findSmallestElement(arrayOfNumbers);
        return range;
    }

    public boolean searchForElements(int numberToSearchFor, int[] arrayOfNumbers) {
        for (int element : arrayOfNumbers) {
            if (element == numberToSearchFor)
            return true;
        }
        return false;
    }

    public String findTwoLargestNumbers(int[] arrayOfNumbers) {
        int[] largestNumbers = new int[2];
        largestNumbers[0] = findLargestElement(arrayOfNumbers);
        int[] newArray = deleteElement(arrayOfNumbers, largestNumbers[0]);
        largestNumbers[1] = findLargestElement(newArray);
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

    public int[] sortArray(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] > arrayOfNumbers[j]){
                    int swapCell = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = swapCell;
                }
            }
        }
        return arrayOfNumbers;
    }

    public int[] findDuplicates(int[] arrayOfNumbers) {
        int[] arrayOfDuplicates = new int [arrayOfNumbers.length/2];
        int counter = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[j]){
                    if (!(findElement(arrayOfDuplicates, arrayOfNumbers[i]))){
                        arrayOfDuplicates[counter] = arrayOfNumbers[i];
                        counter++;
                    }
                    else{
                        this.numberOfMultipleOccurrencesOfDuplicates++;
                    }
                }
            }
        }
        int[] trimmedArrayOfDuplicates = new int[counter];
        for (int i = 0; i < counter; i++) {
            trimmedArrayOfDuplicates[i] = arrayOfDuplicates[i];
        }
        return trimmedArrayOfDuplicates;
    }

    public int findNumberOfDuplicatesOf(int number, int[] arrayOfNumbers) {
        boolean isElementInArray = findElement(arrayOfNumbers, number);
        int counter = 0;
        if (isElementInArray){
            for (int element : arrayOfNumbers) {
                if (element == number)
                    counter++;
            }
        }
        return counter;
    }
    public int[] deleteElement(int[] arrayOfNumbers, int numberToDelete) {
        boolean isElementInArray = findElement(arrayOfNumbers, numberToDelete);
        if (isElementInArray){
            int numberOfDuplicatesOf = findNumberOfDuplicatesOf(numberToDelete,arrayOfNumbers);
            int[] updatedArray = new int[arrayOfNumbers.length - numberOfDuplicatesOf];
            int counterForUpdateArray = 0;
            for (int arrayOfNumber : arrayOfNumbers) {
                if (arrayOfNumber != numberToDelete) {
                    updatedArray[counterForUpdateArray] = arrayOfNumber;
                    counterForUpdateArray++;
                }
            }
            return updatedArray;
        }
        else{
            return arrayOfNumbers;
        }
    }

    public int[] removeDuplicates(int[] arrayOfNumbers) {
        int[] arrayOfDuplicates = findDuplicates(arrayOfNumbers);
        int[] arrayWithDuplicatedElementsRemoved = arrayOfNumbers;
        for (int element : arrayOfDuplicates) {
            arrayWithDuplicatedElementsRemoved = deleteElement(arrayWithDuplicatedElementsRemoved,element);
        }
        int[] arrayWithoutDuplicates = new int[arrayWithDuplicatedElementsRemoved.length + arrayOfDuplicates.length];
        for (int i = 0; i < arrayWithDuplicatedElementsRemoved.length; i++) {
            arrayWithoutDuplicates[i] = arrayWithDuplicatedElementsRemoved[i];
        }
        int startPoint = arrayWithDuplicatedElementsRemoved.length;
        int counter = 0;
        while (counter < arrayOfDuplicates.length){
            arrayWithoutDuplicates[startPoint] = arrayOfDuplicates[counter];
            startPoint++;
            counter++;
        }

        return sortArray(arrayWithoutDuplicates);
    }
}
