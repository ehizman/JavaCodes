package assignments.Nokia3310Phone;
import commonOperations.IoOperations;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CallRegister {
    private static String message;
    private static final Scanner input = new Scanner(System.in);
    private static final CallRegisterOptions[] options = CallRegisterOptions.values();

    public static void displayCallRegisterMenu() {
        message = """
                                -> Press 1 to view MISSED CALLS
                                -> Press 2 to view RECEIVED CALLS
                                -> Press 3 to view DIALLED NUMBERS
                                -> Press 4 to ERASE RECENT CALL LISTS
                                -> Press 5 to SHOW CALL DURATION
                                -> Press 6 to SHOW CALL COSTS
                                -> Press 7 to set CALL COST SETTINGS
                                -> Press 8 for PREPAID CREDIT
                                -> Press 0 to return to PREVIOUS MENU
                            """;
        System.out.print(message);
        CallRegisterOptions userInput = getRequest();

        while(userInput != CallRegisterOptions.RETURN_TO_PREVIOUS_MENU){
            switch (userInput){
                case MISSED_CALLS:{
                    IoOperations.display("Now in view Missed calls");
                    break;
                }
                case RECEIVED_CALLS:{
                    IoOperations.display("Now in Received calls");
                    break;
                }
                case DIALLED_NUMBERS:{
                    IoOperations.display("Now in Dialled Numbers");
                    break;
                }
                case ERASE_RECENT_CALL_LISTS:{
                    IoOperations.display("Now in erase recent call lists");
                    break;
                }
                case SHOW_CALL_DURATION:{
                    IoOperations.display("Now in show call duration");
                    ShowCallDuration.displayCallDurationMenu();
                    break;
                }
                case SHOW_CALL_COSTS:{
                    IoOperations.display("Now in show calls' costs");
                    break;
                }
                case CALL_COST_SETTINGS:{
                    IoOperations.display("Now in call cost settings");
                    break;
                }
                case PREPAID_CREDIT:{
                    IoOperations.display("Now in prepaid credit");
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }

    private static CallRegisterOptions getRequest() {
        int userInput = 0;
        try{
            do {
                IoOperations.display("Waiting for input...");
                userInput = Integer.parseInt(IoOperations.collectInput());
            }while(userInput < 0 || userInput > 8);

            if (userInput == 0){
                return CallRegisterOptions.RETURN_TO_PREVIOUS_MENU;
            }
        } catch (NoSuchElementException | NullPointerException exception){
            System.err.println("Invalid input!");
            Nokia_3310_Phone.displayMainMenu();
        }
        return options[userInput - 1];
    }
}

class ShowCallDuration{
    private static CallDurationMenuOptions[] options = CallDurationMenuOptions.values();

    static void displayCallDurationMenu(){
        String message = """
                    -> Press 1 to show LAST CALL DURATION
                    -> Press 2 to show ALL CALLS' DURATION
                    -> Press 3 to show RECEIVED CALLS' DURATION
                    -> Press 4 to show DIALLED CALLS' DURATION
                    -> Press 5 to CLEAR TIMERS
                    -> Press 0 to RETURN TO PREVIOUS MENU
                """;
        IoOperations.display(message);
        CallDurationMenuOptions userInput = getRequest();
    }

    private static CallDurationMenuOptions getRequest() {
        int userInput = 0;
        try{
            do {
                IoOperations.display("Waiting for input -> ");
                userInput = Integer.parseInt(IoOperations.collectInput());
            } while (userInput < 0 || userInput > 5);

            if (userInput == 0){
                return options[5];
            }

        } catch (NoSuchElementException | NullPointerException exception){
            System.err.println("Invalid input! ");
            CallRegister.displayCallRegisterMenu();
        }
        return options[userInput - 1];
    }
}

enum CallDurationMenuOptions{
    LAST_CALL_DURATION(1),
    ALL_CALLS_DURATION(2),
    RECEIVED_CALLS_DURATION(3),
    DIALLED_CALLS_DURATION(4),
    CLEAR_TIMERS(5),
    RETURN_TO_PREVIOUS_MENU(6);

    CallDurationMenuOptions(int option){
        this.option = option;
    }

    int option;
}

enum CallRegisterOptions {
    MISSED_CALLS(1),
    RECEIVED_CALLS(2),
    DIALLED_NUMBERS(3),
    ERASE_RECENT_CALL_LISTS(4),
    SHOW_CALL_DURATION(5),
    SHOW_CALL_COSTS(6),
    CALL_COST_SETTINGS(7),
    PREPAID_CREDIT(8),
    RETURN_TO_PREVIOUS_MENU(0);

    CallRegisterOptions(int option){
        this.option = option;
    }

    private int option;
}
