package Airconditioner;

public class Airconditioner {
    private String productName;
    private boolean isOn;
    private int temperature = 16;
    private int previousTemperature;

    public Airconditioner(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOn(boolean condition) {
        isOn = condition;
        if (!isOn) {
            previousTemperature = temperature;
            setTemperature(0);
        }
        if (previousTemperature != 0){
            setTemperature(previousTemperature);
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        boolean isOn = isOn();
        if (isOn){
            this.temperature = temperature;
        }
        if (!isOn){
            this.temperature = 0;
        }

    }

    public void increaseTemperature() {
        setTemperature(temperature += 1);
    }

    public void decreaseTemperature() {
        setTemperature(temperature -= 1);
    }
}
