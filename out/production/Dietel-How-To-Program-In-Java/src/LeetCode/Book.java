package LeetCode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book{
    private String name;
    private String authorName;
    private LocalDate dateOfPublishing;

    public Book(String name, String authorName, LocalDate dateOfPublishing) {
        this.name = name;
        this.authorName = authorName;
        this.dateOfPublishing = dateOfPublishing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(LocalDate dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' + "\n" +
                ", authorName='" + authorName + '\'' + "\n" +
                ", dateOfPublishing=" + dateOfPublishing + "\n" +
                '}';
    }

    public static void main(String[] args) {
        Book bookOne = new Book("Thoery of Automata", "Ehis Edemakhiota", LocalDate.of(2005, Month.JANUARY, 14));
        Book bookTwo = new Book("Thoery of Finite NonDeterministic Automata", "Eseosa Edemakhiota", LocalDate.of(2005,
                Month.JANUARY, 24));
        Book bookThree = new Book("Thoery of Relationalism", "Nosa Edemakhiota", LocalDate.of(2020,
                Month.DECEMBER, 24));
        List<Book> bookList = new ArrayList<>();
        bookList.add(bookOne);
        bookList.add(bookTwo);
        bookList.add(bookThree);
        System.out.println("before sorting" + bookList);
        bookList.sort(new BookComparator().reversed());
        System.out.println("after sorting" + bookList);

    }
}
