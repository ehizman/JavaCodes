package books_to_read_application;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {
    private final List<String> books = new ArrayList<>(0);

    public List<String> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public void add(String... booksToAdd) {
        books.addAll(Arrays.asList(booksToAdd));
    }

    public List<String> arrange() {
        return books.stream().sorted().collect(Collectors.toList());
    }
}
