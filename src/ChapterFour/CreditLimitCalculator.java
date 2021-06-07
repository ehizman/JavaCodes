package ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        String message = String.format("""
                    Welcome to credit limit calculator
                    Press 1 to input input customer details
                    Press any key to exit application: %s
                """, " ");
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int accountNumber;
        int startingBalance;
        int totalMonthlyCharge;
        int totalCreditAppliedToCustomerThisMonth;
        int totalCreditAllowed;
        int newBalance = 0;

        while(input == 1){
            System.out.print("Enter account number: ");
            accountNumber = scanner.nextInt();
            System.out.print("Enter balance at the beginning of the month: ");
            startingBalance = scanner.nextInt();
            System.out.print("Enter total monthly charge: ");
            totalMonthlyCharge = scanner.nextInt();
            System.out.print("Enter total credit applied to customer account this month: ");
            totalCreditAppliedToCustomerThisMonth = scanner.nextInt();
            System.out.print("Enter the allowed credit limit for the customer");
            totalCreditAllowed = scanner.nextInt();
            newBalance = startingBalance + totalMonthlyCharge - totalCreditAppliedToCustomerThisMonth;
            System.out.printf("New Balance: %d%n", newBalance);
            if (newBalance > totalCreditAllowed){
                System.out.print("Customer Balance exceeded");
            }

            System.out.println();
            System.out.println(message);
            input = scanner.nextInt();
        }
    }
}
