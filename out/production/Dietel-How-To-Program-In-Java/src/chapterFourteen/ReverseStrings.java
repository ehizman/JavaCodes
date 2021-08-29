package chapterFourteen;
public class ReverseStrings{

    public static String reverseStrings(String string) {
        int LENGTH = string.length();
        int lastPositionOfSpace = 0;
        String reversedString = "";

        for (int i = LENGTH - 1; i >= 0; i--) {
            if (string.charAt(i) == ' '){
                lastPositionOfSpace = i;
            }
            if (i == lastPositionOfSpace - 4){
                System.out.println(lastPositionOfSpace);
                reversedString = reversedString + " ";
                lastPositionOfSpace = i;
            }

            if (i == lastPositionOfSpace - 3 && i < 4){
                System.out.println(lastPositionOfSpace);
                reversedString = reversedString + " ";
                lastPositionOfSpace = i;
            }
            reversedString = reversedString + string.charAt(i);
        }
        System.out.println(reversedString);
        return reversedString;
    } 
}