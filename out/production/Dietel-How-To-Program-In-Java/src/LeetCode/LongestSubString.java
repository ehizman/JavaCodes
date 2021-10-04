package LeetCode;

import java.util.*;

public class LongestSubString {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("ckilbkd");
        System.out.println(length);
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        List<Character> characterList = new ArrayList<>();
        int maximumLength = 0;
        for (int i = 0; i < s.length(); i++){
            if (characterList.contains(s.charAt(i))) {
                if (s.charAt(i) == characterList.get(characterList.size() - 1)) {
                    characterList.clear();
                } else {
                    characterList.subList(0, characterList.indexOf(s.charAt(i)) + 1).clear();
                }
            }
            characterList.add(s.charAt(i));
            if (characterList.size() > maximumLength){
                maximumLength = characterList.size();
            }
        }
        return maximumLength;
    }
}
