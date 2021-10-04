package chapterSeven;

public class MultiDimensionalArray {
    public static void main(String ... args){

        int[][] array = new int[][]{{2,3,5}, {0,5,9}, {1,2,1}};

        for (int[] numbers : array) {
            for (int aNumber : numbers) {
                System.out.printf("%d%s", aNumber, " ");
            }
            System.out.println();
        }

    }
}
