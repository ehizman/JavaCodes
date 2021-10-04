package chapterFifteen;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(Paths.get("clients.txt"))){
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First name",
                    "Last name", "Balance");
            while (scanner.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10s%n",scanner.nextInt(), scanner.next(), scanner.next(),
                        scanner.nextDouble());
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}