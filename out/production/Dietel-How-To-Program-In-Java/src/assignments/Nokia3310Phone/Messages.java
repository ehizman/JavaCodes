package assignments.Nokia3310Phone;

import jdk.swing.interop.SwingInterOpUtils;

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
                    input.nextLine();
                    System.out.println("Message sent!");
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
                    System.out.println("Now in picture messages");
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
                    MessageSettings.displayMessageSettingMenu();
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
        displayMainMenu();
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

class MessageSettings{
    private static final MessageSettingOptions[] options = MessageSettingOptions.values();
    private static Scanner input = new Scanner(System.in);

    public static void displayMessageSettingMenu(){
        String message = """
                                -> Press 1 to SET
                                -> Press 2 for COMMON
                                -> Press O to RETURN TO PREVIOUS MENU
                            """;
        System.out.println(message);
        MessageSettingOptions userInput = getRequest();

        while (userInput != MessageSettingOptions.RETURN_TO_PREVIOUS_MENU){
            switch(userInput){
                case SET:{
                    Set.displaySetMenu();
                    break;
                }
                case COMMON:{
                    Common.displayCommonMenu();
                    break;
                }
                default:{
                    break;
                }
            }
            System.out.println(message);
            userInput = getRequest();
        }
        Messages.displayMessagesMenu();
    }

    private static MessageSettingOptions getRequest() {
        int request = 0;
        try {
            do {
                System.out.println("Waiting for input: ");
                request = input.nextInt();
            }while (request < 0 || request > 2);
        }
        catch (NoSuchElementException noSuchElementException){
            System.err.println("Invalid Input! Terminating...");
            Messages.displayMessagesMenu();
        }
        catch (NullPointerException nullPointerException){
            System.err.println("You have not entered any input! Terminating...");
            Messages.displayMessagesMenu();
        }
        if (request == 0){
            System.out.println("Returning to previous menu... ");
            return options[2];
        }
        return options[request - 1];
    }
}

class Set{
    private static Scanner input = new Scanner(System.in);
    private static final int lastOption = 3;
    static void displaySetMenu(){
        String message = """
                    -> Press 1 for MESSAGE CENTRE NUMBER
                    -> Press 2 for MESSAGE SENT AS
                    -> Press 3 for MESSAGE VALIDITY
                    -> Press 0 to RETURN PREVIOUS MENU
                """;
        System.out.println(message);
        SetMenuOptions userInput = getRequest(lastOption);
        while (userInput != SetMenuOptions.RETURN_TO_PREVIOUS_MENU){
            switch (userInput){
                case MESSAGE_CENTRE_NUMBER:{
                    System.out.println("Set Message Centre Number: ");
                    try{
                        String messageCentreNumber = input.next();
                        System.out.println("Message centre number has been set successfully!");
                    }
                    catch (NullPointerException nullPointerException){
                        System.err.println("Invalid input entered!");
                        MessageSettings.displayMessageSettingMenu();
                    }
                    break;
                }
                case MESSAGE_SENT_AS: {
                    System.out.println("Message menu");
                    break;
                }
                case MESSAGE_VALIDITY:{
                    System.out.println("Now in message validity");
                    break;
                }
            }
            displaySetMenu();
        }
        MessageSettings.displayMessageSettingMenu();
    }

    private static SetMenuOptions getRequest(int lastOption) {
        SetMenuOptions[] options = SetMenuOptions.values();
        int request = 0;
        try{
            do{
                System.out.print("Waiting for input: ");
                request = input.nextInt();
            }while (request < 0 || request > lastOption);
            if (request == 0){
                System.out.println("Returning to previous menu...");
                return options[lastOption];
            }
        }
        catch (NoSuchElementException noSuchElementException){
            System.err.println("Invalid input! Terminating...");
            Messages.displayMessagesMenu();
        }
        catch (NullPointerException nullPointerException){
            System.err.println("No input entered! Terminating...");
            Messages.displayMessagesMenu();
        }
        return options[request - 1];
    }
}

class Common{
    private static CommonMenuOptions userInput;
    private static final Scanner input = new Scanner(System.in);
    private static CommonMenuOptions[] options = CommonMenuOptions.values();
    private static String message = """
                    -> Press 1 for DELIVERY REPORTS
                    -> Press 2 to REPLY_VIA_SAME_CENTRE,
                    -> Press 3 for CHARACTER_SUPPORT,
                    -> Press 0 to RETURN TO PREVIOUS MENU
                """;

    static void displayCommonMenu(){
        System.out.println(message);
        userInput = getRequest();

        while (userInput != CommonMenuOptions.RETURN_TO_PREVIOUS_MENU){
            switch (userInput){
                case DELIVERY_REPORTS:{
                    System.out.println("view delivery reports");
                    break;
                }
                case REPLY_VIA_SAME_CENTRE:{
                    System.out.println("Reply via same centre");
                    break;
                }
                case CHARACTER_SUPPORT:{
                    System.out.println("Character Support");
                }
                default:{
                    break;
                }
            }
            displayCommonMenu();
        }
        System.out.println("Returning to previous menu...");
        Messages.displayMessagesMenu();
    }

    private static CommonMenuOptions getRequest() {
        int userInput = 0;
        try{
            do {
                System.out.print("Waiting for input: ");
                userInput = input.nextInt();
            } while (userInput < 0 || userInput > 3);
            if (userInput == 0){
                return options[3];
            }

        }catch (NoSuchElementException | NullPointerException noSuchElementException){
            System.err.println("Invalid input!");
            Messages.displayMessagesMenu();
        }
        return options[userInput - 1];
    }
}

enum CommonMenuOptions{
    DELIVERY_REPORTS(1),
    REPLY_VIA_SAME_CENTRE(2),
    CHARACTER_SUPPORT(3),
    RETURN_TO_PREVIOUS_MENU(0);

    CommonMenuOptions(int option) {
        this.option = option;
    }
    private final int option;
}

enum MessageSettingOptions{
    SET(1),
    COMMON(2),
    RETURN_TO_PREVIOUS_MENU(3);

    private final int option;

    MessageSettingOptions(int option) {
        this.option = option;
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

enum SetMenuOptions{
    MESSAGE_CENTRE_NUMBER(1),
    MESSAGE_SENT_AS(2),
    MESSAGE_VALIDITY(3),
    RETURN_TO_PREVIOUS_MENU(0);

    SetMenuOptions(int option){
        this.option = option;
    }
    private final int option;
}
