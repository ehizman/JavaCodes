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
    void testReadInstruction(){

        Simpletron simpletron = new Simpletron();
        Word word = new Word("1007");
        String input = "2";
        try{
            simpletron.readStatement(word, input);
            assertEquals(Byte.valueOf(input), simpletron.getMemory()[7]);
        }
        catch (Simpletron.InvalidStatementException ex){
            ex.printStackTrace();
        }

    }
}