package TargetHeartRateCalculator;

import java.util.List;
import java.util.Scanner;

public class HeartRateApp {

    public static void main(String[] args) {
        String firstName;
        String secondName;
        int dayOfMonth;
        String monthOfBirth;
        int yearOfBirth;
        int subjectS_Age;
        int subjectS_MaxHeartRate;
        List<Double> subjectS_TargetHeartRateRange;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter subject's first name: ");
        firstName = input.next();
        System.out.println();

        System.out.print("Enter subject's second name: ");
        secondName = input.next();
        System.out.println();

        System.out.print("Enter subject's day in month of birth: ");
        dayOfMonth = input.nextInt();
        System.out.println();

        System.out.print("Enter subject's month of birth: ");
        monthOfBirth = input.next();
        System.out.println();

        System.out.print("Enter subject's year of birth: ");
        yearOfBirth = input.nextInt();
        System.out.println();

        HeartRate newHeartRate = new HeartRate(firstName, secondName);
        newHeartRate.setDayOfBirth(dayOfMonth);
        newHeartRate.setMonthOfBirth(monthOfBirth);
        newHeartRate.setYearOfBirth(yearOfBirth);
        subjectS_Age = newHeartRate.calculateAge(yearOfBirth);
        subjectS_MaxHeartRate = newHeartRate.calculateMaxHeartRate(subjectS_Age);
        subjectS_TargetHeartRateRange = newHeartRate.calculateTargetHeartRate(subjectS_MaxHeartRate);

        System.out.printf( "%20s%n"," --------- Subject's Information --------- ");
        System.out.printf("%20s%s%n", "Subject's first name: ", newHeartRate.getFirstName());
        System.out.printf("%20s%s%n", "Subject's last name: ", newHeartRate.getLastName());
        System.out.printf("%20s%d%n", "Subject's age: ", subjectS_Age);
        System.out.printf("%20s%d%n", "Subject's maximum heart rate: ", subjectS_MaxHeartRate);
        System.out.printf("%20s%n", "Subject's targetHeartRate: " + subjectS_TargetHeartRateRange);
    }
}
