package chapterFourteen.String;

import java.nio.charset.StandardCharsets;

public class DefiningStringMethods {

    public int indexOf(String searchStr, String targetStr, int fromIndex){
        final int MAX = searchStr.length();
        byte[] srcStrArray = searchStr.getBytes(StandardCharsets.UTF_8);
        byte[] targetStrArray = targetStr.getBytes(StandardCharsets.UTF_8);
        int startingIndex = 0;
        if (fromIndex < 0 || fromIndex >= MAX){
            return -1;
        }
        for (int i = fromIndex; i < MAX; i++) {
            if (srcStrArray[i] == targetStrArray[0]) {
                startingIndex = i;
                int k = 1;
                for (int j = i + 1; j < i + targetStr.length(); j++) {
                    if (srcStrArray[j] != targetStrArray[k]) {
                        return -1;
                    }
                    k++;
                }
            }
        }
        return startingIndex;
    }

    public int indexOf(String searchStr, String targetStr){
        int fromIndex = 0;
        final int MAX = searchStr.length();
        byte[] srcStrArray = searchStr.getBytes(StandardCharsets.UTF_8);
        byte[] targetStrArray = targetStr.getBytes(StandardCharsets.UTF_8);
        int startingIndex = 0;

        for (int i = fromIndex; i < MAX; i++) {
            if (srcStrArray[i] == targetStrArray[0]) {
                startingIndex = i;
                int k = 1;
                for (int j = i + 1; j < i + targetStr.length(); j++) {
                    if (srcStrArray[j] != targetStrArray[k]) {
                        return -1;
                    }
                    k++;
                }
            }
        }
        return startingIndex;
    }

    public int indexOf(String searchStr ,char trgStr, int fromIndex){

        final int MAX_INDEX = searchStr.length();
        if (fromIndex < 0 || fromIndex >= MAX_INDEX){
            return -1;
        }
        byte trgStrAsByte = (byte) trgStr;
        byte[] searchStrByteArray = searchStr.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < MAX_INDEX; i++) {
          if (searchStrByteArray[i] == trgStrAsByte){
              return i;
          }
        }
        return -1;
    }

    public int lastIndexOf(String searchStr, String targetStr, int fromIndex) {
        final int MAX = searchStr.length();
        byte[] srcStrArray = searchStr.getBytes(StandardCharsets.UTF_8);
        byte[] targetStrArray = targetStr.getBytes(StandardCharsets.UTF_8);
        if (fromIndex < 0 || fromIndex >= MAX) {
            return -1;
        }
        for (int i = MAX - 1; i >= fromIndex; i--) {
            if (srcStrArray[i] == targetStrArray[0]) {
                int result = indexOf(searchStr, targetStr, i);
                if (result != -1){
                    return i;
                }
                else {
                    return -1;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(String searchStr, String targetStr) {
        int fromIndex = 0;

        final int MAX = searchStr.length();
        byte[] srcStrArray = searchStr.getBytes(StandardCharsets.UTF_8);
        byte[] targetStrArray = targetStr.getBytes(StandardCharsets.UTF_8);
        if (fromIndex >= MAX) {
            return -1;
        }
        for (int i = MAX - 1; i >= 0; i--) {
            if (srcStrArray[i] == targetStrArray[0]) {
                int result = indexOf(searchStr, targetStr, i);
                if (result != -1){
                    return i;
                }
                else {
                    return -1;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(String searchStr, char input){
        int fromIndex = 0;
        final int MAX_INDEX = searchStr.length();

        byte trgCharAsByte = (byte) input;
        byte[] searchStrByteArray = searchStr.getBytes(StandardCharsets.UTF_8);
        for (int i = MAX_INDEX - 1; i >= fromIndex; i--) {
            if (searchStrByteArray[i] == trgCharAsByte){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String searchStr, char input, int fromIndex){
        final int MAX_INDEX = searchStr.length();

        byte trgCharAsByte = (byte) input;
        byte[] searchStrByteArray = searchStr.getBytes(StandardCharsets.UTF_8);
        for (int i = MAX_INDEX - 1; i >= fromIndex; i--) {
            if (searchStrByteArray[i] == trgCharAsByte){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        DefiningStringMethods object = new DefiningStringMethods();
        int returnValue = object.indexOf("there Hello", "Heylo", 0);
        System.out.println("indexOf->" + returnValue);

        int returnValue2 = object.lastIndexOf("potatopopopopo", "p", 8);
        System.out.println(returnValue2);
    }
}
