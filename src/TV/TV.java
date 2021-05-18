package TV;

public class TV {
    private final String productName = "Ehizman";
    private boolean isOn;
    private int channel;
    private int volume;
    private boolean isMute;
    private final int MAXIMUM_VOLUME = 10;
    private final int MINIMUM_VOLUME = 1;
    private boolean isOnForFirstTime = false;

    public TV(int initialVolume, int initialChannel) {
        this.channel = MINIMUM_VOLUME;
        this.volume = 1;
    }

    public TV() {
        this.channel = MINIMUM_VOLUME;
        this.volume = 1;
    }

    String getName() {
        return productName;
    }

    public void setOn(boolean condition) {
        isOn = condition;
        isOnForFirstTime = true;
//        if (!isOn) {
//            channel = 0;
//            volume = 0;
//        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void moveToNextChannel() {
        if (isOn){
            channel++;
        }
    }

    public int getCurrentChannel() {
        if (!isOn){
            if (isOnForFirstTime){
                channel = 0;
            }
        }
        return channel;
    }

    public int getCurrentVolume() {
        if (isMute){
            volume = 0;
        }
        if (!isOn){
            if (isOnForFirstTime){
                volume = 0;
            }
        }
        return volume;
    }

    public void setChannel(int channel) {
        if (isOn) {
            this.channel = channel;
        }
        if (!isOn) {
            this.channel = 0;
        }
    }

    public void increaseVolume() {
        if (isOn){
            if (volume < MAXIMUM_VOLUME){
                volume++;
            }
        }
    }

    public void setMute(boolean condition) {
        if (isOn){
            isMute = condition;
        }
    }

    public boolean isMute() {
        return isMute;
    }

    public void decreaseVolume() {
        if (isOn){
            if (volume > MINIMUM_VOLUME){
                volume--;
            }
        }
    }

    public void moveToPreviousChannel() {
        if (isOn){
            channel--;
        }
    }
}
