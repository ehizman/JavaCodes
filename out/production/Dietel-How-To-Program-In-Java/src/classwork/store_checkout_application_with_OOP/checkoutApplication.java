package classwork.store_checkout_application_with_OOP;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class checkoutApplication {
    public static void main(String[] args) {
        Cart cart = new Cart();
        checkOutCart(cart).displayInvoice();
    }

    private static Invoice checkOutCart(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "YES";
        String product = null;
        BigDecimal pricePerUnit = BigDecimal.ZERO;
        int quantity = 0;

        while (userInput.equals("YES")) {
            try {
                System.out.print("Enter product: ");
                product = scanner.nextLine();

                System.out.print("Enter price per unit: ");
                pricePerUnit = BigDecimal.valueOf(scanner.nextDouble());

                System.out.print("Enter the quantity of products bought: ");
                quantity = scanner.nextInt();

                Item item = new Item(product, pricePerUnit, quantity);
                cart.add(item);
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid Input!");
            }
            System.out.println("""
                    
                    Is cart empty?
                    Press <<"yes">> to continue
                    Press <<"no">> to stop and generate receipt
                    """);
            userInput = scanner.next().toUpperCase();
            scanner.nextLine();
        }
        Invoice receipt = new Invoice(cart);
        return receipt;
    }
}
