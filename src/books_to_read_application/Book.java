package books_to_read_application;

import java.time.LocalDate;

public class Book {
    private String author;
    private int numberOfPages;
    private LocalDate dateOfPublication;
    private String nameOfPublisher;
    private String title;

    public Book(String title, String author, int numberOfPages){
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public Book editBook(){
        this.author = "Nosa Edemakhiota";
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", dateOfPublication=" + dateOfPublication +
                ", nameOfPublisher='" + nameOfPublisher + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
