package assignments.Nokia3310Phone;

public class Nokia_3310_App {

    public static void main(String[] args) throws InterruptedException {
        Nokia_3310_Phone phone = new Nokia_3310_Phone();
        String message = """
                    -> NOKIA 3310
                    -> Press 1 for PHONEBOOK Menu
                    -> Press 2 for MESSAGES Menu
                    -> Press 3 for CHAT
                    -> Press 4 for CALL REGISTER
                    -> Press 5 for TONES Menu
                    -> Press 6 for SETTINGS
                    -> Press 7 for CALL DIVERT
                    -> Press 8 for GAMES
                    -> Press 9 for CALCULATOR
                    -> Press 10 for REMINDERS
                    -> Press 11 for CLOCK Menu
                    -> Press 12 for PROFILE
                    -> Press 13 for SIM SERVICES
                    -> Press 0 to SWITCH OFF
                """;
        System.out.print(message);
        MenuOption userInput = phone.getRequest();

        while (userInput != MenuOption.TURN_OFF){
            switch (userInput){
                case PHONE_BOOK:{
                    message = """
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
                    phone.getRequest();
                    break;
                }

                case MESSAGES: {
                    message = """
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
                    phone.getRequest();
                    break;
                }

                case CHAT:{
                    System.out.println("Search for who to chat with: ");
                    break;
                }

                case CALL_REGISTER:{
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
                    phone.getRequest();
                    break;
                }

                case TONES:{
                    message = """
                                -> Press 1 to set RINGING TONE
                                -> Press 2 to set RINGING VOLUME
                                -> Press 3 to set INCOMING CALL ALERT
                                -> Press 4 to view COMPOSER
                                -> Press 5 to set MESSAGE ALERT TONE
                                -> Press 6 to set KEYPAD TONES
                                -> Press 7 to set WARNING AND GAME TONES
                                -> Press 8 to set VIBRATING ALERT
                                -> Press 9 to set SCREEN SAVER
                                -> Press 0 to return to PREVIOUS MENU
                            """;
                    System.out.println(message);
                    phone.getRequest();
                    break;
                }

                case SETTINGS:{
                    message = """
                                    -> Press 1 for CALL SETTINGS
                                    -> Press 2 for PHONE SETTINGS
                                    -> Press 3 for SECURITY SETTINGS
                                    -> Press 4 to RESTORE FACTORY SETTINGS
                                    -> Press 0 to return to PREVIOUS MENU
                                """;
                    System.out.println(message);
                    phone.getRequest();
                    break;
                }

                case CALL_DIVERT:{
                    System.out.println("Input phone Number to divert calls to");
                    break;
                }

                case GAMES:{
                    System.out.println("Select games to play");
                    break;
                }

                case CALCULATOR:{
                    System.out.println("Welcome to calculator ");
                    break;
                }

                case REMINDERS:{
                    System.out.println("Set reminder");
                    break;
                }

                case CLOCK:{
                    message = """
                                -> Press 1 to set ALARM CLOCK
                                -> Press 2 for CLOCK SETTINGS
                                -> Press 3 for DATE SETTING
                                -> Press 4 to set STOPWATCH
                                -> Press 5 to set COUNTDOWN TIMER
                                -> Press 6 to set AUTO UPDATE OF DATE AND TIME
                                -> Press 0 to return to PREVIOUS MENU
                            """;
                    System.out.println(message);
                    phone.getRequest();
                    break;
                }

                case PROFILES:{
                    System.out.println("Display Profiles");
                    break;
                }

                case SIM_SERVICES:{
                    System.out.println("Display sim services");
                    break;
                }

                default:{
                    System.exit(-1);
                }

            }
            userInput = phone.getRequest();
        }
    }
}
