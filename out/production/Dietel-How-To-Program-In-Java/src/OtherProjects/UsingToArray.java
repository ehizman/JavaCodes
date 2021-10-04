package OtherProjects;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = new String[]{"green", "yellow", "red"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        List<String> colorList = Arrays.asList(colors);
//        colorList.add("maroon")
//       the above statement throws an UnsupportedTypeException
        links.add(3, "blue");
        links.add("brown");
        links.addFirst("indigo");
        links.addLast("peach");

        System.out.println(links);
        colors = links.toArray(new String[0]);

        for (String element:colors) {
            System.out.print(element + ", ");
        }
    }
}
