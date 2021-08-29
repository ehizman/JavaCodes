package chapterFifteen.fileMatching;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTransactionRecordData {
    public static void main(String[] args) throws FileNotFoundException {
        Formatter formatter;
        Scanner input = new Scanner(System.in);
        System.out.println("Reading data for transaction File") ;
        formatter = new Formatter("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src/chapterFifteen" +
                "/fileMatching/trans.txt");

        while(true){
            System.out.println("Enter account number");
            int accountNumber = input.nextInt();

            System.out.println("Enter transaction amount");
            double transactionAmount = input.nextDouble();
            try{
                formatter.format("%s %.2f%n", accountNumber, transactionAmount);
            }
            catch (NoSuchElementException exception){
                System.out.println("Invalid input try again!");
            }
            System.out.println("Do you want to enter another account?");
            String response = input.next();
            if (response.equalsIgnoreCase("no")){
                break;
            }
        }
        formatter.close();

    }
}
