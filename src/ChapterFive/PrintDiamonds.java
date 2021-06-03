package ChapterFive;

public class PrintDiamonds {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <=9 ; i+=2) {
            for (int j = 1; j <= 5 - ((i +1)/2) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 5 - ((i +1)/2) ; j++) {
                System.out.print("  ");
            }
            Thread.sleep(1000);
            System.out.println();
        }
        for (int i = 1; i <=8; i+=2) {
            for (int j = 1; j <= ((i + 1)/2) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 8 - i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= ((i + 1)/2) ; j++) {
                System.out.print("  ");
            }
            Thread.sleep(1000);
            System.out.println();
        }
    }
}
