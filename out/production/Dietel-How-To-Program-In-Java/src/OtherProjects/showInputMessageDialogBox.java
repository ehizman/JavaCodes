package OtherProjects;

import javax.swing.*;

public class showInputMessageDialogBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name: ");
        String message = String.format("Hello, %s!,%nCongratulations on creating your first input dialog in java", name);
        JOptionPane.showMessageDialog(null, message);
    }

}