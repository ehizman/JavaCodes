package ChapterSeven;

import chapterSeven.GradeBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeBookTest {
    @Test
    void constructor(){
        int[]grades = new int[]{18, 20, 58, 68, 90, 67, 78, 69, 45, 32};
        GradeBook gradeBook = new GradeBook(grades, "Chemistry");
        assertEquals("Chemistry",gradeBook.getCourseName());
        assertArrayEquals(grades, gradeBook.displayGrades());
    }

//    @Test
//    void
}
