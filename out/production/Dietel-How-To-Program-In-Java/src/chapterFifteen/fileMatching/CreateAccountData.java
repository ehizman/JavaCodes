package chapterFifteen.fileMatching;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateAccountData {
    public static void main(String[] args) throws FileNotFoundException {
        Formatter formatter = new Formatter("/home/ehizman/IdeaProjects/Dietel-How-To-Program-In-Java/src/chapterFifteen/fileMatching/oldmast.txt");
        System.out.println("Reading data for Master file");
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter account number");
            int accountNumber = input.nextInt();
            System.out.println("Enter first name");
            String firstName = input.next();
            System.out.println("Enter last name");
            String lastName = input.next();
            System.out.println("Enter account balance");
            double accountBalance = input.nextDouble();
            try{
                Account record = new Account(accountNumber, firstName, lastName, accountBalance);
                formatter.format("%d %s %.2f%n", record.getAccount(),
                        record.getFirstName() + " " +record.getLastName(),
                        record.getBalance());
            }
            catch (NoSuchElementException e){
                System.err.println("Invalid input. Please try again");
                input.nextLine();
            }
            System.out.println("Do you want to enter another record?");
            String response = input.next();
            if (response.equalsIgnoreCase("no")){
                break;
            }
        }
        formatter.close();
    }
}
