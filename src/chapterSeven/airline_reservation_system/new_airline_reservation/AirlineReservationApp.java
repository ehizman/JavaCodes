package chapterSeven.airline_reservation_system.new_airline_reservation;


import java.util.Scanner;

public class AirlineReservationApp {
    private static AirlineReservationService service = new AirlineReservationService();
    public static void main(String... args) {
        System.out.println("Welcome to Air Peace!");
        System.out.println("""
                Press 1 to book seat in First class
                Press 2 to book seat in Economy
                Press 3 to log out of application""");
        Scanner scanner = new Scanner(System.in);

        run(scanner.nextInt());
    }

    private static void run(int response) {
        switch(response){
            case 1 -> {
                String name = getPassengerName();
                try{
                    int seatNo = service.checkFirstClass_ReturnSeatNoIfAvailable_ElseThrowException();
                    service.assignSeatInFirstClassSection(seatNo);
                    String boardingPass = service.generateBoardingPassFor(name, seatNo, "First Class");
                    System.out.println(boardingPass);
                    Thread.sleep(10000);
                    System.out.println("\n".repeat(50));
                    main();
                }
                catch (AirlineReservationException | InterruptedException ex){
                    boolean isOutOfBounds = ex.getMessage().contains("Seat %d is out of bounds for economy reservation");
                    boolean isAlreadyBooked = ex.getMessage().contains("Seat %d is already booked");
                    if (isOutOfBounds||isAlreadyBooked){
                        System.out.println(ex.getMessage());
                        main();
                    }
                    try{
                        String responseTwo = checkIfCustomerWouldLikeToBookAnotherSeatInAnotherSection();
                        if (responseTwo.equalsIgnoreCase("yes")){
                            int seatNoInEconomy = service.checkEconomy_ReturnSeatNoIfAvailable_ElseThrowException();
                            service.assignSeatInEconomy(seatNoInEconomy);
                            String boardingPass = service.generateBoardingPassFor(name, seatNoInEconomy, "Economy");
                            System.out.println(boardingPass);
                            Thread.sleep(10000);
                            System.out.println("\n".repeat(50));
                            main();
                        }
                        else{
                            if (responseTwo.equalsIgnoreCase("no")){
                                System.out.println("""
                            Next FLight leaves in Three Hours
                            Thank you for your patronage""");
                            }
                            else{
                                System.out.println("Invalid selection made!");
                            }
                            main();
                        }
                    }
                    catch (AirlineReservationException | InterruptedException anotherEx){
                        System.out.println("No seats are available");
                        System.out.println("Next Flight leaves in 3 hours");
                    }
                }
            }
            case 2-> {
                try{
                    String name = getPassengerName();
                    int seatNo = service.checkEconomy_ReturnSeatNoIfAvailable_ElseThrowException();
                    service.assignSeatInEconomy(seatNo);
                    service.generateBoardingPassFor(name,seatNo, "Economy");
                }
                catch (AirlineReservationException ex){
                    boolean isOutOfBounds = ex.getMessage().contains("Seat %d is out of bounds for economy reservation");
                    boolean isAlreadyBooked = ex.getMessage().contains("Seat %d is already booked");
                    if (isOutOfBounds||isAlreadyBooked){
                        System.out.println(ex.getMessage());
                        main();
                    }
                    try{
                        String responseTwo = checkIfCustomerWouldLikeToBookAnotherSeatInAnotherSection();
                        if (responseTwo.equalsIgnoreCase("yes")){
                            service.checkFirstClass_ReturnSeatNoIfAvailable_ElseThrowException();
                        }
                        else{
                            if (responseTwo.equalsIgnoreCase("no")){
                                System.out.println("""
                            Next FLight leaves in Three Hours
                            Thank you for your patronage""");
                            }
                            else{
                                System.out.println("Invalid selection made!");
                            }
                            main();
                        }
                    }
                    catch (AirlineReservationException anotherEx){
                        System.out.println("No seats are available");
                        System.out.println("Next Flight leaves in 3 hours");
                    }
                }
            }
        }
    }

    private static String getPassengerName() {
        System.out.println("Enter passenger name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static String checkIfCustomerWouldLikeToBookAnotherSeatInAnotherSection() {
        System.out.println("""
                There are currently no seats in First Class
                Would you like a seat in economy?
                Answer with either a Yes or No""");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
