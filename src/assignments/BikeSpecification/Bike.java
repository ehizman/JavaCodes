package assignments.BikeSpecification;

public class Bike {
    private int powerStatus;

    public int getPowerStatus() { //getter
       return powerStatus;
    }

    public void setOn() { //setter
        if (powerStatus == 0) {
            powerStatus = 1;
        }
    }

    public void setOff() {
        if (powerStatus == 1) {
            powerStatus = 0;
        }
    }

}
