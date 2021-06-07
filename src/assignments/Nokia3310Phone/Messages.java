package assignments.Nokia3310Phone;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static assignments.Nokia3310Phone.Nokia_3310_Phone.displayMainMenu;

public class Messages {
    private static  final MessagesMenuOptions[] options = MessagesMenuOptions.values();
    private static  final Scanner input = new Scanner(System.in);

    public static void displayMessagesMenu() {
        String message = """
                                -> Press 1 to WRITE MESSAGES
                                -> Press 2 to view INBOX
                                -> Press 3 to view OUTBOX
                                -> Press 4 to send PICTURES MESSAGES
                                -> Press 5 to view message TEMPLATES
                                -> Press 6 to view SMILEYS
                                -> Press 7 to for MESSAGE SETTINGS
                                -> Press 8 to for INFO SERVICES
                                -> Press 9 to for VOICE MAILBOX NUMBER
                                -> Press 10 to view SERVICE COMMAND EDITOR
                                -> Press 0 to return to PREVIOUS MENU
                            """;
        System.out.print(message);
        MessagesMenuOptions userInput =  getRequest();

        while (userInput != MessagesMenuOptions.RETURN_TO_PREVIOUS_MENU){
            switch (userInput){

                case WRITE_MESSAGES:{
                    System.out.println("Write message");
                    break;
                }

                case INBOX:{
                    System.out.println("View inbox");
                    break;
                }

                case OUTBOX:{
                    System.out.println("Now in outbox");
                    break;
                }

                case PICTURE_MESSAGES:{
                    System.out.println("Now is picture messages");
                    break;
                }

                case TEMPLATES:{
                    System.out.println("Now in templates");
                    break;
                }

                case SMILEYS:{
                    System.out.println("Now in smileys");
                    break;
                }

                case MESSAGE_SETTINGS:{
                    message = """
                                -> Press 1 to SET
                                -> Press 2 for COMMON
                                -> Press o to RETURN TO PREVIOUS MENU
                            """;
                    System.out.println(message);
                    break;
                }

                case INFO_SERVICE: {
                    System.out.println("Now in Info Service");
                    break;
                }

                case VOICE_MAILBOX_NUMBER:{
                    System.out.println("Now in voice mail number");
                    break;
                }
                case SERVICE_COMMAND_EDITOR:{
                    System.out.println("Now in service command editor ");
                    break;
                }
            }
            System.out.println(message);
            userInput = getRequest();
        }
        if (userInput == MessagesMenuOptions.RETURN_TO_PREVIOUS_MENU){
            displayMainMenu();
        }
    }

    private static MessagesMenuOptions getRequest() {
        int request = 0;
        try{
            do{
                System.out.print("Waiting for input: ");
                request = input.nextInt();
            }while (request < 0 || request > 10);
            if (request == 0){
                System.out.println("Returning to previous menu...");
                return options[10];
            }
        }
        catch (NoSuchElementException noSuchElementException){
            System.err.println("Invalid input! Terminating...");
            System.exit(-1);
        }
        catch (NullPointerException nullPointerException){
            System.err.println("No input entered! Terminating...");
            System.exit(-1);
        }
        return options[request - 1];
    }
}

enum MessagesMenuOptions{

    WRITE_MESSAGES(1),
    INBOX(2),
    OUTBOX(3),
    PICTURE_MESSAGES(4),
    TEMPLATES(5),
    SMILEYS(6),
    MESSAGE_SETTINGS(7),
    INFO_SERVICE(8),
    VOICE_MAILBOX_NUMBER(9),
    SERVICE_COMMAND_EDITOR(10),
    RETURN_TO_PREVIOUS_MENU(11);

    private final int option;
    MessagesMenuOptions(int option) {
        this.option = option;
    }
}
