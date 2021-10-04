package chapterFifteen;

import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileOutputClass {
    private static Formatter output;

    public static void main(String... args) {
        openFile();
        writeToFile();
        closeFile();
    }

    private static void closeFile() {
            if (output != null){
                output.close();
            }
    }

    private static void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s%n%n%s%n",
                """
                        Enter the account number,
                        Enter first name,
                        Enter the last name,
                        Enter balance.""",
                        "Press Ctrl + D to end input");

        while (scanner.hasNext()){
            try{
                output.format("%d %s %s %.2f %n",scanner.nextInt(), scanner.next(), scanner.next(),
                        scanner.nextDouble());
            }catch (FormatterClosedException formatterClosedException){
                System.out.println("Error writing to file. Terminating...");
                break;
            }catch(NoSuchElementException noSuchElementException){
                System.out.println("Invalid Input! Please try again");
                scanner.nextLine();
            }
            System.out.println("?");
        }
    }

    private static void openFile(){
        try {
            output = new Formatter("output.txt");
        }catch (IOException error){
            System.out.println("Write Permission Denied!. Terminating...");
            System.exit(-1);
        }
    }
}
