package chapterFourteen;

import java.util.Formatter;

public class CompareTo {

    public static String compare(String firstString, String secondString) {
        Formatter formatter = new Formatter();
        if (firstString.compareTo(secondString) > 0){
            return formatter.format("%s is greater than %s", firstString, secondString).toString();
        }
        else{
            if (firstString.compareTo(secondString) < 0){
                return formatter.format("%s is less than %s", firstString, secondString).toString();
            }
            else{
                return formatter.format("%s is equal to %s", firstString, secondString).toString();
            }
        }
    }
}
