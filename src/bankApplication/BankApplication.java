package bankApplication;

import commonOperations.IoOperations;

import java.security.InvalidParameterException;
import java.util.Scanner;

import static bankApplication.Util.getRegistrationFields;
import static bankApplication.Util.trimInputs;

public class BankApplication {
    private static Customer user;
    private static final Scanner scanner = new Scanner(System.in);
    private static final BankApplication bankApplication = new BankApplication();

    public static void main(String[] args) {
        //display prompt
        String message = """
                    Welcome to Bank PHB
                    Press 1 to login as staff
                    Press 2 to login as customer
                    Press 3 to register
                    Press 4 to exit application
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
                try {
                    System.out.print("Enter username: -> ");
                    String userName = IoOperations.collectInput();
                    System.out.print("Enter pin: -> ");
                    String pin = IoOperations.collectInput();
                    boolean isValidLogin = staffLogin(userName, pin);
                    if (isValidLogin) {
                        displayPrompt("Login successful! ");
                        Staff.viewDashBoard();
                    }
                } catch (InvalidParameterException error) {
                    System.out.println(error.getMessage());
                }
            }
            case 2 ->{
                try {
                    System.out.print("Enter username: -> ");
                    String userName = IoOperations.collectInput();
                    System.out.print("Enter pin: -> ");
                    String pin = IoOperations.collectInput();
                    boolean isValidLogin = customerLogin(userName, pin);
                    if (isValidLogin) {
                        displayPrompt("Login successful! ");
                        user.viewDashBoard();
                    }
                    else{
                        throw new InvalidParameterException("invalid login details");
                    }
                } catch (InvalidParameterException error) {
                    System.out.println(error.getMessage());
                }
            }

            case 3->{
                displayPrompt("Create a new Account");
                try{
                    String[] registrationFields = getRegistrationFields();
                    String firstName = registrationFields[0];
                    String lastName = registrationFields[1];
                    String userName = registrationFields[2];
                    String[] trimmedInputs = trimInputs(firstName, lastName, userName);
                    firstName = trimmedInputs[0];
                    lastName = trimmedInputs[1];
                    userName = trimmedInputs[2];
                    Customer newUser = register(firstName,lastName,userName);
                    displayPrompt("New Account created successfully!\n");
                    newUser.viewDashBoard();
                }catch (NumberFormatException error){
                    System.out.println("Invalid input");
                }
            }
        }

    }

    private static void displayPrompt(String message) {
        System.out.println(message);
    }

    public static boolean customerLogin(String userNameInput, String pin) {
        boolean isValidLoginAttempt = false;
        for(Customer customer  : Bank.getCustomers()){
            if (customer.getUserName().equals(userNameInput)){
                if (customer.getAccountState().equals("ACTIVE")){
                    if (customer.getPin().equals(pin)){
                        isValidLoginAttempt = true;
                    }
                    else{
                        throw new InvalidParameterException("Invalid pin");
                    }
                }
                else{
                    throw  new InvalidParameterException("Account is Inactive");
                }

            }
        }
        return isValidLoginAttempt;
    }

    public static boolean staffLogin(String adminUserName, String pin) {
        boolean isValidLoginAttempt = false;
        if (adminUserName.equals("Admin")){
            if (pin.equals("1234")){
                isValidLoginAttempt = true;
            }
            else{
                throw new InvalidParameterException("Invalid pin");
            }
        }
        return isValidLoginAttempt;
    }

    public Customer getUser() {
        return user;
    }

    public static Customer register(String firstName, String lastName, String userName) {
        user = new Customer(firstName,lastName,userName);
        Bank.addNewCustomer(user);
        user.generateAccountNumber();
        return user;
    }

    public void loadAirtime(int amountToLoad) {
        getUser().getAccount().withdraw(amountToLoad);
    }

    public static void transfer(String beneficiaryAccountNumber, int amountToWithdraw) {
        boolean accountExists = false;
        for (Customer customer: Bank.getCustomers()) {
            if (customer.getAccount().getAccountNumber().equals(beneficiaryAccountNumber)){
                if (!(customer.getAccountState().equals("NOT_ACTIVE"))){
                    user.getAccount().withdraw(amountToWithdraw);
                    customer.getAccount().deposit(amountToWithdraw);
                    accountExists = true;
                }
            }
        }
        if (!accountExists){
            throw new NullPointerException("Invalid beneficiary account");
        }
    }
}
