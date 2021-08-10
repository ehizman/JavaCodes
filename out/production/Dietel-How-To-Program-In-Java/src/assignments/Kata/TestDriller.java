package assignments.Kata;

import java.util.Scanner;

public class TestDriller {

    public int calculateTotalPrice(int numberOfCopies) {
        if ((numberOfCopies >= 1) && (numberOfCopies <= 4)){
            int unitPrice = 1500;
            return (unitPrice * numberOfCopies);
        }
        else{
            if ((numberOfCopies >= 5) && (numberOfCopies <= 9)){
                int unitPrice = 1400;
                return (unitPrice * numberOfCopies);
            }
            else{
                if ((numberOfCopies >= 10) && (numberOfCopies <= 29)){
                    int unitPrice = 1200;
                    return (unitPrice * numberOfCopies);
                }
                else{
                    if ((numberOfCopies >= 30) && (numberOfCopies <= 49)){
                        int unitPrice = 1100;
                        return (unitPrice * numberOfCopies);
                    }
                    else{
                        if ((numberOfCopies >= 50) && (numberOfCopies <= 99)){
                            int unitPrice = 1000;
                            return (unitPrice * numberOfCopies);
                        }
                        else{
                            if ((numberOfCopies >= 100) && (numberOfCopies <= 199)){
                                int unitPrice = 900;
                                return (unitPrice * numberOfCopies);
                            }
                            else{
                                if (numberOfCopies > 200) {
                                    int unitPrice = 800;
                                    return (unitPrice * numberOfCopies);
                                }
                            }
                        }
                    }
                }
            }
            return 0;
        }
    }

    public int calculateProfit(int numberOfCopiesBought) {
        int totalCost = calculateTotalPrice(numberOfCopiesBought);
        int sellingPrice = 2000;
        int totalRevenue = sellingPrice * numberOfCopiesBought;
        return (totalRevenue - totalCost);
    }

    public static void main(String[] args) {
        int numberOfCopies;
        Scanner scannerScanner = new Scanner(System.in);
        TestDriller calculateForMerchantKelvinOkoro = new TestDriller();

        System.out.print("Enter number of copies: ");
        numberOfCopies = scannerScanner.nextInt();

        System.out.printf("Total cost for %d unit(s): %d%n", numberOfCopies,
                calculateForMerchantKelvinOkoro.calculateTotalPrice(numberOfCopies));

        System.out.printf("Total profit for %d unit(s): %d%n", numberOfCopies,
                calculateForMerchantKelvinOkoro.calculateProfit(numberOfCopies));

        System.out.println("Thank you\nWe look forward to seeing you again");
    }
}
