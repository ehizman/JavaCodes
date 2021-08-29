package chapterFourteen;
public class ReverseStrings{

    public static String reverseStrings(String string) {
        int LENGTH = string.length();
        int lastPositionOfSpace = 0;
        StringBuilder reversedString = new StringBuilder();

        for (int i = LENGTH - 1; i >= 0; i--) {
            if (string.charAt(i) == ' '){
                lastPositionOfSpace = i;
            }
            if (i == lastPositionOfSpace - 4){
                System.out.println(lastPositionOfSpace);
                reversedString.append(" ");
                lastPositionOfSpace = i;
            }

            if (i == lastPositionOfSpace - 3 && i < 4){
                System.out.println(lastPositionOfSpace);
                reversedString.append(" ");
                lastPositionOfSpace = i;
            }
            reversedString.append(string.charAt(i));
        }
        System.out.println(reversedString);
        return reversedString.toString();
    } 
}