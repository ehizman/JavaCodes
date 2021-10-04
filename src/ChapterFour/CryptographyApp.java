package ChapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class CryptographyApp {
    public static int[] encrypt(int number) {
        int[] numberAsArray = new int[4];
        for (int i = 0; i < 4; i++) {
            int digit = (number % 10) + 7;
            digit = digit % 10;
            number = number / 10;
            numberAsArray[numberAsArray.length - 1 - i] = digit;
        }
        int swapCell = numberAsArray[0];
        numberAsArray[0] = numberAsArray[2];
        numberAsArray[2] = swapCell;
        swapCell = numberAsArray[1];
        numberAsArray[1] = numberAsArray[3];
        numberAsArray[3] = swapCell;
        return numberAsArray;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4 digit integer: ");
        number = scanner.nextInt();

        int[] encryptedNumber = (encrypt(number));
        System.out.println("Encrypted Number: " +Arrays.toString(encryptedNumber));
        System.out.print("Press 'decrypt' to decrypt key: ");
        String userInput = scanner.next();

        if (userInput.equals("decrypt")){
            int[] decryptedNumber = DecryptionApp.decrypt(encryptedNumber);
            System.out.println("Decrypted Number: " + Arrays.toString(decryptedNumber));
        }
        else{
            System.out.println("Thanks");
        }
    }
}

