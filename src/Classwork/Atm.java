package Classwork;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String transactionPrompt = """
                -> Enter 1 for deposit;
                -> Enter 2 for withdraw;
                -> Enter 3 to view All account;
                -> Enter 4 to transfer;
                -> Enter 5 to view your details;
                -> Enter 6 to exit;
                """;
        Scanner scanner = new Scanner(System.in);
        int userInput;

        System.out.println(transactionPrompt);
        System.out.print("Waiting for input: ");
        userInput = scanner.nextInt();
        do {
            switch (userInput) {
                case 1:
                    System.out.println("Deposit");
                    break;
                case 2:
                    System.out.println("Withdraw");
                    break;
                case 3:
                    System.out.println("View All Account");
                    break;
                case 4:
                    System.out.println("Transfer");
                    break;
                case 5:
                    System.out.println("View your details");
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Enter a valid input");
                    break;
            }
            System.out.println(transactionPrompt);
            System.out.print("Waiting for input: ");
            userInput = scanner.nextInt();
        }   while (userInput != 6) ;
    }
}
