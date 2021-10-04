package OtherProjects;

public class NewPrintFormatting {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i * 10 == 100) {
                System.out.printf("%8d", i * 10);
                continue;
            }
            System.out.printf("%02d - %02d%n", i * 10, i * 10 + 9);
        }
    }
}
