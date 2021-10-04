package chapterFourteen.regularExpressions;

public class ValidateInput {
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Za-z][a-z]*");
    }

    public static boolean validateLastName(String lastName) {
        return lastName.matches("[A-Za-z]+[-']*[A-Za-z]*");
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[+]234-\\d{3}-\\d{4}-\\d{3}");
    }

    public static boolean validateAddress(String address) {
        return address.matches("\\d\\s[A-Za-z]{2,}\\s[A-Za-z]{2,}\\s[A-Za-z]{2,}\\s[A-Za-z]{2,}");
    }
}
