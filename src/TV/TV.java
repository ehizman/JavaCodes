package TV;

public class TV {
    private final String productName = "Ehizman";
    private boolean isOn;
    private int channel;

    public TV(int initialVolume, int initialChannel) {
        channel = initialChannel;
    }

    String getName() {
        return productName;
    }

    public void setOn(boolean condition) {
        isOn = condition;
    }

    public boolean isOn() {
        return isOn;
    }

    public void moveToNextChannel() {
        channel++;
    }

    public int getCurrentChannel() {
        return channel;
    }

    public int getCurrentVolume() {
        return 0;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
