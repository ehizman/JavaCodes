package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cryptographic {
    @Test
    void testThatEncryptFunctionWorks(){

        int[] numberArray = CryptographyApp.encrypt(1234);
        int[] testArray = {0,1,8,9};
        assertAll(
                () -> assertEquals(testArray[0] , numberArray[0]),
                () ->  assertEquals(testArray[1] , numberArray[1]),
                () ->  assertEquals(testArray[2] , numberArray[2]),
                () ->  assertEquals(testArray[3] , numberArray[3])
        );
    }

    @Test
    void testThatDecryptFunctionWorks(){
        int[] numberArray = DecryptionApp.decrypt(CryptographyApp.encrypt(1234));
        int[] testArray = {1, 2, 3, 4};
        assertAll(
                () ->  assertEquals(testArray[0] , numberArray[0]),
                () ->  assertEquals(testArray[1] , numberArray[1]),
                () ->  assertEquals(testArray[2] , numberArray[2]),
                () ->  assertEquals(testArray[3] , numberArray[3])
        );
    }
}
