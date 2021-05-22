package ChapterThreeFiles.HealthProfile;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class HealthProfile {
    String firstName;
    String lastName;
    String gender;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    double height;
    double weight;

    public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth,
                         int yearOfBirth,
                         double height,
                         double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return (this.weight * 703)/ Math.pow(this.height,2);
    }

    public int calculateMaximumHeartRate(int yearOfBirth) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        System.out.println(currentYear);
        int age = currentYear - yearOfBirth;
        return  (220 - age);
    }

    public List<Double> calculateTargetHeartRate(int maxHeartRate) {
        double lowerBound = Math.round((0.5 * maxHeartRate)*100.0)/100.0;
        double upperBound = Math.round((0.85 * maxHeartRate)*100.0)/100.0;
        return Arrays.asList(lowerBound, upperBound);

    }

    public static void main(String[] args) {
        String firstName;
        String lastName;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        String gender;
        double heightInInches;
        double weightInPounds;
        Scanner input = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.print("Enter user first name: ");
        firstName = input.next();
        System.out.print("Enter user last name: ");
        lastName = input.next();
        System.out.print("Enter user gender: ");
        gender = input.next();
        System.out.print("Enter user day of birth: ");
        dayOfBirth = input.nextInt();
        System.out.print("Enter user month of birth: ");
        monthOfBirth = input.nextInt();
        System.out.print("Enter user year of birth: ");
        yearOfBirth = input.nextInt();
        System.out.print("Enter user height in inches: ");
        heightInInches = input.nextDouble();
        System.out.print("Enter weight in pounds: ");
        weightInPounds = input.nextDouble();

        HealthProfile newUser = new HealthProfile(firstName, lastName, gender, dayOfBirth, monthOfBirth, yearOfBirth,
                heightInInches, weightInPounds);
        int userAge = calendar.get(Calendar.YEAR) - newUser.getYearOfBirth();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("User's age: " + userAge);
        System.out.println("User's maximum heart rate: " + newUser.calculateMaximumHeartRate(newUser.getYearOfBirth()));
        double bmi = newUser.calculateBMI();
        System.out.println("User's BMI: " + bmi);
        int maximumHeartRate = newUser.calculateMaximumHeartRate(newUser.getYearOfBirth());
        System.out.println("User's Target Heart Rate: " + newUser.calculateTargetHeartRate(maximumHeartRate));
    }
}
