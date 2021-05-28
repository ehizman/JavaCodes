package ChapterFour;

import java.util.Arrays;

public class DecryptionApp {
    public static int[] decrypt(int[] encryptedNumber) {
        int [] decryptedNumber = new int[4];
        for (int i = 0; i < 4; i++) {
            if (encryptedNumber[i] <= 6) {
                decryptedNumber[i] = encryptedNumber[i] + 3;
            } else {
                decryptedNumber[i] = encryptedNumber[i] - 7;
            }
        }
        int swapCell = decryptedNumber[0];
        decryptedNumber[0] = decryptedNumber[2];
        decryptedNumber[2] = swapCell;
        swapCell = decryptedNumber[1];
        decryptedNumber[1] = decryptedNumber[3];
        decryptedNumber[3] = swapCell;
        return decryptedNumber;
    }
}
