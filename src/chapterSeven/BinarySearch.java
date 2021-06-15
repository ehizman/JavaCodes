package chapterSeven;

public class BinarySearch {
    private int indexOfElement;
    public int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int midIndex;
        while (low <= high){
            midIndex = (high + low)/2;
            if (key == array[midIndex]){
                indexOfElement = midIndex;
                return 0;
            }
            else{
                if (key < array[midIndex]){
                    high = midIndex - 1;
                }
                else{
                    low = midIndex + 1;
                }
            }
        }
        return -1;
    }

    public int findIndexOf(int[] array, int key) {
        if (binarySearch(array, key) == 0){
            return indexOfElement;
        }
        else{
            return -1;
        }
    }
}
