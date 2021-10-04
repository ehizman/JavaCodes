package chapterFourteen.String;

import java.util.Scanner;

public class IntValuesToCharacters {
    public static void main(String[] args) {
        System.out.println("Enter a an integer code and I will display the corresponding character: ");
        Scanner scanner = new Scanner(System.in);
        int integerCode = scanner.nextInt();
        System.out.println((char)integerCode);

        System.out.println("Integer |    Character value");
        for (int i = 0; i < 256; i++) {
            System.out.printf("%03d     |      %3s%n", i, (char)i);
        }
    }
}
