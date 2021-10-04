package Classwork.Hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ginortS {
    public static void main(String[] args) {
        String string = "Sorting2134";
        List<Character> listOfUpperCaseLetters = separateUppercaseCharacters(string);
        List<Character> listOfLowerCaseLetters = separateLowercaseCharacters(string);
        List<Character> listOfDigits = separateDigitCharacters(string);
        List<Character> listOfCharacter = appendLists(listOfLowerCaseLetters, listOfUpperCaseLetters, listOfDigits);
        String ginortS_String = turnListIntoString(listOfCharacter);
        System.out.println(ginortS_String);
    }

    private static String turnListIntoString(List<Character> characterList) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (Character character : characterList) {
            newStringBuilder.append(character);
        }
        return newStringBuilder.toString();
    }

    private static List<Character> appendLists(List<Character> listOfLowerCaseLetters, List<Character> listOfUpperCaseLetters, List<Character> listOfDigits) {
        listOfLowerCaseLetters.addAll(listOfUpperCaseLetters);
        listOfLowerCaseLetters.addAll(listOfDigits);
        return listOfLowerCaseLetters;
    }

    private static List<Character> separateDigitCharacters(String string) {
        List<Character> listOfDigits = new ArrayList<>();
        for (Character character : string.toCharArray()) {
            if (Character.isDigit(character)) {
                listOfDigits.add(character);
            }
        }
        List<Character> listOfOddDigits = separateOddDigitsAndSort(listOfDigits);
        List<Character> listOfEvenDigits = separateEvenDigitsAndSort(listOfDigits);
        listOfOddDigits.addAll(listOfEvenDigits);
        listOfDigits = listOfOddDigits;
        return listOfDigits;
    }

    private static List<Character> separateEvenDigitsAndSort(List<Character> listOfDigits) {
        List<Character> listOfEvenDigits = new ArrayList<>();
        for (Character digit : listOfDigits) {
            if (Integer.valueOf(digit) % 2 == 0) {
                listOfEvenDigits.add(digit);
            }
        }
        return listOfEvenDigits.stream().sorted().collect(Collectors.toList());
    }

    private static List<Character> separateOddDigitsAndSort(List<Character> listOfDigits) {
        List<Character> listOfOddDigits = new ArrayList<>();
        for (Character digit : listOfDigits) {
            if (Integer.valueOf(digit) % 2 == 1) {
                listOfOddDigits.add(digit);
            }
        }
        return listOfOddDigits.stream().sorted().collect(Collectors.toList());
    }

    private static List<Character> separateLowercaseCharacters(String string) {
        List<Character> listOfLowerCaseLetters = new ArrayList<>();
        for (Character character : string.toCharArray()) {
            if (Character.isLowerCase(character)) {
                listOfLowerCaseLetters.add(character);
            }
        }
        return listOfLowerCaseLetters.stream().sorted().collect(Collectors.toList());
    }

    private static List<Character> separateUppercaseCharacters(String string) {
        List<Character> listOfUpperCaseLetters = new ArrayList<>();
        for (Character character : string.toCharArray()) {
            if (Character.isUpperCase(character)) {
                listOfUpperCaseLetters.add(character);
            }
        }
        return listOfUpperCaseLetters;
    }
}