package chapterSeven;

public class TotalSales {
    private static int[][] sales = new int[5][4];
    private static int[] totalSalesPerSalesPerson = new int[4];
    private static int[] totalSalesPerProduct = new int[5];


    public static void addToSalesTable(String salesPersonNumber, String productNumber, String totalDollarValue) {
            int salesPersonIndex = Integer.parseInt(salesPersonNumber) - 1;
            int productIndex = Integer.parseInt(productNumber) - 1;
            int totalDollarValueParsedToInteger = Integer.parseInt(totalDollarValue);
            sales[productIndex][salesPersonIndex] = totalDollarValueParsedToInteger;
    }

    public static boolean checkForExceptions(String salesPersonNumber, String productNumber, String totalDollarValue) {
        try{
            Integer.parseInt(salesPersonNumber);
            Integer.parseInt(productNumber);
            Integer.parseInt(totalDollarValue);
            if(Integer.parseInt(salesPersonNumber) < 1 || Integer.parseInt(salesPersonNumber) > 4|| Integer.parseInt(productNumber) < 1 || Integer.parseInt(productNumber) > 5){
                throw new ArrayIndexOutOfBoundsException();
            }
            return true;
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid  input!");
            return false;
        }
    }

    public static int[][] getTotalSales() {
        return sales;
    }

    public static int[] computeTotalSalesPerSalesPersons() {
        int totalForColumn;

        for (int currentColumn = 0; currentColumn < 4; currentColumn++) {
            totalForColumn = 0;
            for (int[] sale : sales) {
                totalForColumn = totalForColumn + sale[currentColumn];
            }
            totalSalesPerSalesPerson[currentColumn] = totalForColumn;
        }
        return totalSalesPerSalesPerson;
    }

    public static int[] computeTotalSalesPerProduct() {
        int totalForRow;

        for (int row = 0; row < sales.length; row++) {
            totalForRow = 0;
            for (int column = 0; column < sales[row].length; column++) {
                totalForRow = totalForRow + sales[row][column];
            }
            totalSalesPerProduct[row] = totalForRow;
        }
        return totalSalesPerProduct;
    }

    public static void displaySalesTable(int[][] totalSales) {
        System.out.printf("%20s%30s%n"," ","SalesPerson");
        System.out.printf("%20s%10d%10d%10d%10d%10s%20s%n","Products",1,2,3,4," ","Total Per Salesperson");
        for (int row = 0; row < totalSales.length; row++) {
            System.out.printf("%20d",row + 1);
            for (int column: totalSales[row]) {
                System.out.printf("%10d",column);
            }
            System.out.printf("%10s"," ");
            System.out.println(TotalSales.computeTotalSalesPerProduct()[row]);
        }
        System.out.printf("%20s%10d%10d%10d%10d", "Total Per Product",
                TotalSales.computeTotalSalesPerSalesPersons()[0],
                TotalSales.computeTotalSalesPerSalesPersons()[1], TotalSales.computeTotalSalesPerSalesPersons()[2],
                TotalSales.computeTotalSalesPerSalesPersons()[3]);
        int total = 0;
        for (int element: computeTotalSalesPerSalesPersons()) {
            total = total + element;
        }
        System.out.printf("%nTotal Sales-> %10d",total);
    }
}
