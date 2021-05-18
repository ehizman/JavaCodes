package TV;

public class TV {
    private final String productName = "Ehizman";
    private boolean isOn;

    String getName() {
        return productName;
    }

    public void setOn(boolean condition) {
        isOn = condition;
    }

    public boolean isOn() {
        return isOn;
    }
}
