package ChapterThreeFiles.DateClass;

import java.util.ArrayList;
import java.util.Calendar;

public class DateValidator {
    private int year;
    private int month;
    private int day;
    private final ArrayList<Integer> listOfMonthsWith31Days = new ArrayList<Integer>();
    private final ArrayList<Integer> listOfMonthsWith30Days = new ArrayList<Integer>();



    public DateValidator(String day, String month, String year) {

        this.year = Integer.parseInt(year, 10);
        this.month = Integer.parseInt(month, 10);
        this.day = Integer.parseInt(day, 10);
    }

    public int getYear() {
        return year;
    }

    public void setYear() throws Exception {
        int minimumValidYear = 1900;
        Calendar calendar = Calendar.getInstance();
        boolean isNotValidYear = ((year < minimumValidYear) || (year > calendar.get(Calendar.YEAR)));
        if (isNotValidYear) {
            throw new Exception("Invalid year");
        }
    }

    public String getMonth() {
        return ""+month;
    }

    public void setMonth() throws Exception {
        int maximumNumberOfMonthsInAYear = 12;
        boolean isNotValidMonth = (this.month < 0) ||  (month > maximumNumberOfMonthsInAYear);
        if(isNotValidMonth){
            throw new Exception("Invalid month");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay() throws Exception {
        ArrayList<Integer> listOfMonthsWith31Days = new ArrayList<Integer>();
        listOfMonthsWith31Days.add(1);//January
        listOfMonthsWith31Days.add(3);//February
        listOfMonthsWith31Days.add(5);//May
        listOfMonthsWith31Days.add(7);//July
        listOfMonthsWith31Days.add(8);//August
        listOfMonthsWith31Days.add(10);//October
        listOfMonthsWith31Days.add(12);//December
        ArrayList<Integer> listOfMonthsWith30Days = new ArrayList<Integer>();
        listOfMonthsWith30Days.add(4); //April
        listOfMonthsWith30Days.add(6); //June
        listOfMonthsWith30Days.add(9); //September
        listOfMonthsWith30Days.add(11); //November

        if (listOfMonthsWith30Days.contains(month)) {
            int maximumNumberOfDaysInA30DayMonth = 30;
            boolean isNotValidDayInA30DayMonth = ((day < 0) || (day > maximumNumberOfDaysInA30DayMonth));
            if (isNotValidDayInA30DayMonth) {
                throw new Exception("Invalid day");
            }
        }
        else{
            if (listOfMonthsWith31Days.contains(month)) {
                int maximumNumberOfDaysInA31DayMonth = 30;
                boolean isNotValidDayInA31DayMonth = ((day < 0) ||  (day > maximumNumberOfDaysInA31DayMonth));
                if (isNotValidDayInA31DayMonth) {
                    throw new Exception("Invalid day");
                }
            }
            else{
                boolean isLeapYear = this.year % 4 == 0;
                if (isLeapYear){
                    int maximumNumberOfDaysInAFebruaryLeapYear = 29;
                    boolean isNotValidDayInFebruaryLeapYear =
                            ((day < 0) ||  (day > maximumNumberOfDaysInAFebruaryLeapYear));
                    if (isNotValidDayInFebruaryLeapYear){
                        throw new Exception("Invalid day");
                    }
                }
                else {
                    int maximumNumberOfDaysInAFebruaryNonLeapYear = 28;
                    boolean isNotAValidDayInAFebruaryNonLeapYear =
                            ((day < 0) || (day > maximumNumberOfDaysInAFebruaryNonLeapYear));
                    if (isNotAValidDayInAFebruaryNonLeapYear){
                        throw new Exception("Invalid day");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DateValidator dateValidator = new DateValidator("14", "01", "2024");
        try {
            dateValidator.setYear();
        } catch (Exception e) {
            System.out.println("Invalid date entered");
        }
        try{
            dateValidator.setMonth();
        }
        catch (Exception e) {
            System.out.println("Invalid month entered");
        }
        try{
            dateValidator.setDay();
        }
        catch (Exception e) {
            System.out.println("Invalid day entered");
        }
        Date date = new Date(dateValidator.getYear(), dateValidator.getMonth(), dateValidator.getDay());
    }
}

