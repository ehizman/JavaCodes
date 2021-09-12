package LeetCode;

import java.security.SecureRandom;
import java.util.*;

public class GenerateEvenRandomNumber {
    public static int randomEvenNumbers(){
        SecureRandom random = new SecureRandom();
        int number = 500000 + random.nextInt(1000001);
        while (!(isPrime(number))){
            number = 500000 + random.nextInt(1000001);
        }
        return number;
    }

    private static boolean isPrime(int element) {
        for (int i = 2; i <= (int)Math.sqrt(element) ; i++) {
            if (element % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        Integer[] array = {1,3,5,6,7,8};
//        List<Integer> integerList = Arrays.asList(array);
////        integerList.set(0, 56);
//        System.out.println(Arrays.toString(array));
//        System.out.println(integerList);
//        List<Integer> list2 = new LinkedList<>(integerList);
//        System.out.println("This is a linked list " + list2);

//        List<String> list =
//                Arrays.asList("yellow", "red", "green", "blue");
//        Collections.reverse(list);
//        System.out.println(list);
        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        Set<String> stringSet = new HashSet<>(Arrays.asList(colors));

        Set<String> newStringSet = new HashSet<>(stringSet);
    }
}
