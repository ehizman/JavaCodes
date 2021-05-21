package ChapterThreeFiles.TargetHeartRateCalculator;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

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

        System.out.print("Enter subject's date of birth in the format - (dd/MM/yy): ");
        String date = input.next();
        try{
            Date dateOfBirth = new SimpleDateFormat("dd/MM/yy").parse(date);
            newCalendar.setTime(dateOfBirth);
            HeartRate newHeartRate = new HeartRate(firstName, secondName);

//            monthOfBirth = input.nextInt(); Set month of birth and day of birth
//            dayOfMonth = input.nextInt();
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
