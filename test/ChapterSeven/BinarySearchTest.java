package ChapterSeven;

import chapterSeven.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void canFindElement(){
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1,3,5,7,8,9,12,34,105};
        assertEquals(0, binarySearch.binarySearch(array, 8));
    }
    @Test
    void canReturnIndexOfElement(){
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1,3,5,7,8,9,12,34,105};
        assertEquals(1, binarySearch.findIndexOf(array, 3));
    }
}
