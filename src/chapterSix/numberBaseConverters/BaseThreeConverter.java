package chapterSix.numberBaseConverters;

public class BaseThreeConverter{
    public static int[] convertToBaseThree(int number) {
        int[] baseThreeRepresentationOfNumber = new int[2];
        int counter = 1;
        do {
            baseThreeRepresentationOfNumber[counter] = (number % 3);
            counter--;
            number = number / 3;
        } while (number != 0);
        return baseThreeRepresentationOfNumber;
    }
}
