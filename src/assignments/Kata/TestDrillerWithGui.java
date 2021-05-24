package assignments.Kata;

import javax.swing.*;

public class TestDrillerWithGui {
    public int calculateTotalPrice(int numberOfCopies) {
        if (numberOfCopies >= 1 && numberOfCopies <= 4){
            int unitPrice = 1500;
            return (unitPrice * numberOfCopies);
        }
        else{
            if (numberOfCopies >= 5 && numberOfCopies <= 9){
                int unitPrice = 1400;
                return (unitPrice * numberOfCopies);
            }
            else{
                if (numberOfCopies >= 10 && numberOfCopies <= 29){
                    int unitPrice = 1200;
                    return (unitPrice * numberOfCopies);
                }
                else{
                    if (numberOfCopies >= 30 && numberOfCopies <= 49){
                        int unitPrice = 1100;
                        return (unitPrice * numberOfCopies);
                    }
                    else{
                        if (numberOfCopies >= 50 && numberOfCopies <= 99){
                            int unitPrice = 1000;
                            return (unitPrice * numberOfCopies);
                        }
                        else{
                            if (numberOfCopies >= 100 && numberOfCopies <= 199){
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
        TestDriller calculateForMerchantKelvinOkoro = new TestDriller();

        numberOfCopies = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of copies: "));
        String message = String.format("Total cost for %d unit(s): %d%n", numberOfCopies,
                calculateForMerchantKelvinOkoro.calculateTotalPrice(numberOfCopies));
        JOptionPane.showMessageDialog(null, message);

        message = String.format("Total profit for %d unit(s): %d%n", numberOfCopies,
                calculateForMerchantKelvinOkoro.calculateProfit(numberOfCopies));
        JOptionPane.showMessageDialog(null, message);

        message = String.format("Thank you%nWe look forward to seeing you again");
        JOptionPane.showMessageDialog(null, message);
    }
}
