package bankApplication;

import java.util.Scanner;

public class Util {
    private static final Scanner scanner = new Scanner(System.in);
    static String[] trimInputs(String firstName, String lastName, String userName) {
        String firstNameToLowerCase = firstName.trim().toLowerCase();
        firstName = firstNameToLowerCase.substring(0,1).toUpperCase() + firstNameToLowerCase.substring(1);
        String lastNameToLowerCase = lastName.trim().toLowerCase();
        lastName = lastNameToLowerCase.substring(0,1).toUpperCase() + lastNameToLowerCase.substring(1);
        String userNameToLowerCase = userName.trim().toLowerCase();
        userName = userNameToLowerCase.substring(0,1).toUpperCase() + userNameToLowerCase.substring(1);
        return new String[]{firstName,lastName,userName};
    }

    static  String[] getRegistrationFields(){
        System.out.print("Enter FirstName -> ");
        String firstName = scanner.next();
        System.out.print("Enter LastName -> ");
        String lastName = scanner.next();
        System.out.print("Enter Username -> ");
        String userName = scanner.next();
        return trimInputs(firstName, lastName, userName);
    }
}
