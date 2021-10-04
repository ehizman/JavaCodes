package assignments.FinancialApplication;

public class FinancialApplication {

    public static void main(String[] args) {

        double tuition = 10000;
        double rate = 0.05;
        int numberOfYears = 14;
        double totalTuitionYears = 0;

        for (int i = 1; i <= numberOfYears; i++) {
            tuition = tuition * (1 + rate);

            switch (i){
                case 10: {
                    System.out.printf("The tuition after %d years is: %.2f%n", i, tuition);
                    break;
                }
                case 11:
                case 12:
                case 13:
                case 14: totalTuitionYears += tuition;
                default: break;
            }
        }
        System.out.printf("The tuition for 4 after the tenth year is %.2f", totalTuitionYears);
    }
}
