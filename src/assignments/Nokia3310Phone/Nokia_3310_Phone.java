package assignments.Nokia3310Phone;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Nokia_3310_Phone {
    private static MenuOption[] userInput = MenuOption.values();
    private final Scanner input = new Scanner(System.in);

    public int displayMenu(String message) {
        System.out.println(message);
        return 0;
    }

    MenuOption getRequest() {
        int request = 0;
        try{
            do{
                System.out.print("Waiting for input: ");
                request = input.nextInt();
            }while (request < 0 || request > 13);
            if (request == 0){
                System.out.println("Switching off...");
                return userInput[13];
            }
        }
        catch (NoSuchElementException noSuchElementException){
            System.err.println("Invalid Input, Terminating....");
            System.exit(-1);
        }
        catch (NullPointerException nullPointerException){
            System.out.println("No Input entered, Terminating...");
            System.exit(-1);
        }
        return userInput[request - 1];
    }
}

enum MenuOption{
    PHONE_BOOK(1),
    MESSAGES(2),
    CHAT(3),
    CALL_REGISTER(4),
    TONES(5),
    SETTINGS(6),
    CALL_DIVERT(7),
    GAMES(8),
    CALCULATOR(9),
    REMINDERS(10),
    CLOCK(11),
    PROFILES(12),
    SIM_SERVICES(13),
    TURN_OFF(0);

    private final int option;

    private MenuOption(int option){
        this.option = option;
    }
}
