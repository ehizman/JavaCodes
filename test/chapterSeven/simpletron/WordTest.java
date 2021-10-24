package chapterSeven.simpletron;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    @Test
    void canCreateInstance() throws Word.InvalidWordFormatException {
        Word word = new Word("0024");
    }
    @Test
    void testGetData() throws Word.InvalidWordFormatException {
        Word word = new Word("0026");
        String instruction = word.getInstruction();
        assertEquals("00", instruction);
    }
    @Test
    void testGetInstruction() throws Word.InvalidWordFormatException {
        Word word = new Word("0026");
        String data = word.getData();
        assertEquals("26", data);
    }
}