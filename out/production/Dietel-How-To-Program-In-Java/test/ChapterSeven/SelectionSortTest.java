package ChapterSeven;

import chapterSeven.SelectionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SelectionSortTest {
    @Test
    void selectionSort(){
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {2,9,5,14,8,16,1,45};
        assertArrayEquals(new int []{1,2,5,8,9,14,16,45}, selectionSort.selectionSort(array));
    }
}
