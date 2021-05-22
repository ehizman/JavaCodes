package ChapterThreeFiles.TargetHeartRateCalculator;


import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    Calendar currentDate = Calendar.getInstance();
    int currentYear = currentDate.get(Calendar.YEAR);

    public HeartRate(String firstName, String lastName) {
        try {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }
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
        try {
            this.lastName = lastName;
        }
        catch (Exception a){
            System.out.println("Enter a valid name!");
        }

    }

    public String getLastName() {
        return lastName;
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