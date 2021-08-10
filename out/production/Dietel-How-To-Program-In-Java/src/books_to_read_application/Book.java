package books_to_read_application;

import java.time.LocalDate;

public class Book  implements Comparable<Book> {
    private String author;
    private LocalDate dateOfPublication;
    private String nameOfPublisher;
    private String title;

    public Book(String title, String author, String nameOfPublisher, LocalDate dateOfPublication){
        this.author = author;
        this.title = title;
        this.nameOfPublisher = nameOfPublisher;
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDateOfPublication() {
        return dateOfPublication;
    }

    public String getNameOfPublisher() {
        return nameOfPublisher;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", dateOfPublication=" + dateOfPublication +
                ", nameOfPublisher='" + nameOfPublisher + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book that) {
        return this.title.compareTo(that.title);
    }
}
