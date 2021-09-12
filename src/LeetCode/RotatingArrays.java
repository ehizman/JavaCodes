package LeetCode;


import java.util.Arrays;

public class RotatingArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 56, 7, 6, 89, 6, 4, 5, 6, 7};
        rotate(nums, 5);
    }
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start = start + 1;
            end = end - 1;
        }
    }
}
