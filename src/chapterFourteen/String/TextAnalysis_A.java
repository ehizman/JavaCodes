package chapterFourteen.String;

import java.sql.PseudoColumnUsage;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextAnalysis_A {
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Character[][] arrayOfCharAndCount = new Character[][]{
                {'a','0'}, {'b', '0'} , {'c','0'}, {'d','0'},
                {'e','0'}, {'f', '0'} , {'g','0'}, {'h','0'},
                {'i','0'}, {'j', '0'} , {'k','0'}, {'l','0'},
                {'m','0'}, {'n', '0'} , {'o','0'}, {'p','0'},
                {'q','0'}, {'r', '0'} , {'s','0'}, {'t','0'},
                {'u','0'}, {'v', '0'} , {'w','0'}, {'x','0'},
                {'y','0'}, {'z', '0'}
                };
        Map<Character, Integer> mapOfLetters = new HashMap<>();
        for (Character[] charArray: arrayOfCharAndCount) {
            mapOfLetters.put(charArray[0], (int)charArray[1]);
        }
        int LENGTH = sentence.length();
        
        for( int i = 0; i < LENGTH; i++){
            if (sentence.charAt(i) != ' '){
                if (mapOfLetters.containsKey(sentence.charAt(i))){
                    int count = mapOfLetters.get(sentence.charAt(i)) + 1;
                    mapOfLetters.put(sentence.charAt(i), count);
                }
                else{
                    mapOfLetters.put(sentence.charAt(i), 1);
                }
            }
        }

        for (Character key: mapOfLetters.keySet()) {
            System.out.printf("%3s -> %3d%n", key, mapOfLetters.get(key));
        }
    }
}
