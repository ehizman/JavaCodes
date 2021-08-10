package assignments.Kata;

import javax.swing.*;
import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        String mathEquation;
        Scanner scanner = new Scanner(System.in);

        String message = "Enter a math equation with 2 operands";
        mathEquation = (JOptionPane.showInputDialog(message));
        String [ ] equationAsString;
        if (mathEquation.contains("*")){
            equationAsString = mathEquation.split("[*]");
            removeWhiteSpaces(equationAsString);
            int result = Integer.parseInt(equationAsString[0], 10) * Integer.parseInt(equationAsString[1], 10);
            message = String.format("The result of %s is %d", mathEquation, result);
        }
        else{
            if (mathEquation.contains("+")){
                equationAsString = mathEquation.split("[+]");
                removeWhiteSpaces(equationAsString);
                int result = Integer.parseInt(equationAsString[0], 10) + Integer.parseInt(equationAsString[1], 10);
                message = String.format("The result of %s is %d", mathEquation, result);
            }
            else{
                if (mathEquation.contains("/")){
                    equationAsString = mathEquation.split("[/]");
                  removeWhiteSpaces(equationAsString);
                    int result = Integer.parseInt(equationAsString[0], 10) / Integer.parseInt(equationAsString[1], 10);
                    message = String.format("The result of %s is %d", mathEquation, result);
                }
                else{
                    if (mathEquation.contains("-")){
                        equationAsString = mathEquation.split("[-]");
                        removeWhiteSpaces(equationAsString);
                        int result = Integer.parseInt(equationAsString[0], 10) - Integer.parseInt(equationAsString[1]
                                , 10);
                        message = String.format("The result of %s is %d", mathEquation, result);
                    }
                    else{
                        if (mathEquation.contains("%")){
                            equationAsString = mathEquation.split("[%]");
                            removeWhiteSpaces(equationAsString);
                            int result =
                                    Integer.parseInt(equationAsString[0], 10) % Integer.parseInt(equationAsString[1], 10);
                            message = String.format("The result of %s is %d", mathEquation, result);
                        }
                        else{
                            message =String.format("%s", "Please enter a valid equation");
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    private static void removeWhiteSpaces(String[] equationAsString) {
        for (int i = 0; i<=1; i++){
            equationAsString[i] = equationAsString[i].strip();
        }
    }
}
