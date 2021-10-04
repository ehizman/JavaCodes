package chapterSeven.airline_reservation_system.new_airline_reservation;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    @DisplayName("all plane seat are empty when at initial")
    void getSeats() {
        Plane plane = new Plane();
        boolean[] expectedArray = new boolean[]{false, false, false, false, false, false, false, false, false, false};
        assertArrayEquals(expectedArray, plane.getSeats());
    }

    @Test
    void test_CanFindFirstEmptySeatInFirstClassSection(){
        try{
            Plane plane = new Plane();
            int expectedSeatNumber = 1;
            assertEquals(expectedSeatNumber, plane.returnFirstEmptySeatNumberInFirstClassSection());
        }
        catch (AirlineReservationException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void canBookSeatInFirstClass(){
        try{
            Plane plane = new Plane();
            int seatNo = plane.returnFirstEmptySeatNumberInFirstClassSection();
            plane.assignSeatInFirstClass(seatNo);
            assertTrue(plane.getSeats()[seatNo-1]);
        }catch(AirlineReservationException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void testThrowsExceptionWhenFirstSectionIsFilled() throws AirlineReservationException {
        Plane plane = new Plane();
        int seatNo = plane.returnFirstEmptySeatNumberInFirstClassSection();
        plane.assignSeatInFirstClass(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInFirstClassSection();
        plane.assignSeatInFirstClass(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInFirstClassSection();
        plane.assignSeatInFirstClass(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInFirstClassSection();
        plane.assignSeatInFirstClass(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInFirstClassSection();

        plane.assignSeatInFirstClass(seatNo);
        assertThrows(AirlineReservationException.class, plane::returnFirstEmptySeatNumberInFirstClassSection);
    }

    @Test
    void testThrowAirlineReservationExceptionWhenTryingToAssignASeatOutOfBoundsForTheFirstClassSection(){
        Plane plane = new Plane();
        assertThrows(AirlineReservationException.class, ()-> plane.assignSeatInFirstClass(6));
        assertThrows(AirlineReservationException.class, ()-> plane.assignSeatInFirstClass(0));
    }

    @Test
    void test_CanFindFirstEmptySeatInEconomySection(){
        try{
            Plane plane = new Plane();
            int expectedSeatNumber = 6;
            assertEquals(expectedSeatNumber, plane.returnFirstEmptySeatNumberInEconomy());
        }
        catch (AirlineReservationException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void canBookSeatInEconomy(){
        try{
            Plane plane = new Plane();
            int seatNo = plane.returnFirstEmptySeatNumberInEconomy();
            plane.assignSeatInEconomy(seatNo);
            assertTrue(plane.getSeats()[seatNo-1]);
        }catch(AirlineReservationException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void testThrowsExceptionWhenEconomyIsFilled() throws AirlineReservationException {
        Plane plane = new Plane();
        int seatNo = plane.returnFirstEmptySeatNumberInEconomy();
        plane.assignSeatInEconomy(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInEconomy();
        plane.assignSeatInEconomy(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInEconomy();
        plane.assignSeatInEconomy(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInEconomy();
        plane.assignSeatInEconomy(seatNo);
        seatNo = plane.returnFirstEmptySeatNumberInEconomy();

        plane.assignSeatInEconomy(seatNo);
        assertThrows(AirlineReservationException.class, plane::returnFirstEmptySeatNumberInEconomy);
    }

    @Test
    void testThrowAirlineReservationExceptionWhenTryingToAssignASeatOutOfBoundsForEconomySection(){
        Plane plane = new Plane();
        assertThrows(AirlineReservationException.class, ()-> plane.assignSeatInEconomy(4));
        assertThrows(AirlineReservationException.class, ()-> plane.assignSeatInEconomy(11));
    }

    @Test
    void testThatCannotBookASeatAlreadyAssignedInEconomy() throws AirlineReservationException {
        Plane plane = new Plane();
        plane.assignSeatInEconomy(8);
        Exception ex = assertThrows(AirlineReservationException.class, ()-> plane.assignSeatInEconomy(8));
        assertEquals("Seat 8 is already booked", ex.getMessage());
    }

    @Test
    void testThatCannotBookASeatAlreadyAssignedInFirstClass() throws AirlineReservationException {
        Plane plane = new Plane();
        plane.assignSeatInFirstClass(4);
        Exception ex = assertThrows(AirlineReservationException.class, ()-> plane.assignSeatInFirstClass(4));
        assertEquals("Seat 4 is already booked", ex.getMessage());
    }
}