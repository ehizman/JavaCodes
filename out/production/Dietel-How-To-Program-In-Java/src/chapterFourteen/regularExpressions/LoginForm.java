package chapterFourteen.regularExpressions;

import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Login Form");

        System.out.println("Enter the first name: ");
        String firstName = scanner.next();
        boolean isValidFirstName = ValidateInput.validateFirstName(firstName);
        if (!isValidFirstName){
            System.out.println("First name is invalid!");
        }
        System.out.println("Enter the first name: ");
        String lastName = scanner.next();
        boolean isValidLastName = ValidateInput.validateFirstName(lastName);
        if (!isValidLastName){
            System.out.println("Last name is invalid");
        }
        System.out.println("Enter the phone number: ");
        String phoneNumber = scanner.next();
        boolean isValidPhoneNumber = ValidateInput.validateFirstName(phoneNumber);
        if (!isValidPhoneNumber){
            System.out.println("Phone number is invalid");
        }

        System.out.println("Enter the house address: ");
        String houseAddress = scanner.next();
        boolean isValidHouseAddress = ValidateInput.validateFirstName(houseAddress);
        if (!isValidHouseAddress){
            System.out.println("House Address is invalid");
        }
    }
}
