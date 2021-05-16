package assignments.BikeSpecification;

import java.util.ArrayList;
import java.util.Arrays;

public class Bike {
    private int powerStatus;
    private String gearShifter;
    private final ArrayList<String> gearList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "N"));

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

    public void shiftDown() {
        String currentGear = getGearStatus();
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
