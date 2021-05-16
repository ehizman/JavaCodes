package assignments.BikeSpecification;

import java.util.ArrayList;
import java.util.Arrays;

public class Bike {
    private int powerStatus;
    private String gearShifter;
    private final ArrayList<String> gearList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "N"));
    private int speed;
    private boolean throttleIsPressed;

    public int getPowerStatus() { //getter
       return powerStatus;
    }

    public void setOn() { //setter
        if (powerStatus == 0) {
            powerStatus = 1;
            setGear("N");
        }
    }

    public void setOff() {
        if (powerStatus == 1) {
            powerStatus = 0;
            setGear("N");
        }
    }

    public String getGearStatus() {
        return gearShifter;
    }

    public void setGear(String gearStatus) {
        if (gearList.contains(gearStatus)){
            gearShifter = gearStatus;
        }
        else{
            gearShifter = null;
        }
    }

    public void shiftUp() {
        String currentGear = getGearStatus();
        if (currentGear != null){
            if (currentGear.equals("N")){
                setGear("2");
            }
            else if (currentGear.equals("1")){
                setGear("N");
            }
            else {
                currentGear = (Integer.parseInt(currentGear) + 1) + "";
                setGear(currentGear);
            }
        }
    }

    public void shiftDown() {
        String currentGear = getGearStatus();
        if (currentGear != null){
            if (currentGear.equals("2")) {
                setGear("N");
            }
            else if (currentGear.equals("N")){
                setGear("1");
            }
            else{
                currentGear = (Integer.parseInt(currentGear) - 1) + "";
                setGear(currentGear);
            }
        }
    }

//    public void move() {
//        if (getGearStatus().equals("1")){
//            speed = 5;
//        }
//        if (getGearStatus().equals("2")){
//            speed = 15;
//        }
//    }

    public int checkSpeedometer() {
        return speed;
    }

    public void setThrottle() {
        throttleIsPressed = true;
    }

    public boolean isThrottlePressed() {
        return throttleIsPressed;
    }

    public void accelerate() {
        int accelerationRate = 15;
        if ((throttleIsPressed) && (!getGearStatus().equals("N"))){
            speed = speed + accelerationRate;
        }
    }
}
