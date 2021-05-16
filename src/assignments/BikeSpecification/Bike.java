package assignments.BikeSpecification;

import java.util.ArrayList;
import java.util.Arrays;

public class Bike {
    private int powerStatus;
    private String currentGear = "P";
    private final ArrayList<String> gearList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "P"));

    public int getPowerStatus() { //getter
       return powerStatus;
    }

    public void setOn() { //setter
        if (powerStatus == 0) {
            powerStatus = 1;
            setGear("P");
        }
    }

    public void setOff() {
        if (powerStatus == 1) {
            powerStatus = 0;
        }
    }

    public String getGearStatus() {
        return currentGear;
    }

    public void setGear(String gearStatus) {
        if (gearList.contains(gearStatus)){
            currentGear = gearStatus;
        }
        else{
            currentGear = null;
        }
    }

    public void gearUp() {
        String currentGear = getGearStatus();
        if (currentGear.equals("P")){
            setGear("1");
        }
        else {
            currentGear = (Integer.parseInt(currentGear) + 1) + "";
            setGear(currentGear);
        }
    }
}
