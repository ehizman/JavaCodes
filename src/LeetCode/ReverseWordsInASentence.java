package LeetCode;

import java.util.Arrays;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        String s = reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }
    public static String reverseWords(String s) {
        String[] splitString = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
       Arrays.stream(splitString).forEach(element -> {
           stringBuilder.append(reverseTokens(element));
           stringBuilder.append(" ");
       });
       return stringBuilder.toString();
    }
    public static String reverseTokens(String s){
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
