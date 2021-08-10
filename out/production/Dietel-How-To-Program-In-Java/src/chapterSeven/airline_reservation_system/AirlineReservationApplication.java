package chapterSeven.airline_reservation_system;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class AirlineReservationApplication {
    private static final boolean[] seatInPlane = new boolean[10];
    private static int count = seatInPlane.length;
    
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("\n".repeat(20));
        displayPrompt("Welcome to Air Peace");
        if (count == 0) {
            System.out.println("There are no more seats available on the plane");
            System.exit(0);
        }
        displayPrompt("\nPlease enter your name: ");
        String name = collectInput();
        displayPrompt("Please enter your destination: ");
        String destination = collectInput();

        displayPrompt("""
                
                Please type 1 for First Class
                Please type 2 for Economy""");
        String userInput = collectInput();
        try {
            switch (userInput){
                case "1" -> {
                    assignSeatInFirstClass(name, destination, "First Class");
                }
                case "2" -> {
                    assignSeatInEconomy(name, destination, "Economy");
                }
                default -> throw new InvalidParameterException("""
                    
                    Please type either 1 or 2 to book a seat
                    """);
            }
        }catch (InvalidParameterException exception){
            System.out.println(exception.getMessage());
            run();
        }
    }

    private static void assignSeatInEconomy(String name, String destination, String userInput) {
        int resultOfCheck = returnSeatNumberIfSeatsAreAvailableElseReturn0(userInput);
        if (resultOfCheck == 0){
            String userinput = actionToTakeIfSeatsAreNotAvailableOnAPartOfThePlane("First Class");
            String alternative = checkIfUserWantsASeatOnAnotherPartOfThePlane("Economy", userInput);
            if (alternative != null){
                assignSeatInFirstClass(name, destination, userInput);
            }
        }
        else{
            int seatNumber = resultOfCheck;
            assignSeat(seatNumber);
            displayBoardingPass(name, destination, seatNumber, "Economy");
            closingDialog();
            run();
        }
    }

    private static void assignSeatInFirstClass(String name, String destination, String userInput) {
        int resultOfCheck = returnSeatNumberIfSeatsAreAvailableElseReturn0(userInput);
        if (resultOfCheck == 0){
            userInput = actionToTakeIfSeatsAreNotAvailableOnAPartOfThePlane("First Class");
            String alternative = checkIfUserWantsASeatOnAnotherPartOfThePlane("Economy", userInput);
            if (alternative != null){
                assignSeatInEconomy(name, destination, userInput);
                closingDialog();
                run();
            }
        }
        else{
            int seatNumber = resultOfCheck;
            assignSeat(seatNumber);
            displayBoardingPass(name, destination, seatNumber, "First Class");
            closingDialog();
            run();
        }
    }

    private static void closingDialog() {
        if (count != 0){
            String userInput;
            displayPrompt("Do you wish to continue?");
            userInput = collectInput();
        }
        else{
            displayPrompt("All seats have been taken");
            displayPrompt("Flight ready for take off");
        }

    }

    private static int returnSeatNumberIfSeatsAreAvailableElseReturn0(String seatType) {
        if (seatType.equals("First Class")){
            for (int i = 0; i < (seatInPlane.length/2); i++) {
                if (!seatInPlane[i]) return i + 1;
            }
        }
        else {
            for (int i = (seatInPlane.length / 2); i < seatInPlane.length; i++) {
                if (!seatInPlane[i]) return i + 1;
            }
        }
        return 0;
    }

    private static void displayBoardingPass(String passengerName, String destination, int seatNumber, String seatType) {
        displayPrompt(String.format("""
                ------------------------------
                |Passenger name: %s
                |Destination: %s
                |Seat Type: %s
                |Seat Number : %d
                |Thank you for your patronage
                ------------------------------""",passengerName,destination, seatType, seatNumber));
    }

    private static void assignSeat(int seatNumber) {
        seatInPlane[seatNumber-1] = true;
        updateAvailableSeats();
    }

    private static String checkIfUserWantsASeatOnAnotherPartOfThePlane(String alternateSeatType, String userInput) {
        System.out.println(userInput);
        switch (userInput){
            case "YES" -> {
                return alternateSeatType;
            }
            case "NO" -> {
                displayPrompt("Next Flight leaves in 3 hours");
                return null;
            }
            default -> throw new InvalidParameterException("You entered an invalid input");
        }
    }

    private static String actionToTakeIfSeatsAreNotAvailableOnAPartOfThePlane(String seatType) {
        displayPrompt(String.format("""
                There are no %s seats available
                Would you mind an %s seat?
                Press 'yes' to book a %s seat
                Press 'no' to exit""", seatType, seatType.equals("First Class")? "Economy":"First Class", seatType.equals("First Class")? "Economy":"First Class"));
        return collectInput().toUpperCase();
    }

    private static void updateAvailableSeats() {
        count--;
    }

    private static String collectInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.println(userInput);
        return userInput;
    }

    private static void displayPrompt(String message) {
        System.out.println(message);
    }
}
