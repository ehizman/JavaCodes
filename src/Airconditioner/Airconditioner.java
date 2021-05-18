package Airconditioner;

public class Airconditioner {
    private String productName;
    private boolean isOn;
    private int temperature = 16;

    public Airconditioner(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOn(boolean condition) {
        isOn = condition;
        if (!isOn) {
            setTemperature(0);
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
}
