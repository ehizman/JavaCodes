package OtherProjects;

import javax.swing.*;

public class GuiAddition {

    public static void main(String[] args) {
        String firstNumber;
        String  secondNumber;

        firstNumber = JOptionPane.showInputDialog("Enter first number");
        secondNumber = JOptionPane.showInputDialog("Enter second number");

        String message = String.format("The sum of %s and %s is %d", firstNumber, secondNumber,
                Integer.parseInt(firstNumber, 10) + Integer.parseInt(secondNumber, 10));
        JOptionPane.showMessageDialog(null, message);
    }
}
