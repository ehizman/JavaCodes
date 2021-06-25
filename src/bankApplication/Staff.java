package bankApplication;
import java.util.Scanner;

public class Staff {
    private static String userName = "Admin";
    private static String pin = "1234";
    private static final Scanner scanner = new Scanner(System.in);
    public String getUserName() {
        return userName;
    }

    public String getPin() {
        return pin;
    }

    public static void viewDashBoard() {
        String message = """
                
                Press 1 to view all Bank Accounts
                Press 2 to delete an account
                Press 3 to Logout
                """;
        int userInput = 0;
        do {
            displayPrompt(message);
            try{
                userInput = scanner.nextInt();
            }
            catch (NumberFormatException error){
                displayPrompt("Invalid input");
            }
        }while(userInput < 1 || userInput > 4);

        switch (userInput) {
            case 1 -> {
                viewAllAccounts();
            }
            case 2 -> {
                message = "Enter account number to delete";
                displayPrompt(message);
                try {
                    String accountNumberToDelete = scanner.next();
                    Staff.deleteAccount(accountNumberToDelete);
                } catch (NumberFormatException error) {
                    System.out.println("Invalid input");
                }
            }
            case 3 -> {
                BankApplication.main(new String[]{});
            }
        }
    }

    private static void deleteAccount(String accountNumberToDelete) {
        Customer customerTodelete = null;
        for (Customer customer: Bank.getCustomers()) {
            if (customer.getAccount().getAccountNumber().equals(accountNumberToDelete)){
                customerTodelete = customer;
                break;
            }
        }
        if (customerTodelete != null){
            Bank.getCustomers().remove(customerTodelete);
            String message = String.format("%s %s with account number %s has been deleted!",
                    customerTodelete.getFirstName(), customerTodelete.getLastName(),
                    customerTodelete.getAccount().getAccountNumber());
            displayPrompt(message);
        }
        else{
            displayPrompt("user not found!");
        }
    }

    private static void viewAllAccounts() {
        String accountsHeader = String.format("%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s","Firstname","Lastname",
                "username","accountNumber","accountBalance");
        displayPrompt(accountsHeader);
        for (Customer customer: Bank.getCustomers()) {
            System.out.println(customer.toString());
        }
    }

    private static void displayPrompt(String message) {
        System.out.println(message);
    }
}
