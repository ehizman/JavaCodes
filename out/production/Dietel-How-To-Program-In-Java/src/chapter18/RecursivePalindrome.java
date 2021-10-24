package chapter18;

public class RecursivePalindrome {
    public static boolean isPalindrome(String string){
       int start = 0;
       int end = string.length()-1;
       return checkPalindrome(string, start, end);
    }
    private static boolean checkPalindrome(String string, int start, int end){
        if (start <= end){
            if(start == end){
                return true;
            }
            if (string.charAt(start) != string.charAt(end)){
                return false;
            }
            return checkPalindrome(string, start+1, end-1);
        }
        return true;
    }
}
