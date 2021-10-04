package Classwork.Hackerrank;

import java.util.*;
import java.util.stream.IntStream;

public class MergeTheTools {
    public static void main(String[] args) {
        merge_the_tools("AABCAAADDCDABBA", 3);
    }

    private static void merge_the_tools(String string, int lengthOfSubString) {
        int numberOfSubStrings = string.length()/lengthOfSubString;
        int start = 0;
        List<String> listOfSubStrings = new ArrayList<>();
        for (int i = 0; i < numberOfSubStrings; i++) {
            CharSequence subString = string.subSequence(start, start + lengthOfSubString);
            listOfSubStrings.add(subString.toString());
            start += lengthOfSubString;
        }

        for (String subString: listOfSubStrings) {
            StringBuilder subStringWithoutDuplicates = new StringBuilder();
            for (char i : subString.toCharArray()){
                if (subStringWithoutDuplicates.indexOf(String.valueOf(i)) == -1){
                    subStringWithoutDuplicates.append(i);
                }
            }
            System.out.println(subStringWithoutDuplicates);
        }
    }
}
