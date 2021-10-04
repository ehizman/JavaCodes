package ChapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%10s\t%10s\t%10s\t%10s\t", "N", "10^N", "100^N", "1000^N");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.printf("%10d\t", (int)(i * Math.pow(10, j)));
            }
            System.out.println();
        }
    }
}
