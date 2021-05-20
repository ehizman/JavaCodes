package TargetHeartRateCalculator;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class HeartRateApp {

    public static void main(String[] args) {
        String firstName;
        String secondName;
        int dayOfMonth;
        int monthOfBirth;
        int yearOfBirth;
        int subjectS_Age;
        int subjectS_MaxHeartRate;
        List<Double> subjectS_TargetHeartRateRange;
        Scanner input = new Scanner(System.in);
        Calendar newCalendar = Calendar.getInstance();

        System.out.print("Enter subject's first name: ");
        firstName = input.next();

        System.out.print("Enter subject's last name: ");
        secondName = input.next();

        System.out.print("Enter subject's date of birth(YY//M//DD): ");

        try{
            yearOfBirth = input.nextInt();
            monthOfBirth = input.nextInt();
            dayOfMonth = input.nextInt();
            newCalendar.clear();
            newCalendar.set(yearOfBirth, monthOfBirth, dayOfMonth);
            HeartRate newHeartRate = new HeartRate(firstName, secondName);
            newHeartRate.setYearOfBirth(newCalendar.get(Calendar.YEAR));
            subjectS_Age = newHeartRate.calculateAge();
            subjectS_MaxHeartRate = newHeartRate.calculateMaxHeartRate(subjectS_Age);
            subjectS_TargetHeartRateRange = newHeartRate.calculateTargetHeartRate(subjectS_MaxHeartRate);

            System.out.printf( "%20s%n"," --------- Subject's Information --------- ");
            System.out.printf("%20s%s%n", "Subject's first name: ", newHeartRate.getFirstName());
            System.out.printf("%20s%s%n", "Subject's last name: ", newHeartRate.getLastName());
            System.out.printf("%20s%d%n", "Subject's age: ", subjectS_Age);
            System.out.printf("%20s%d%n", "Subject's maximum heart rate: ", subjectS_MaxHeartRate);
            System.out.printf("%20s%n", "Subject's targetHeartRate: " + subjectS_TargetHeartRateRange);
        }
        catch (Exception e){
            System.out.println("Invalid date entered!");
        }
    }
}
