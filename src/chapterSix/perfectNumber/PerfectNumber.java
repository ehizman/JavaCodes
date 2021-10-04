package chapterSix.perfectNumber;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        int total = 1;
        int counter = 2;
        int factor;
        while (counter <= (number/2) ){
            if (number % counter == 0){
                factor = counter;
                total = total + factor;
            }
            counter++;
        }
        return total == number;
    }
}
