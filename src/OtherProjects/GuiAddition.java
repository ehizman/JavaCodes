package OtherProjects;

import javax.swing.*;

public class GuiAddition {

    public static void main(String[] args) {
        String firstNumber;
        String  secondNumber;

        firstNumber = JOptionPane.showInputDialog("Enter first number");
        secondNumber = JOptionPane.showInputDialog("Enter second number");

        String message = String.format("The sum of %s and %s is %d", firstNumber, secondNumber,
                Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber));
        JOptionPane.showMessageDialog(null, message);
    }
}
