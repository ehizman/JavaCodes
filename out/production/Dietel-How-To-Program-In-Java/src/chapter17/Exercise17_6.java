package chapter17;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercise17_6 {
    public static void main(String[] args) {
        System.out.println("Enter a two parameters!");
        Scanner scanner = new Scanner(System.in);
        double firstParameter = scanner.nextDouble();
        double secondParameter = scanner.nextDouble();

        //a
        double [] array = new double[]{firstParameter, secondParameter};
        System.out.printf("The product of %.2f and %.2f is %.2f", firstParameter, secondParameter,
                Arrays.stream(array).reduce(1, (double x, double y) ->{return x * y;}));
        //b
        System.out.printf("The product of %.2f and %.2f is %.2f", firstParameter, secondParameter,
                Arrays.stream(array).reduce(1, (x, y) -> {return x * y;}));
        //c
        System.out.printf("The product of %.2f and %.2f is %.2f", firstParameter, secondParameter,
                Arrays.stream(array).reduce(1, (x, y) -> x * y));
        //d
        //() -> ("Welcome to lambdas");

        //e
        //ArrayList::new;
        //f
        //new Button().addActionListener(event -> JOptionPane.showMessageDialog(new JList<>(), "JButton event
        // handler"));
    }
}
