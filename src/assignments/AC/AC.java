package assignments.AC;

public class AC {
    private final String productName;
    private String temperature;
    private String previousTemperature;
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
        isOn = true;
//        System.out.println(temperature);
        if (getPreviousTemperature() == null){
            String initialTemperature = "16";
            setTemperature(initialTemperature);
        }
        else{
            setTemperature(getPreviousTemperature());
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void powerOff() {
        setPreviousTemperature();
        isOn = false;
    }

    public void setTemperature(String temperature) {
        boolean powerState = isOn();
        if (powerState) {
            if ((Integer.parseInt(temperature) >= 16) && (Integer.parseInt(temperature) <= 30)) {
                this.temperature = temperature;
            }
        }
    }

    public void setPreviousTemperature() {
        previousTemperature = getTemperature();
    }

    public String getPreviousTemperature() {
        return previousTemperature;
    }
}
