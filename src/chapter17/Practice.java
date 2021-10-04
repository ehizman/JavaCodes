package chapter17;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String[] characters = {"h", "e", "l", "l", "o"};
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.stream(characters)
                .forEach(stringBuilder::append);
        System.out.println(stringBuilder);
    }
}
