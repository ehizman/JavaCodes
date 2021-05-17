package assignments.AC;

public class AC {
    private final String productName;
    private int temperature;
    private boolean isOn;

    public AC(String productName) {
        this.productName = productName;
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
