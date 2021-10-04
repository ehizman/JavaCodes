package chapterSeven.airline_reservation_system.new_airline_reservation;

public class AirlineReservationService {
    private static Plane plane = new Plane();

    public int checkEconomy_ReturnSeatNoIfAvailable_ElseThrowException() throws AirlineReservationException {
        return plane.returnFirstEmptySeatNumberInEconomy();
    }
    public int checkFirstClass_ReturnSeatNoIfAvailable_ElseThrowException() throws AirlineReservationException {
        return plane.returnFirstEmptySeatNumberInFirstClassSection();
    }

    public String generateBoardingPassFor(String name, int seatNo, String section){
        return (String.format("""
___________________________
Name: %s,
Section: %s,
Seat Number: %d
****************************
Happy Travels""", name, section, seatNo));
    }
    public void assignSeatInFirstClassSection(int seatNo) throws AirlineReservationException {
        plane.assignSeatInFirstClass(seatNo);
    }

    public void assignSeatInEconomy(int seatNo) throws AirlineReservationException {
        plane.assignSeatInEconomy(seatNo);
    }
}
