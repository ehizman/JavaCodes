package chapterTwo;

public class SquaresAndCubes {
    public static void main(String[] args) {

        int counter = 0;
        System.out.println("number\t\tsquare\t\t\t\tcube\t");

        do{
            System.out.println(" " + counter +"\t\t\t\t\t\t" +  (int)Math.pow(counter, 2) + "\t\t\t\t\t\t" + (int)Math.pow(counter, 3));
            counter++;
        } while (counter < 11);
    }
}
