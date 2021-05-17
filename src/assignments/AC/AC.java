package assignments.AC;

public class AC {
    private final String productName;
    private final int temperature;
    private boolean isOn;

    public AC(String productName, int initialTemperature) {
        this.productName = productName;
        this.temperature = initialTemperature;
    }

    public int getInitialTemperature() {
        return temperature;
    }

    public String displayName() {
        boolean powerState = isOn();
        if (powerState){
            return productName;
        }
        return "";
    }

    public void powerOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void powerOff() {
        isOn = false;
    }
}
