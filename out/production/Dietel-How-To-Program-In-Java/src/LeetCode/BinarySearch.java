package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        //iterative solution to binary search
        int high = nums.length - 1;
        int low = 0;

        while (low <= high){
            int mid = low + ((high - low)/2);

            if (nums[mid] == target)
                return mid;
            else{
                if (nums[mid] < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    /*
    * ------- recursive solution ----
    * int high = nums.length;
    * int low = 0;
    *
    * int search(int[] array, int low, int high, int target){
    *   if (low > high)
    *       return -1;
    *   int mid = low + ((high - low)/2);
    *
    *   if (array[mid] == target)
    *       return mid;
    *   else{
    *       if (array[mid] < target){
    *           low = mid + 1;
    *           return (search(array, low, high, target));
    *       }
    *       else{
    *           high = mid - 1;
    *           return (search(array, low, high, target));
    *       }
    *    }
    * }
    * */
}
