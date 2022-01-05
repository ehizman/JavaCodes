package Hackerrank;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        String firstString = "Anagram";
        String secondString = "naAgrma";
        boolean result = checkForAnagrams(firstString, secondString);

        System.out.println(result);
    }
    public static boolean checkForAnagrams(String firstString, String secondString){
        if (firstString.length()!= secondString.length()){
            return false;
        }


        char[] firstStringAsCharArray = firstString.toCharArray();
        Arrays.sort(firstStringAsCharArray);
        firstString = String.valueOf(firstStringAsCharArray);

        char[] secondStringAsCharArray = secondString.toCharArray();
        Arrays.sort(secondStringAsCharArray);

        secondString = String.valueOf(secondStringAsCharArray);

        return firstString.equalsIgnoreCase(secondString);
    }
}
