package books_to_read_application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfTest {
    private BookShelf shelf;
    private Book effectiveJava;
    private Book codeEffective;
    private Book theMythicalManMonth;

    @BeforeEach
    void init() {
        shelf = new BookShelf();
        effectiveJava = new Book("Effective Java", "James Gosling","O'reilly Books",
                LocalDate.of(2004, Month.JANUARY, 28));
        codeEffective = new Book("Code Effective", "Kent Beck","Packert Publishers",
                LocalDate.of(2002, Month.SEPTEMBER, 12));
        theMythicalManMonth = new Book("The Mythical Man Month", "Martin Fowler","Marven Books",
                LocalDate.of(1995, Month.APRIL, 05));
    }
    @Test
    void emptyBookShelfWhenNoBooksIsAdded(){
        List<Book> books = shelf.getBooks();
        assertTrue(books.isEmpty(), ()-> "Book shelf should be empty");
    }

    @Test
    void bookShelfContainsTwoBooksWhenTwoBooksAreAdded(){
        shelf.add(effectiveJava, codeEffective);
        List<Book> books = shelf.getBooks();
        assertEquals(2, books.size(), ()-> "BookShelf should contain two books");
    }

    @Test
    void bookShelfRemainsEmptyWhenTheAddMethodIsCalledWithoutAnArgument(){
        shelf.add();
        List<Book> books = shelf.getBooks();
        assertTrue(books.isEmpty(), ()-> "Shelf should contain no books");
    }

    @Test
    void booksReturnedFromBookShelfIsImmutableForClient(){
        shelf.add(effectiveJava,codeEffective);
        List<Book> books = shelf.getBooks();
        try{
            books.add(theMythicalManMonth);
            fail(()-> "Should throw an exception of type UnsupportedOperation");
        }
        catch (UnsupportedOperationException error){
            assertTrue(error instanceof UnsupportedOperationException, ()-> "Should throw " +
                    "UnsupportedOperationException");
        }
    }

    @Test
    void bookShelfArrangedByBookTitle(){
        shelf.add(effectiveJava, codeEffective, theMythicalManMonth);
        List<Book> books = shelf.arrange();
        Book[] booksArranged = new Book[]{codeEffective,effectiveJava,theMythicalManMonth};
        assertEquals(Arrays.asList(booksArranged), books,
                ()-> "Should return books in shelf arranged in lexicographical order according to book title");
    }

    @Test
    void booksAreInInsertionOrderAfterCallingArrange(){
        shelf.add(effectiveJava, codeEffective, theMythicalManMonth);
        List<Book> booksOrderedLexicographically = shelf.arrange();
        assertEquals(Arrays.asList(codeEffective, effectiveJava, theMythicalManMonth),
                booksOrderedLexicographically, ()-> "Should return books in shelf arranged in lexicographical order according to book title");
        List<Book> books = shelf.getBooks();
        assertEquals(Arrays.asList(effectiveJava, codeEffective, theMythicalManMonth), books, ()-> "books " +
                "should be arranged according to how they were inserted");
    }

    @Test
    void canArrangeShelfAccordingToUserProvidedCriteria(){
        shelf.add(effectiveJava, codeEffective, theMythicalManMonth);
        List<Book> booksArrangedAccordingToUserProvidedCriteria =
                shelf.arrange(Comparator.<Book>naturalOrder().reversed());
        assertEquals(Arrays.asList(theMythicalManMonth, effectiveJava, codeEffective), booksArrangedAccordingToUserProvidedCriteria);
    }
}