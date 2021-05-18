package Airconditioner;

public class Airconditioner {
    private String productName;
    private boolean isOn;
    private int temperature;

    public Airconditioner(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOn(boolean condition) {
        setTemperature(16);
        isOn = condition;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
