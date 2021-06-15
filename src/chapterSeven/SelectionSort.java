package chapterSeven;

import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] array) {
        int minimumIndex = 0;
        int smallestNumber;

        for (int i = 0; i < array.length; i++) {
            smallestNumber = array[i];
            minimumIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < smallestNumber){
                    smallestNumber = array[j];
                    minimumIndex = j;
                }
            }
            if (i != minimumIndex){
                array[minimumIndex] = array[i];
                array[i] = smallestNumber;
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
