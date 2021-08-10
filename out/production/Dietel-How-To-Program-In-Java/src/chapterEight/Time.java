package chapterEight;
import lombok.Data;

import java.security.InvalidParameterException;

@Data
public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour){
        this(hour,0,0);
    }

    public Time(int hour, int minute){
        this(hour, minute, 0);
    }

    public Time (int hour, int minute, int second){
        try{
            validation(hour,minute,second);
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        catch (InvalidParameterException error){
            System.out.println(error.getMessage());
        }

    }

    private static void validation(int hour, int minute, int second) {
        boolean isValid;
        isValid = hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60;
        if (!isValid){
            throw new InvalidParameterException("Invalid time parameters");
        }
    }

    public String displayUniversalTime() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public String displayTwelveHourTime() {
        if (hour > 12){
            return String.format("%02d:%02d:%02d%s",hour - 12,minute,second, "PM");
        }
        else{
            if (hour == 12){
                return String.format("%02d:%02d:%02d%s",hour,minute,second, "PM");
            }
            else{
                if (hour == 0){
                    return String.format("%02d:%02d:%02d%s",12,minute,second, "AM");
                }
                else {
                    return String.format("%02d:%02d:%02d%s",hour,minute,second,"AM");
                }
            }
        }
    }
}
