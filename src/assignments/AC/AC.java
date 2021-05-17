package assignments.AC;

public class AC {
    String productName;
    int initialTemperature;

    public AC(String productName, int initialTemperature) {
        this.productName = productName;
        this.initialTemperature = initialTemperature;
    }

    public int getInitialTemperature() {
        return initialTemperature;
    }

    public String getName() {
        return productName;
    }
}
