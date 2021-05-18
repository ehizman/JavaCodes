package TV;

public class TV {
    private final String productName = "Ehizman";
    private boolean isOn;
    private int channel;
    private int volume;

    public TV(int initialVolume, int initialChannel) {
        channel = initialChannel;
        this.volume = initialVolume;
    }

    String getName() {
        return productName;
    }

    public void setOn(boolean condition) {
        isOn = condition;
        if (!isOn){
            channel = 0;
        }
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
        return volume;
    }

    public void setChannel(int channel) {
        if (isOn){
            this.channel = channel;
        }
        if (!isOn) {
            this.channel = 0;
        }
    }

    public void increaseVolume() {
        volume++;
    }
}
