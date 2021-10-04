package ChapterFive;
/*
* the application is built as follows:
*       user can enter a length of months and then view the projected user base number at the end of the time entered
*       user can otherwise enter a projected base number and then get the length number required for the user base to
*       grow to the inputted number given the growth rate*/

import java.util.Scanner;

public class FacebookUserGrowth {
    private final long numberOfUsers = 1_000_000_000;
    private long projectedNumberOfUsers = numberOfUsers;
    private final double growthRate = 1.04;
    private int month;
    private  static FacebookUserGrowth growthCalculatorApp = new FacebookUserGrowth();

    public FacebookUserGrowth(int month) {
        this.month = month;
    }

    public FacebookUserGrowth(long projectedNumberOfUsers) {
        this.projectedNumberOfUsers = projectedNumberOfUsers;
    }

    public FacebookUserGrowth() {

    }

    public long calculateProjectedNumberOfUsers() {
        for (int i = 1; i <= month ; i++) {
            projectedNumberOfUsers = (long)(numberOfUsers * Math.pow(growthRate, month));
        }
        return projectedNumberOfUsers;
    }

    public int calculateGrowthDurationInMonths() {
        month = (int)Math.round(Math.log((double) projectedNumberOfUsers/numberOfUsers) / Math.log(growthRate));
        return month;
    }

    public int getMonth(){
        return month;
    }

    public String display(){
        Scanner scanner = new Scanner(System.in);
        String message = """
                Facebook's user base is currently at 1 Billion users,
                User growth rate is constant at 4% per month,
                This application allows you to either enter a projected user base number and see the needed duration in months for growth,
                or enter a length of time in months and then see the projected user base number after the duration entered
                
                Press 1: To input month and get projected user base number
                Press 2: To input projected user base number and get growth duration
                """;
        System.out.println(message);
        System.out.print("Type input here-> ");
        int input = scanner.nextInt();
        switch (input){
            case 1:  {
                System.out.print("Enter month: ");
                int month = scanner.nextInt();
                final FacebookUserGrowth growthCalculatorApp = new FacebookUserGrowth(month);
                FacebookUserGrowth.growthCalculatorApp = growthCalculatorApp;
                String output = String.format("Projected User base number over %d month(s) is %d", month,
                        growthCalculatorApp.calculateProjectedNumberOfUsers());
                return output;
            }
            case 2: {
                System.out.print("Enter projected user base number: ");
                long projectedUserBaseNumber = scanner.nextLong();
                FacebookUserGrowth growthCalculatorApp = new FacebookUserGrowth(projectedUserBaseNumber);
                FacebookUserGrowth.growthCalculatorApp = growthCalculatorApp;
                String output = String.format("%d month(s) needed for user base to grow to %d",
                        growthCalculatorApp.calculateGrowthDurationInMonths(), projectedUserBaseNumber);
                return output;
            }
            default:{
                return "Invalid Input!";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(growthCalculatorApp.display());
    }
}