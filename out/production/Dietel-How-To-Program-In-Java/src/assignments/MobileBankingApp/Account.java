package assignments.MobileBankingApp;

import java.util.Scanner;

public class Account {

    private int accountBalance;
    private String accountName;
    private short accountPin;
    private static Scanner scanner = new Scanner(System.in);

    public void deposit(int depositAmount) {
        if (depositAmount < 0.0){
            System.out.println("Sorry, cannot deposit negative values");
        }
        else{
            accountBalance = depositAmount + accountBalance;
        }
    }

    public double getAccountBalance() {
        return (double)accountBalance;
    }

    public void withdraw(int amountToWithdraw, short userInput) {
        if (userInput != accountPin){
            System.out.println("Sorry, pin is not valid!!!");
        }
        else{
            if (amountToWithdraw < 0) {
                System.out.println("Sorry, system cannot withdraw negative amount");
            }
            if (amountToWithdraw > accountBalance ){
                System.out.println("Sorry, withdrawal amount is more than current balance");
                System.out.println("System cannot proceed with withdrawal, kindly reduce withdrawal amount");
            }
            if ((amountToWithdraw > 0) && (amountToWithdraw <= accountBalance)) {
                accountBalance -= amountToWithdraw;
            }
        }
    }

    public void setName(String name) {
        accountName = name;
    }

    public String getName() {
        return accountName;
    }

    public void setPin(short pin) {
        accountPin = pin;
    }

    public short getPin() {
        return accountPin;
    }

    public static void main(String[] args) {
        String prompt = """
                                WELCOME TO EHIZMAN-Bank
                                -> Enter 1 to CREATE ACCOUNT
                                -> Enter 2 to DEPOSIT
                                -> Enter 3 to WITHDRAW
                                -> Enter 4 to CHECK BALANCE
                                -> Enter 5 to Exit
                """;
        System.out.println(prompt);
        System.out.print("Waiting for input: ");
        int userInput = Integer.parseInt(scanner.next());
        String accountName;
        short pin;
        int amount;
        Account newAccount = new Account();


        while(userInput == 1 || userInput == 2 || userInput ==3 || userInput ==4){

            switch (userInput){
                case 1:{
                    System.out.print("Enter account name: ");
                    accountName = scanner.next();
                    newAccount.setName(accountName);
                    System.out.printf("%nWelcome %s.%nThank you for creating an account with us%n",
                            newAccount.getName());
                    System.out.print("Enter new pin: ");
                    pin = scanner.nextShort();
                    System.out.print("Confirm pin: ");
                    if (scanner.nextShort() == pin) {
                        newAccount.setPin(pin);
                        System.out.println("Account pin has been set successfully");
                    } else {
                        System.out.println("Pin entered does not match");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextInt();
                    newAccount.deposit(amount);
                    System.out.printf("%d has been deposited into your account%nYour new account balance is %.2f%n",
                            amount, newAccount.getAccountBalance());
                    break;
                }
                case 3:{
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextInt();
                    System.out.print("Enter pin: ");
                    pin = scanner.nextShort();
                    newAccount.withdraw(amount, pin);
                    if (newAccount.getPin() == pin){
                        System.out.printf("%d has been withdrawn from your account%nYour new account balance is %.2f%n",
                                amount, newAccount.getAccountBalance());
                    }
                    break;
                }
                case 4: {
                    System.out.printf("Account Balance is: %.2f%n", newAccount.getAccountBalance());
                }
                default:
                    break;
            }
            System.out.println(prompt);
            System.out.print("Waiting for input: ");
            userInput = scanner.nextInt();
        }
    }
}