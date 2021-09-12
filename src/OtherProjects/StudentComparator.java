package OtherProjects;

import books_to_read_application.Book;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class StudentComparator {
    static Queue<Double> queue;
    static Set<String> stringSet;

    public static void main(String[] args) {
        queue = new PriorityQueue<>();
        queue.offer(3.6);
        queue.offer(9.05);
        queue.offer(90.56);

        while (!queue.isEmpty()){
            System.out.println("Element -> " + queue.peek());
            queue.poll();
        }
        String[] colors = {"green", "red", "red", "blue","blue", "white", "orange", "maroon", "peach"};
        printNonDuplicates(Arrays.asList(colors));
    }

    private static void printNonDuplicates(Collection<String> colors) {
        stringSet = new HashSet<>(colors);
        List<String> nonDuplicateColors = stringSet.stream()
                .filter(element -> element.endsWith("e"))
                .collect(Collectors.toList());
        System.out.println(nonDuplicateColors);
    }
}
