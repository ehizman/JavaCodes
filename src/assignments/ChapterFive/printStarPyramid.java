package assignments.ChapterFive;

public class printStarPyramid {
    public static void main(String[] args) {

        /************ Pattern D **************/
        System.out.println("D");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 9; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("C");
        /****************** PAttern C********/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("A");
        /********** Pattern A *****************/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            /*a*/
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
        System.out.println();
        /******** PAttern B *********/
        System.out.println("B");
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
