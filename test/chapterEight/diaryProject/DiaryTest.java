package chapterEight.diaryProject;

import chapterEight.diaryProject.Diary;
import chapterEight.diaryProject.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    void test_Creates_Diary(){
        Diary diary = new Diary("My Break up Experience");
        assertNotNull(diary);
    }

    @Test
    void test_Diary_Has_A_List_Of_Entries(){
        Diary diary = new Diary("My Break up Experience");
        diary.addNewEntry("Breaking up with HP", "it was a cold sunny day");
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    void test_Find_Entry_In_Diary(){
        Diary diary = new Diary("My Break up Experience");
        diary.addNewEntry("Breaking up with HP", "it was a cold sunny day");
        Entry entryFound = diary.findEntryByTitle("Breaking up with HP");
        assertEquals("""
                Entry title: Breaking up with HP
                Entry Body: it was a cold sunny day""", entryFound.toString());
    }

    @Test
    void test_Delete_Entry_From_Title() throws NoSuchFieldException {
        Diary diary = new Diary("My Break up Experience");
        diary.addNewEntry("Breaking up with HP", "it was a cold sunny day");
        diary.addNewEntry("Two months with Lizzy", "Lizzy just lasted for two months");
        diary.deleteEntryByTitle("Two months with Lizzy");
        assertEquals(1,diary.getNumberOfEntries());
    }
}
