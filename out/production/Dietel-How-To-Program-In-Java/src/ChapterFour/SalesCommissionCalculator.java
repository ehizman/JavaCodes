package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        int valueOfItem;
        int totalValueOfItems = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the value of item");
            System.out.print("Press -1 to exit: ");
            valueOfItem = scanner.nextInt();
            totalValueOfItems = totalValueOfItems + valueOfItem;
        }while(valueOfItem != -1);

        System.out.printf("The total value of items sold for last week is %d%n", totalValueOfItems);
        System.out.printf("Total Commission: %d", 200 + ((9 * totalValueOfItems)/100));
    }
}
