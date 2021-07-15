package chapterSeven.turtle_graphics;

import java.util.Scanner;

public class TurtleApplication {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        run(turtle);
    }

    private static void run(Turtle turtle) {
        displayPrompt("Welcome to Turtle Graphics Application");
        String commandPrompt = """
                Press 1 to set turtle's pen up
                Press 2 to set turtle's pen down
                Press 3 to turn turtle right
                Press 4 to turn turtle left
                Press 5 to move turtle forward
                Press 6 to display sketch pad
                Press 7 to exit application""";
        displayPrompt(commandPrompt);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        SketchPad sketchPad = new SketchPad();
        switch(userInput){
            case 1 -> {
                turtle.penUp();
                displayPrompt("Turtle pen has been set up successfully");
                run(turtle);
            }
            case 2 -> {
                turtle.penDown();
                displayPrompt("Turtle pen has been set down successfully");
                run(turtle);
            }
            case 3 -> {
                turtle.turnRight();
                run(turtle);
            }
            case 4 -> {
                    turtle.turnLeft();
                    run(turtle);
                }
                case 5 -> {
                    displayPrompt("Enter the number of moves");
                    int numberOfMoves = scanner.nextInt();
                    turtle.move(numberOfMoves,sketchPad);
                    run(turtle);
                }
                case 6 -> {
                    sketchPad.displaySketchPad();
                    run(turtle);
                }
                case 7 -> {
                    displayPrompt("Exiting application!");
                    System.exit(0);
                }

                default -> displayPrompt("Invalid input!");
            }
        }

    private static void displayPrompt(String prompt) {
        System.out.println(prompt);
    }
}
