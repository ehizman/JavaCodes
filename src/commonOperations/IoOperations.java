package commonOperations;

import java.util.Scanner;

public class IoOperations {
    public static void display(String message){
        System.out.println(message);
    }

    public static String collectInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
