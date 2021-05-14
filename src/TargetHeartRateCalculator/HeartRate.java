package TargetHeartRateCalculator;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;

    public HeartRate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void updateLastName() {
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
}
