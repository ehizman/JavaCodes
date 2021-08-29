package chapterFifteen.telephoneNumberGenerator;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneNumberWordGenerator {
    private Map<Character, char[]> keypad;
    public TelephoneNumberWordGenerator(){
        keypad = new HashMap<>();
        keypad.put('2', new char[]{'A', 'B', 'C'});
        keypad.put('3', new char[]{'D', 'E', 'F'});
        keypad.put('4', new char[]{'G', 'H', 'I'});
        keypad.put('5', new char[]{'J', 'K', 'L'});
        keypad.put('6', new char[]{'M', 'N', 'O'});
        keypad.put('7', new char[]{'P', 'R', 'S'});
        keypad.put('8', new char[]{'T', 'U', 'W'});
        keypad.put('9', new char[]{'V', 'X', 'Y'});
    }
    public void generate(String telephoneNumber) {
        try(Formatter formatter = new Formatter("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src" +
                "/chapterFifteen/telephoneNumberGenerator/ValidSevenLetterWords.txt"))
        {
            telephoneNumber = telephoneNumber.replace("-", "");
            char[] lettersMappingForFirstNumber = keypad.get(telephoneNumber.charAt(0));
            char[] lettersMappingForSecondNumber = keypad.get(telephoneNumber.charAt(1));
            char[] lettersMappingForThirdNumber = keypad.get(telephoneNumber.charAt(2));
            char[] lettersMappingForFourthNumber = keypad.get(telephoneNumber.charAt(3));
            char[] lettersMappingForFifthNumber = keypad.get(telephoneNumber.charAt(4));
            char[] lettersMappingForSixthNumber = keypad.get(telephoneNumber.charAt(5));
            char[] lettersMappingForSeventhNumber = keypad.get(telephoneNumber.charAt(6));
            StringBuilder sevenLetterWord = new StringBuilder();
            for (char c1 : lettersMappingForFirstNumber) {
                for (char c2 : lettersMappingForSecondNumber) {
                    for (char c3 : lettersMappingForThirdNumber) {
                        for (char c4 : lettersMappingForFourthNumber) {
                            for (char c5 : lettersMappingForFifthNumber) {
                                for (char c6 : lettersMappingForSixthNumber) {
                                    for (char c7 : lettersMappingForSeventhNumber) {
                                        sevenLetterWord.append(c1).append(c2).append(c3).append(c4).append(c5).append(c6).append(c7).append("\n");
                                        formatter.format(sevenLetterWord.toString());
                                        sevenLetterWord = new StringBuilder();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
