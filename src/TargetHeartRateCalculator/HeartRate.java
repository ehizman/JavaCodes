package TargetHeartRateCalculator;


import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    Calendar currentDate = Calendar.getInstance();
    int currentYear = currentDate.get(Calendar.YEAR);

    public HeartRate(String firstName, String lastName) {
        if ((firstName == null) && (lastName == null)){
            System.out.println("Invalid inputs");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateFirstName(String firstName) {
        if ((firstName == null)){
            System.out.println("Invalid input");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void updateLastName(String lastName) {
        if ((this.lastName == null)){
            System.out.println("Invalid input");
        }
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDayOfBirth(int dayInMonth) {
            this.dayOfBirth = dayInMonth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(String monthInString) {
            this.monthOfBirth = monthInString;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int calculateAge() {
        return (currentYear - getYearOfBirth());
    }

    public int calculateMaxHeartRate(int age) {
        return (220 - age);
    }


    public List<Double> calculateTargetHeartRate(int maxHeartRate) {
        double lowerBound = (0.5 * maxHeartRate);
        double upperBound = (0.85 * maxHeartRate);
        return Arrays.asList(lowerBound, upperBound);
    }

}