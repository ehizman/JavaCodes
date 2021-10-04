package chapterFourteen.String;

import java.util.Scanner;

public class TokenizingAndComparingStringTwo {
    public static void main(String[] args) {
        System.out.println("Enter a sentence and I will output only those that start with 'ED'");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int count = 0;
        for(String word : words){
            if (word.endsWith("ED")){
                System.out.println(word);
                count++;
            }
        }
        if (count == 0){
            System.out.println("No word in the sentence starts with 'ED' ");
        }
    }
}
