package chapterSix.perfectNumber;

import commonOperations.IoOperations;

public class DisplayPerfectNumbers {

    public static void main(String[] args) {
        IoOperations.display("Perfect Numbers Between 1 and 1000");
        for (int i = 1; i <= 1000; i++) {
            if (PerfectNumber.isPerfect(i)){
                IoOperations.display(i + "\n");
            }
        }
    }
}
