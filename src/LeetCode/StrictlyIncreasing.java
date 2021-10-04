package LeetCode;

import java.util.Arrays;
public class StrictlyIncreasing {
    public static int makeArrayIncreasing(int[] arrayOne, int[] arrayTwo) {
        //sort array2
        //remove duplicates
        arrayTwo = Arrays.stream(arrayTwo).sorted().distinct().toArray();
        int length = arrayOne.length;
        int numberOfSwaps = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arrayOne[i] >= arrayOne[i + 1]){
                boolean wasSwapped = compare(i, arrayOne, arrayTwo);
                if (wasSwapped){
                    numberOfSwaps++;
                }
            }
        }
        if (numberOfSwaps != 0){
            return numberOfSwaps;
        }
        return -1;
    }

    private static boolean compare(int i, int[] arrayOne, int[] arrayTwo) {
            //find the first element in array2 that is greater than element AT index i - 1 and that is less than i + 1
        for (int element: arrayTwo) {//iteration should start from last element swapped
            if (element != -1 && element > arrayOne[i - 1] && element < arrayOne[i + 1]){
                element = -1;
                arrayOne[i] = element;
                return true;
            }
        }
        return false;
    }
}
