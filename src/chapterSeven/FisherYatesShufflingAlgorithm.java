package chapterSeven;

import java.security.SecureRandom;

public class FisherYatesShufflingAlgorithm {
    private static int[] array = new int[]{1,7,9,6,5,4,6};
    private static int[] copyArray = new int[array.length];

    public static int[] shuffle() {
        SecureRandom random = new SecureRandom();
        int randomIndex;
        for (int i = array.length-1; i >=0 ; i--) {
            if (i == 0){
                randomIndex = 0;
            }
            else{
                randomIndex = random.nextInt(i);
            }
            copyArray[array.length - 1 - i] = array[randomIndex];
            array[randomIndex] = array[i];
        }
        return copyArray;
    }
}
