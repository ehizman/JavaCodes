package ChapterFive;

public class DiamondPrinting {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i+=2) {
            for (int j = i; j < 8; j+=2) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i+=2) {
            for (int j = 0; j <= i; j+=2) {
                System.out.print(" ");
            }
            for (int j = i; j < 7; j++) {
                System.out.print("*");
            }
//            for (int j = i; j < 3 ; j++) {
//                System.out.print("*");
//            }
            System.out.println();
        }
    }
}