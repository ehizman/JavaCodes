package books_to_read_application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfTest {
    private BookShelf shelf;

    @BeforeEach
    void init() {
        shelf = new BookShelf();
    }
    @Test
    void emptyBookShelfWhenNoBooksIsAdded(){
        List<String> books = shelf.getBooks();
        assertTrue(books.isEmpty(), ()-> "Book shelf should be empty");
    }

    @Test
    void bookShelfContainsTwoBooksWhenTwoBooksAreAdded(){
        shelf.add("Effective Java", "Code Complete");
        List<String> books = shelf.getBooks();
        assertEquals(2, books.size(), ()-> "BookShelf should contain two books");
    }

    @Test
    void bookShelfRemainsEmptyWhenTheAddMethodIsCalledWithoutAnArgument(){
        shelf.add();
        List<String> books = shelf.getBooks();
        assertTrue(books.isEmpty(), ()-> "Shelf should contain no books");
    }

    @Test
    void booksReturnedFromBookShelfIsImmutableForClient(){
        shelf.add("Effective Java", "Code Complete");
        List<String> books = shelf.getBooks();
        try{
            books.add("The Mythical Man-Month");
            fail(()-> "Should throw an exception of type UnsupportedOperation");
        }
        catch (UnsupportedOperationException error){
            assertTrue(error instanceof UnsupportedOperationException, ()-> "Should throw " +
                    "UnsupportedOperationException");
        }
    }

    @Test
    void bookShelfArrangedByBookTitle(){
        shelf.add("Effective Java", "Code Complete", "The Mythical Man- Month");
        List<String> books = shelf.arrange();
        assertEquals(Arrays.asList("Code Complete", "Effective Java", "The Mythical Man- Month"), books,
                ()-> "Should return books in shelf arranged in lexicographical order according to book title");
    }

    @Test
    void booksAreInInsertionOrderAfterCallingArrange(){
        shelf.add("Effective Java", "Code Complete", "The Mythical Man- Month");
        List<String> booksOrderedLexicographically = shelf.arrange();
        assertEquals(Arrays.asList("Code Complete", "Effective Java", "The Mythical Man- Month"),
                booksOrderedLexicographically, ()-> "Should return books in shelf arranged in lexicographical order according to book title");
        List<String> books = shelf.getBooks();
        assertEquals(Arrays.asList("Effective Java", "Code Complete", "The Mythical Man- Month"), books, ()-> "books " +
                "should be arranged according to how they were inserted");


    }
}