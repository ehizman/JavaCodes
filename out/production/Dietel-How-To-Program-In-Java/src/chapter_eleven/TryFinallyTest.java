package chapter_eleven;

public class TryFinallyTest {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println("I am in the try block");
            System.out.println(name.length());
        }
        catch (NullPointerException nullPointerException){
            System.out.println("I am in the catch block");
        }
        finally {
            System.out.println("I am in the finally block");
        }
        try{
            System.out.println("I am in the next outer try block");
            makeSureProgramContinues();
        }
        catch (NullPointerException nullPointerException){
            System.out.println("I am trying to catch the exception that occurred in the previous block in this catch " +
                    "block");
        }
    }

    private static void makeSureProgramContinues() {
        System.out.println("My job is to make sure that the program continues");
    }
}
