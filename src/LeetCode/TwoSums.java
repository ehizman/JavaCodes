package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int remainder = target - numbers[i];
            if (!map.containsKey(remainder)){
                map.put(numbers[i], i);
            }
            else{
                return(new int[]{map.get(remainder), i});
            }
        }
        return null;
    }
}
