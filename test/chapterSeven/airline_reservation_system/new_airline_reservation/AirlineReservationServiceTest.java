package chapterSeven.airline_reservation_system.new_airline_reservation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationServiceTest {
    @Test
    void testCanGenerateBoardingPass() throws AirlineReservationException {
        AirlineReservationService service = new AirlineReservationService();
        service.assignSeatInFirstClassSection(4);
        String boardingPass = service.generateBoardingPassFor("Ehis Edemakhiota", 4, "FirstClass");
        assertEquals("""
                ___________________________
                Name: Ehis Edemakhiota,
                Section: FirstClass,
                Seat Number: 4
                ****************************
                Happy Travels""", boardingPass);
    }
}