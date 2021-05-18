package Airconditioner;

public class Airconditioner {
    private String productName;
    private boolean isOn;

    public Airconditioner(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOn(boolean condition) {
        isOn = condition;
    }

    public boolean isOn() {
        return isOn;
    }
}
