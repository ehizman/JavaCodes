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

    public String getName() {
        return productName;
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
