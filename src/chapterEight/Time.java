package chapterEight;

import java.util.NoSuchElementException;

public class Time {
    int hour;
    int minute;
    int second;

    public void setTime(int hour, int minute, int second) {
        boolean isInvalid;
        isInvalid = hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59;
        if (isInvalid){
            throw new NoSuchElementException("Invalid time!");
        }
        else{
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String displayUniversalTime() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}
