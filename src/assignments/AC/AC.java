package assignments.AC;

public class AC {
    private final String productName;
    private String temperature;
    private boolean isOn;

    public AC(String productName) {
        this.productName = productName;
    }

    public String getTemperature() {
        boolean powerState = isOn();
        if (powerState){
            return temperature;
        }
        return null;
    }

    public String displayName() {
        boolean powerState = isOn();
        if (powerState){
            return productName;
        }
        return "";
    }

    public void powerOn() {
        temperature = "16";
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void powerOff() {
        isOn = false;
    }

    public void setTemperature(String temperature) {
        boolean powerState = isOn();
        if (powerState) {
            this.temperature = temperature;
        }
    }
}
