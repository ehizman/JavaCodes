package chapterSeven;

import commonOperations.IoOperations;

public class TotalSalesApp {
    public static void main(String[] args) throws NoSuchFieldException {
        String salesPersonNumber;
        String productNumber;
        String totalDollarValue;
        String responseToPrompt;
        do{
            do {
                System.out.print("Enter salesperson number: ");
                salesPersonNumber = IoOperations.collectInput();
                System.out.print("Enter product number: ");
                productNumber = IoOperations.collectInput();
                System.out.print("Enter total dollar value of product: ");
                totalDollarValue = IoOperations.collectInput();
            } while(TotalSales.checkForExceptions(salesPersonNumber, productNumber, totalDollarValue) == false);
            TotalSales.addToSalesTable(salesPersonNumber, productNumber, totalDollarValue);
            System.out.println("Do you want to enter another record?");
            System.out.print("Enter 'Yes' to continue or any other key to abort-> ");
            responseToPrompt = IoOperations.collectInput().toLowerCase();
        } while(responseToPrompt.equals("yes"));


        TotalSales.displaySalesTable(TotalSales.getTotalSales());
    }
}
