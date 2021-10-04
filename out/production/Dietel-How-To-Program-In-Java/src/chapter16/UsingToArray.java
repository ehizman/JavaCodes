package chapter16;

import java.util.*;
import java.util.function.IntFunction;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> stringList = new LinkedList<>(Arrays.asList(colors));

        stringList.addLast("brown");
        stringList.add("pink");
        stringList.add(3, "green");
        stringList.addFirst("cyan");

        String[] finalColors = stringList.toArray(new String[0]);
        Arrays.stream(finalColors).forEach(System.out::println);
        System.out.println((colors != finalColors));
        List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list1, new Random(20));
        Collections.shuffle(list2, new Random(20));
        System.out.println(list1);
        System.out.println(list2);
        list1.sort(Collections.reverseOrder());
        System.out.println(list1);
        Collections.shuffle(list1);
    }
}
