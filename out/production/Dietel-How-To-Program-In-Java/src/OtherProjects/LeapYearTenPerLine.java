package OtherProjects;

public class LeapYearTenPerLine {

    public static void main(String[] args) {
       int year = 100;
       int endYear = 2100;
       int count = 0;

       while (year <= endYear) {
           year++;
           if (year % 4 != 0) {
               continue;
           }
           count++;
           displayOutput(year + " ");
           if (count % 10 == 0) {
               displayOutput("\n");
           }
       }
    }

    private static void displayOutput(String output) {
        System.out.print(output);
    }
}
