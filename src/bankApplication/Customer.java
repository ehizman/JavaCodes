package bankApplication;
import java.security.InvalidParameterException;
import java.util.Scanner;
import static bankApplication.BankApplication.register;
import static bankApplication.Util.getRegistrationFields;
import static bankApplication.Util.trimInputs;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private Account account;
    private String userName;
    private AccountState accountState;
    private static final Scanner scanner = new Scanner(System.in);

    public void viewDashBoard() {
        displayPrompt(String.format("Welcome %s %s",getFirstName(),getLastName() ));
        String message = """
                Press 1 to create new account
                Press 2 to deposit
                Press 3 to withdraw
                Press 4 to view balance
                Press 5 to transfer
                Press 6 to load airtime
                Press 7 to logout
                Press 8 to close Account
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
        }while(userInput < 1 || userInput > 7);

        switch (userInput){
            case 1 -> {
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
                    displayPrompt("New Account created successfully!");
                    message = """
                            Press 1 to login to new Account
                            Press 2 to dismiss prompt
                            """;
                    displayPrompt(message);
                    userInput = scanner.nextInt();
                    if (userInput == 1){
                        newUser.viewDashBoard();
                    }
                    else{
                        if (userInput == 2){
                            viewDashBoard();
                        }
                        else{
                            throw new InvalidParameterException();
                        }
                    }
                }catch (NumberFormatException error){
                    System.out.println("Invalid input");
                    viewDashBoard();
                }
            }

            case 2 ->{
                try{
                    displayPrompt("Enter amount to deposit");
                    int amountToDeposit = scanner.nextInt();
                    this.account.deposit(amountToDeposit);
                    displayPrompt(String.format("%d deposited into account successfully!\n", amountToDeposit));
                    displayPrompt(String.format("New account Balance %.2f",account.getAccountBalance()));
                    viewDashBoard();
                }catch(NullPointerException | InvalidParameterException error){
                    displayPrompt(error.getMessage());
                    viewDashBoard();
                }
            }

            case 3 ->{
                try{
                    displayPrompt("Enter amount to withdraw");
                    int amountToWithdraw = scanner.nextInt();
                    this.account.withdraw(amountToWithdraw);
                    displayPrompt(String.format("%d withdrawn from account successfully!\n", amountToWithdraw));
                    displayPrompt(String.format("New account Balance %.2f",account.getAccountBalance()));
                    viewDashBoard();
                }catch (NullPointerException | InvalidParameterException error){
                    displayPrompt(error.getMessage());
                    viewDashBoard();
                }
            }

            case 4 ->{
                displayPrompt(String.format("Your account balance is %.2f",
                    this.getAccount().getAccountBalance()));
                viewDashBoard();
            }

            case 5 ->{
                try{
                    displayPrompt("Enter amount to transfer");
                    int amountToWithdraw = scanner.nextInt();
                    displayPrompt("Enter valid beneficiary account number");
                    String beneficiaryAccountNumber = scanner.next();
                    this.account.transfer(beneficiaryAccountNumber,amountToWithdraw);
                    displayPrompt(String.format("%d withdrawn from account successfully!\n", amountToWithdraw));
                    displayPrompt(String.format("New account Balance %.2f",account.getAccountBalance()));
                    viewDashBoard();
                }catch (NullPointerException | InvalidParameterException error){
                    displayPrompt(error.getMessage());
                    viewDashBoard();
                }
            }
            case 6 ->{
                try{
                    displayPrompt("Enter phone number to recharge");
                    String phoneNumber = scanner.next();
                    displayPrompt("Enter amount to recharge");
                    int amountToRecharge = scanner.nextInt();
                    if (phoneNumber.length() != 11){
                        throw new NullPointerException("Invalid phone number!");
                    }
                    this.account.loadAirtime(amountToRecharge);
                    displayPrompt(String.format("%d withdrawn from account successfully!\n", amountToRecharge));
                    displayPrompt(String.format("New account Balance %.2f",account.getAccountBalance()));
                    viewDashBoard();
                }catch (NullPointerException | InvalidParameterException error){
                    displayPrompt(error.getMessage());
                    viewDashBoard();
                }
            }
            case 7 ->{
                this.logout();
                BankApplication.run();
            }
            case 8 ->{
                this.closeAccount();
                displayPrompt("Account deactivated successfully!");
                BankApplication.run();
            }
            default -> BankApplication.run();
        }
    }

    public void logout() {
        displayPrompt(String.format("GoodBye %s!",this.getFirstName()));
        BankApplication.run();
    }

    private static void displayPrompt(String message) {
        System.out.println(message);
    }

    private enum AccountState {NOT_ACTIVE, ACTIVE }

    @Override
    public String toString() {
        return String.format("%20s%20s%20s%20s%20.2f", getFirstName(), getLastName(), getUserName(),
                account.getAccountNumber(), account.getAccountBalance());
    }

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = "1234";
        this.userName = userName;
        this.accountState = AccountState.ACTIVE;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
            if(pin == null){
                throw new NullPointerException("Invalid pin!");
            }
            if(pin.length() != 4){
                throw new InvalidParameterException("Pin too short!");
            }
            if(Integer.parseInt(pin) < 0|| Integer.parseInt(pin) > 9999){
                throw new NumberFormatException("Pin is not numeric!");
            }
            this.pin = pin;
    }
    public void generateAccountNumber(){
        this.account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    public void closeAccount() {
        this.accountState = AccountState.NOT_ACTIVE;
    }

    public String getAccountState() {
        return accountState.toString();
    }
}
