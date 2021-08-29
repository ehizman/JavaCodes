package chapterFourteen;

import java.util.Locale;
import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Enter a substring or character to search for: ");
        String searchKey = scanner.nextLine();
        int count = getCount(sentence, searchKey);
        System.out.printf("The count of %s in %s is %d", searchKey, sentence, count);
    }

    public static int getCount(String sentence, String searchKey) {
        int index = 0;
        int count = 0;
        while(true){
            index = sentence.toLowerCase().indexOf(searchKey.toLowerCase(), index);
            if (index == -1)
                break;
            else {
                index++;
                count++;
            }
        }
        return count;
    }
}
