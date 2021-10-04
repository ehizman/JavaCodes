package bankApplication;
import commonOperations.IoOperations;
import java.security.InvalidParameterException;
import java.util.Scanner;
import static bankApplication.Util.getRegistrationFields;

public class BankApplication {
    private static Customer user;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayPrompt("Initial program setup...");
        register("Ehis","Edemakhiota", "ehizman");
        register("Kelvin","Okoro", "python");
        register("Ifeanyi","Ndubisi", "iyayen");
        run();
    }

    public static void run() {
        String message = """
                    Welcome to Bank PHB
                    Press 1 to login as staff
                    Press 2 to login as customer
                    Press 3 to register
                    Press 4 to exit application
                """;
        displayPrompt(message);
        int userInput = 0;
        do {
            try{
                userInput = scanner.nextInt();
            }
            catch (NumberFormatException error){
                displayPrompt("Invalid input");
            }
        }while(userInput < 1 || userInput > 4);

        switch (userInput) {
            case 1 -> staffLogin();
            case 2 -> customerLogin();
            case 3 -> createNewAccount();
            case 4 -> {
                System.out.println("Exiting application!");
                System.exit(0);
            }
            default -> System.out.println("Invalid input!");
        }
    }

    private static void createNewAccount() {
        displayPrompt("Create a new Account");
        try{
            String[] registrationFields = getRegistrationFields();
            String firstName = registrationFields[0];
            String lastName = registrationFields[1];
            String userName = registrationFields[2];
            Customer newUser = register(firstName,lastName,userName);
            displayPrompt("New Account created successfully!\n");
            newUser.viewDashBoard();
        } catch (NumberFormatException error){
            System.out.println("Invalid input");
        }
    }

    private static void displayPrompt(String message) {
        System.out.println(message);
    }

    public static void customerLogin() {
        try {
            System.out.print("Enter username: -> ");
            String userName = IoOperations.collectInput();
            System.out.print("Enter pin: -> ");
            String pin = IoOperations.collectInput();
            user  = customerValidation(userName, pin);
            if (user != null) {
                displayPrompt("Login successful! ");
                user.viewDashBoard();
            }
            else{
                throw new InvalidParameterException("invalid login details");
            }
        } catch (InvalidParameterException error) {
            System.out.println(error.getMessage());
            run();
        }
    }

    private static Customer customerValidation(String userNameInput, String pin) {
        for(Customer customer  : Bank.getCustomers()){
            if (customer.getUserName().equals(userNameInput)){
                if (customer.getAccountState().equals("ACTIVE")){
                    if (customer.getPin().equals(pin)){
                        return customer;
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
        return null;
    }

    public static void staffLogin() {
        Staff staff = new Staff();
        try {
            System.out.print("Enter username: -> ");
            String userName = IoOperations.collectInput();
            System.out.print("Enter pin: -> ");
            String pin = IoOperations.collectInput();
            boolean isValidLogin = BankApplication.staffValidation(userName, pin);
            if (isValidLogin) {
                displayPrompt("Login successful! ");
                staff.viewDashBoard();
            }
        } catch (InvalidParameterException error) {
            System.out.println(error.getMessage());
            BankApplication.run();
        }
    }

    static boolean staffValidation(String adminUserName, String pin) {
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
        Customer newUser = new Customer(firstName,lastName,userName);
        Bank.addNewCustomer(newUser);
        newUser.generateAccountNumber();
        displayPrompt(String.format("""
                Welcome %s!.
                Please change your default pin
                Pin must be 4 numeric digits!
                """, firstName));
        String pin = scanner.next();
        newUser.setPin(pin);
        return newUser;
    }
}
