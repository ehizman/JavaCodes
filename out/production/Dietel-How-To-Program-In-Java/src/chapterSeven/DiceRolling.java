package chapterSeven;

import java.util.Random;
import java.util.stream.IntStream;

public class DiceRolling {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int result_of_rolling_first_dice;
        int result_of_rolling_second_dice;
        int[] array_of_sums = new int[11];
        for (int i = 0; i < 36_000_000; i++) {
             result_of_rolling_first_dice = randomNumberGenerator.nextInt(6) + 1;
             result_of_rolling_second_dice = randomNumberGenerator.nextInt(6) + 1;

             switch (result_of_rolling_first_dice + result_of_rolling_second_dice){
                 case 2 -> array_of_sums[0]++;
                 case 3 -> array_of_sums[1]++;
                 case 4 -> array_of_sums[2]++;
                 case 5 -> array_of_sums[3]++;
                 case 6 -> array_of_sums[4]++;
                 case 7 -> array_of_sums[5]++;
                 case 8 -> array_of_sums[6]++;
                 case 9 -> array_of_sums[7]++;
                 case 10 -> array_of_sums[8]++;
                 case 11 -> array_of_sums[9]++;
                 case 12 -> array_of_sums[10]++;
             }
        }
        int counter = 2;
        for (int i : array_of_sums) {
            System.out.printf("occurrences of %d: %d%n", counter, i);
            counter++;
        }
    }
}
