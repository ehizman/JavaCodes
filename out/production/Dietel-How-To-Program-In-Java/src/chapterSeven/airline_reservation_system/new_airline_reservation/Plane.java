package chapterSeven.airline_reservation_system.new_airline_reservation;

public class Plane {
    private boolean[] seats = new boolean[10];

    public boolean[] getSeats() {
        return seats;
    }

    public int returnFirstEmptySeatNumberInFirstClassSection() throws AirlineReservationException {
        for (int i = 0; i < (seats.length/2); i++) {
            if (!seats[i]){
                System.out.println("found");
                return i+1;
            }
        }
        throw new AirlineReservationException("All seats in first class are empty!");
    }

    public void assignSeatInFirstClass(int seatNo) throws AirlineReservationException {
        seatNo = seatNo - 1;
        if (seatNo < 0||seatNo >= (seats.length/2)){
            throw new AirlineReservationException(String.format("Seat %d is out of bounds for First Class reservation", seatNo+1));
        }
        if (seats[seatNo]){
            throw new AirlineReservationException(String.format("Seat %d is already booked", seatNo+1));
        }
        seats[seatNo] = true;
    }

    public int returnFirstEmptySeatNumberInEconomy() throws AirlineReservationException {
        for (int i = (seats.length/2); i < seats.length ; i++) {
            if (!seats[i]){
                return i+1;
            }
        }
        throw new AirlineReservationException("All seats in economy are empty!");
    }

    public void assignSeatInEconomy(int seatNo) throws AirlineReservationException {
        seatNo = seatNo - 1;
        if (seatNo < (seats.length/2) || seatNo >= seats.length){
            throw new AirlineReservationException(String.format("Seat %d is out of bounds for economy reservation", seatNo+1));
        }
        if (seats[seatNo]){
            throw new AirlineReservationException(String.format("Seat %d is already booked", seatNo+1));
        }
        seats[seatNo] = true;
    }
}
