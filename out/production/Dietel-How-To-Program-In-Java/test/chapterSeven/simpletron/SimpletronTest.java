package chapterSeven.simpletron;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpletronTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSimpletronHasAccumulator(){
        Simpletron simpletron = new Simpletron();
        Byte accumulator = simpletron.getAccumulator();
        assertNotNull(accumulator);
    }
    @Test
    void testReadInput() throws Word.InvalidWordFormatException {
        Simpletron simpletron = new Simpletron();
        Word word = new Word("1007");
        String input = "2";
        try{
            simpletron.readStatement(word);
            assertEquals(Byte.valueOf(input), simpletron.getMemory()[7]);
        }
        catch (Simpletron.InvalidStatementException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void testCanWriteOutputToConsole(){
        Simpletron simpletron = new Simpletron();
        try{
            simpletron.readStatement(new Word("1007"));
            simpletron.readInput("2", "07");
            assertEquals(Byte.valueOf("2"), simpletron.getMemory()[7]);
            simpletron.readStatement(new Word("1107"));
        }
        catch (Simpletron.InvalidStatementException | Word.InvalidWordFormatException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void testCanLoadAccumulator(){
        Simpletron simpletron = new Simpletron();
        try{
            simpletron.readInput("2", "07");
            simpletron.readStatement(new Word("2007"));
            assertEquals(Byte.valueOf("2"), simpletron.getAccumulator());
        }
        catch (Simpletron.InvalidStatementException | Word.InvalidWordFormatException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void testCanAddToAccumulator(){
        Simpletron simpletron = new Simpletron();
        try{
            simpletron.readInput("2", "07");
            simpletron.readStatement(new Word("2007"));
            assertEquals(Byte.valueOf("2"), simpletron.getAccumulator());
        }
        catch (Simpletron.InvalidStatementException | Word.InvalidWordFormatException ex){
            ex.printStackTrace();
        }
    }
}