package chapterFifteen.FileCopier;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Copy {
    //A Java file that copies data from one file to another file

    public static void main(String[] args) {
        System.out.println("Enter the path to the source file: ");
        Scanner scanner = new Scanner(System.in);
        String srcFile = scanner.next();

        System.out.println("Enter the path to the target file: ");
        String targetFile = scanner.next();

        //check if files exist
        if (!Files.exists(Paths.get(srcFile))){
            System.out.println("Source file does not exist");
            System.exit(1);
        }

        if (!Files.exists(Paths.get(targetFile))){
            System.out.println("Target file does not exist");
            System.exit(2);
        }

        //instantiate stream objects
        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(srcFile));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile))){
            int data;
            int numberOfBytesRead = 0;
            while ((data = input.read()) != -1){
                output.write(data);
                numberOfBytesRead++;
            }
            System.out.printf("%d bytes have been read successfully", numberOfBytesRead);
        }
        catch (IOException | SecurityException ex){
            ex.printStackTrace();
        }
        scanner.close();
    }
}
