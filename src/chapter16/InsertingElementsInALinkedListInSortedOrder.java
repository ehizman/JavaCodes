package chapter16;

import books_to_read_application.Book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertingElementsInALinkedListInSortedOrder {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        random.ints(25, 1, 101)
                .sorted()
                .forEach(list::add);
        double sum = list.stream().reduce(0, Integer::sum);
        double average = sum/ list.size();
        System.out.printf("The sum is %.2f%n", sum);
        System.out.printf("The average is %.2f%n", average);
        System.out.println(list);
    }
}
