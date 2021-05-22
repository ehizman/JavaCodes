package ChapterThreeFiles.DateClass;

import java.util.ArrayList;
import java.util.Calendar;

public class Date {
    private final int minimumValidYear = 1900; //a valid year is between 1900 and the current year

    private int year;
    private int month;
    private int day;
    private final int maximumNumberOfDaysInFebruaryNonLeapYear = 28;
    private final int maximumNumberOfDaysInAFebruaryLeapYear = 29;
    private final int maximumNumberOfDaysInA31DayMonth = 31;
    private final int maximumNumberOFDaysInA30DayMonth = 30;
    private final int maximumNumberOfMonthsInAYear = 12;
    private final Calendar calendar = Calendar.getInstance();
    private final ArrayList<Integer> listOfMonthsWith31Days = new ArrayList<Integer>();
    private final ArrayList<Integer> listOfMonthsWith30Days = new ArrayList<Integer>();


    public Date(int year, String month, int day) {
        Calendar newCalendar = Calendar.getInstance();

        // a list of months with 31 days
        listOfMonthsWith31Days.add(1);//January
        listOfMonthsWith31Days.add(3);//February
        listOfMonthsWith31Days.add(5);//May
        listOfMonthsWith31Days.add(7);//July
        listOfMonthsWith31Days.add(8);//August
        listOfMonthsWith31Days.add(10);//October
        listOfMonthsWith31Days.add(12);//December

        // a list of months with 30 days
        listOfMonthsWith30Days.add(4); //April
        listOfMonthsWith30Days.add(6); //June
        listOfMonthsWith30Days.add(9); //September
        listOfMonthsWith30Days.add(11); //November

        boolean isValidYear = ((year > minimumValidYear) && (year < calendar.get(Calendar.YEAR)));
        if (isValidYear){
            this.year = year;
        }
        else{
            int defaultYearValue = 2000;
            this.year = defaultYearValue;
        }

        int monthNumber = Integer.parseInt(month);
        boolean isValidMonth = (monthNumber > 0) && (monthNumber <= maximumNumberOfMonthsInAYear);
        if(isValidMonth){
            this.month = monthNumber;
        }
        else {
            int defaultMonthValue = 1;
            this.month = defaultMonthValue;
        }

        if (listOfMonthsWith30Days.contains(monthNumber)) {
            boolean isValidDayInA30DayMonth = ((day > 0) && (day <= maximumNumberOFDaysInA30DayMonth));
            if (isValidDayInA30DayMonth) {
                this.day = day;
            }
            else {
                int defaultDayValueInA30DayMonth = 30;
                this.day = defaultDayValueInA30DayMonth;
            }
        }

        if (listOfMonthsWith31Days.contains(monthNumber)){
            boolean isValidDayInA31DayMonth = ((day > 0) && (day <= maximumNumberOfDaysInA31DayMonth));
            if (isValidDayInA31DayMonth){
                this.day = day;
            }
            else{
                int defaultDayValueInA31DayMonth = 31;
                this.day = defaultDayValueInA31DayMonth;
            }
        }

        boolean isLeapYear = this.year % 4 == 0;
        if (isLeapYear){
            boolean isValidDayInFebruaryLeapYear = ((day > 0) && (day <= maximumNumberOfDaysInAFebruaryLeapYear));
            if (isValidDayInFebruaryLeapYear){
                this.day = day;
            }
            else{
                this.day = maximumNumberOfDaysInAFebruaryLeapYear;
            }
        }
        else {
            boolean isAValidDayInAFebruaryNonLeapYear =
                    ((day > 0) && (day < maximumNumberOfDaysInAFebruaryLeapYear));
            if (isAValidDayInAFebruaryNonLeapYear){
                this.day = day;
            }
            else {
                this.day = maximumNumberOfDaysInFebruaryNonLeapYear;
            }
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String displayDate() {
        int year = getYear();
        int month = getMonth();
        int day = getDay();
        return (year +"/"+month+"/"+day);
    }

    public void setYear(int year) {
        boolean isValidYear = ((year > minimumValidYear) && (year < calendar.get(Calendar.YEAR)));
        if (isValidYear){
            this.year = year;
        }
        else{
            //if an invalid year is entered, year is set to year 2000;
            int defaultResetYear = 2000;
            this.year = defaultResetYear;
        }
    }

    public void setMonth(String month) {
        int monthInInteger = Integer.parseInt(month);
        boolean isValidMonth = ((monthInInteger > 0) && (monthInInteger <= maximumNumberOfMonthsInAYear));
        if (isValidMonth){
            this.month = monthInInteger;
        }
        else {
            int defaultMonthValue = 1;
            this.month = defaultMonthValue;
        }
//        setDay(getDay());// in case that the day is entered first then set the day according to the month entered
    }

    public void setDay(int day) {
        if (listOfMonthsWith31Days.contains(month)) {
             boolean isValidDayInA31DayMonth = ((day > 0) && (day <= maximumNumberOfDaysInA31DayMonth));
            if (isValidDayInA31DayMonth) {
                this.day = day;
            }
            else {
                int defaultDayValueInA31DayMonth = 31;
                this.day = defaultDayValueInA31DayMonth;
            }
        }
        if (listOfMonthsWith30Days.contains(month)) {
            boolean isValidDayInA30DayMonth = ((day > 0) && (day <= maximumNumberOFDaysInA30DayMonth));
            if (isValidDayInA30DayMonth) {
                this.day = day;
            }
            else{
                int defaultDayValueInA30DayMonth = 30;
                this.day = defaultDayValueInA30DayMonth;
            }
        }
        boolean isAFebruaryLeapYear = ((this.year % 4 == 0) && (month ==2));
        if (isAFebruaryLeapYear){
            boolean isValidDayInFebruaryLeapYear = ((day > 0) && (day < maximumNumberOfDaysInAFebruaryLeapYear));
            if (isValidDayInFebruaryLeapYear){
                this.day = day;
            }
            else {
                this.day = maximumNumberOfDaysInAFebruaryLeapYear;
            }
        }
        boolean isAFebruaryNonLeapYear = ((this.year % 4 != 0) && (month ==2));
        if (isAFebruaryNonLeapYear)
        {
            boolean isAValidDayInAFebruaryNonLeapYear = ((day > 0) && (day < maximumNumberOfDaysInAFebruaryLeapYear));
            if (isAValidDayInAFebruaryNonLeapYear){
                this.day = day;
            }
            else{
                this.day = maximumNumberOfDaysInFebruaryNonLeapYear;
            }
        }
    }
}

