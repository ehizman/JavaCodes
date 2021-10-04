package chapterEight.diaryProject;

import chapterEight.diaryProject.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    @Test
    void test_Can_Create_Entry(){
        Entry entry = new Entry("My Break up Experience", "It was a cold sunny day");
        assertNotNull(entry);
    }

    @Test
    void test_That_Entry_Has_Title(){
        Entry entry = new Entry();
        entry.setEntryTitle("My Break up Experience");
        assertEquals("My Break up Experience", entry.getEntryTitle());
    }

    @Test
    void test_That_Entry_Has_Body(){
        Entry entry = new Entry();
        entry.setEntryBody("It was a cold and rainy night");
        assertEquals("It was a cold and rainy night", entry.getEntryBody());
    }
}