package Classwork;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class store_checkout_application {
    public static void main(String[] args) {
        input();
    }

    private static void generateInvoice(List<String> collectionOfItemsBought, BigDecimal totalCost) {
        System.out.printf("%-4s%-15s%-15s%-10s%-10s%n", "S/N", "Product", "Unit Price", "Quantity", "Total");
        for (String item: collectionOfItemsBought) {
            System.out.println(item);
        }
        System.out.printf("Total cost of items bought: %.2f", totalCost);
    }

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        String stringOfItemsBought;
        List<String> collectionOfItemsBought = new ArrayList<>();
        String userInput = "YES";
        BigDecimal totalCostOfItemsBought = BigDecimal.ZERO;
        int count = 0;
        BigDecimal costOfItem = BigDecimal.ZERO;
        String product = null;
        BigDecimal pricePerUnit = BigDecimal.ZERO;
        int quantity = 0;

        while (userInput.equals("YES")){
           try{
               System.out.print("Enter product: ");
               product = scanner.nextLine();

               System.out.print("Enter price per unit: ");
               pricePerUnit = BigDecimal.valueOf(scanner.nextDouble());

               System.out.print("Enter the quantity of products bought: ");
               quantity = scanner.nextInt();
               costOfItem = pricePerUnit.multiply(BigDecimal.valueOf(quantity));

               totalCostOfItemsBought = totalCostOfItemsBought.add(costOfItem);
               count += 1;

               stringOfItemsBought = String.format("%-4d%-15s%-15.2f%-10d%-10.2f%n", count, product, pricePerUnit,
                       quantity,
                       costOfItem );
               collectionOfItemsBought.add(stringOfItemsBought);
           }
           catch (InputMismatchException inputMismatchException){
               System.out.println("Invalid Input!");
           }

            System.out.println("""
                    
                    Do you want to check out more items?
                    Press <<"yes">> to continue
                    Press <<"no">> to stop and generate receipt
                    """);
            userInput = scanner.next().toUpperCase();
            scanner.nextLine();
        }
        generateInvoice(collectionOfItemsBought, totalCostOfItemsBought);
    }
}
