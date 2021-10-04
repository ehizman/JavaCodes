package assignments.CelsiusToFarenheitConverter;

import java.util.Scanner;

public class CelsiusToFarenheitConverterApp {

    public static void main (String ... args) {
        
        double userInputInCelsius;
        double farenheitTemperature;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        userInputInCelsius = input.nextDouble();
        System.out.println();

        farenheitTemperature = (9.0/5) * userInputInCelsius + 32;

        System.out.printf("%.1f Celsius is %.1f Farenheit%n", userInputInCelsius, farenheitTemperature);
    }
}
