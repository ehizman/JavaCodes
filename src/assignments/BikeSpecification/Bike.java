package assignments.BikeSpecification;

import java.util.ArrayList;
import java.util.Arrays;

public class Bike {
    private int powerStatus;
    private String gearStatus;
    private final ArrayList<String> gearList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "P"));

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

    public String getGearStatus() {
        return gearStatus;
    }

    public void setGear(String gearStatus) {
        if (gearList.contains(gearStatus)){
            this.gearStatus = gearStatus;
        }
    }
}
