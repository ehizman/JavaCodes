package chapterFourteen.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) {
        System.out.println("Enter a date in the format: mm/dd/yy");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        dateFormatter(date);
    }

    private static void dateFormatter(String date) {
        String[] dateComponents = date.split("/");
        Map<String, String> months = new HashMap<>();

        months.put("01", "January");
        months.put("02", "February");
        months.put("03", "March");
        months.put("04", "April");
        months.put("05", "May");
        months.put("06", "June");
        months.put("07", "July");
        months.put("08", "August");
        months.put("09", "September");
        months.put("10", "October");
        months.put("11", "November");
        months.put("12", "December");

        System.out.println(months.get(dateComponents[0])+ " " + dateComponents[1] + ", " + dateComponents[2]);
    }
}
