package TV;

public class TV {
    private final String productName = "Ehizman";
    private boolean isOn;
    private int channel;
    private int volume;
    private boolean isMute;
    private final int MAXIMUM_VOLUME = 10;
    private final int MINIMUM_VOLUME = 1;
    private final int MAXIMUM_CHANNEL = 10;
    private final int MINIMUM_CHANNEL = 1;
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
//
    }

    public boolean isOn() {
        return isOn;
    }

    public void moveToNextChannel() {
        if (isOn){
            if (channel < MAXIMUM_CHANNEL) {
                channel++;
            }
        }
    }

    public int getCurrentChannel() {
        if (!isOn){
            if (isOnForFirstTime){
                return 0;
            }
        }
        return channel;
    }

    public int getCurrentVolume() {
        if (isMute){
            return 0;
        }
        if (!isOn){
            if (isOnForFirstTime){ //if TV has been powered on previously
                return  0; //0 means that volume cannot be accessed
            }
        }
        return volume;
    }

    public void setChannel(int channel) {
        if (isOn) {
            if (channel <= MAXIMUM_CHANNEL){
                if (channel >= MINIMUM_CHANNEL) {
                    this.channel = channel;
                }
            }
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
