package assignments.Nokia3310Phone;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static assignments.Nokia3310Phone.Nokia_3310_Phone.displayMainMenu;

public class PhoneBook {
    static int numberOfContacts;
    static final int maximumNumberOfContacts = 500;
    private static String name;
    private static String number;
    private static final int B_CARD_SIZE = 45;
    private static final PhoneBookMenuOption[] options = PhoneBookMenuOption.values();
    static Scanner input = new Scanner(System.in);

    static void displayPhoneBookMenu() {
        String message = """
                                -> Press 1 to SEARCH
                                -> Press 2 to display SERVICE NOS
                                -> Press 3 to ADD NAME
                                -> Press 4 to ERASE
                                -> Press 5 to EDIT
                                -> Press 6 to ASSIGN TONE
                                -> Press 7 to SEND B/'CARD
                                -> Press 8 to DISPLAY OPTIONS
                                -> Press 9 to view SPEED DIALS
                                -> Press 10 to set VOICE TAGS
                                -> Press 0 to RETURN TO PREVIOUS MENU
                            """;
        System.out.print(message);
        PhoneBookMenuOption userInput = getRequest();

        while (userInput != PhoneBookMenuOption.RETURN_TO_PREVIOUS_MENU){
            switch (userInput){
                case SEARCH:{
                    System.out.print("Enter number to search for: ");
                    number =  input.next();
                    System.out.printf("%s has been found successfully%n", number);
                    break;
                }

                case SERVICE_NOS:{
                    System.out.print("Enter service nos: ");
                    String serviceNos = input.next();
                    System.out.printf("%s has been successfully entered as a service number%n", serviceNos);
                    break;
                }

                case ADD_NAME:{
                    System.out.println("Enter name to add: ");
                    name = input.next();
                    System.out.printf("%s has been added to contact list%n", name);
                    numberOfContacts++;
                    break;
                }

                case EDIT:{
                    System.out.println("Search for contact to edit");
                    System.out.print("Enter contact number: ");
                    number = input.next();
                    break;
                }

                case ASSIGN_TONE:{
                    System.out.println("Select tone to assign to contact");
                    System.out.print("Enter the name of ringtone: ");
                    String nameOfRingTone = input.next();
                    break;
                }

                case SEND_B_CARD:{
                    System.out.println("SELECT CONTACT");
                    name = input.next();
                    number = input.next();
                    String B_Card_Details = String.format("""
                                    NAME: %s
                                    PHONE NUMBER: %s
                                    SIZE: %dK
                                """, name, number, B_CARD_SIZE);
                    System.out.println(B_Card_Details);
                    break;
                }

                case OPTIONS:{
                    Options.displayPhoneBookOptionsMenu();
                    break;
            }

                case SPEED_DIALS:{
                    System.out.println("Set Speed Dials");
                    break;
                }

                case VOICE_TAGS:{
                    System.out.println("Set voice tags");
                    break;
                }

                default: {
                    System.exit(-1);
                }
        }
        System.out.println(message);
        userInput = getRequest();
    }
        if (userInput == PhoneBookMenuOption.RETURN_TO_PREVIOUS_MENU){
            displayMainMenu();
        }
}

    private static PhoneBookMenuOption getRequest() {
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
            System.err.println("Invalid Input, Terminating....");
            System.exit(-1);
        }
        catch (NullPointerException nullPointerException){
            System.err.println("No Input entered, Terminating...");
            System.exit(-1);
        }
        return options[request - 1];
    }

    enum PhoneBookMenuOption {
        SEARCH(1),
        SERVICE_NOS(2),
        ADD_NAME(3),
        ERASE(4),
        EDIT(5),
        ASSIGN_TONE(6),
        SEND_B_CARD(7),
        OPTIONS(8),
        SPEED_DIALS(9),
        VOICE_TAGS(10),
        RETURN_TO_PREVIOUS_MENU(0);

        private final int option;

        PhoneBookMenuOption(int option){
            this.option = option;
        }
    }
}

class Options{
    private static final OptionsMenu[] options = OptionsMenu.values();
    private static final Scanner input = new Scanner(System.in);
    private static String currentView = "grid";

    static void displayPhoneBookOptionsMenu() {
        String message = """
                    -> Press 1 to change TYPE OF VIEW
                    -> Press 2 to check memory status
                    -> Press 0 to return to previous menu
                """;
        System.out.println(message);
        OptionsMenu userInput = getRequest();

        while(userInput != OptionsMenu.RETURN_TO_PREVIOUS_MENU){
            switch(userInput){
                case TYPE_OF_VIEW:{
                    System.out.printf("Current view: %s%n", currentView);
                    if (currentView.equals("grid")){
                        currentView = "list";
                        System.out.println("View has been set to list");
                    }
                    else{
                        currentView = "grid";
                        System.out.println("View has been set to grid");
                    }
                    break;
                }

                case CHECK_MEMORY_STATUS:{
                    getMemoryStatus();
                    break;
                }
                default:{
                    break;
                }
            }
            System.out.println(message);
            userInput = getRequest();
        }
        if (userInput == OptionsMenu.RETURN_TO_PREVIOUS_MENU){
            PhoneBook.displayPhoneBookMenu();
        }
    }

    private static void getMemoryStatus() {
        String systemDialog = String.format("""
                                    Memory Details:
                USED: %d
                REMAINING: %d
                """, PhoneBook.numberOfContacts, (PhoneBook.maximumNumberOfContacts - PhoneBook.numberOfContacts));
        System.out.println(systemDialog);
    }

    private static OptionsMenu getRequest() {
        int request = 0;
        try {
            do {
                System.out.println("Waiting for input: ");
                request = input.nextInt();
            }while (request < 0 || request > 2);
        }
        catch (NoSuchElementException noSuchElementException){
            System.err.println("Invalid Input! Terminating...");
            System.exit(-1);
        }
        catch (NullPointerException nullPointerException){
            System.err.println("You have not entered any input! Terminating...");
            System.exit(-1);
        }
        if (request == 0){
            System.out.println("Returning to previous menu... ");
            return options[2];
        }
        return options[request - 1];
    }
}

enum OptionsMenu{
    TYPE_OF_VIEW(1),
    CHECK_MEMORY_STATUS(2),
    RETURN_TO_PREVIOUS_MENU(0);

    public final int option;


    OptionsMenu(int option) {
        this.option = option;
    }
}