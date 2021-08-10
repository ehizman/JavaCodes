package chapterFourteen.String;

import java.util.Scanner;

public class TokenizingPhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a telephone number in the form (xxx) xxx-xxxx");
        String telephoneNumberWithAreaCode = scanner.nextLine();
        String[] tokens = telephoneNumberWithAreaCode.split(" ");
        String areaCode = tokens[0].substring(1, tokens[0].length()-1);
        String telePhoneNumberWithOutAreaCode = tokens[1].replace("-","");
        System.out.printf("The area code is: %s%n", areaCode);
        System.out.printf("The telephone number without area-code is: %s", telePhoneNumberWithOutAreaCode);

    }
}
