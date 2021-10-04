package chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CopyingAndReversingLinkedList {
    public static void main(String[] args) {
        Character[] characters = {'a', 'b', 'x', 't', 'e', 'i', 'g', 'h', 'l', 'j'};
        List<Character> characterList = new LinkedList<>(Arrays.asList(characters));
        Collections.reverse(characterList);
        List<Character> copyOfCharacterList = new LinkedList<>(characterList);
        System.out.println(copyOfCharacterList);
    }
}
