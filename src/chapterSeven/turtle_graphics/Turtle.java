package chapterSeven.turtle_graphics;
import static chapterSeven.turtle_graphics.Direction.*;
import static chapterSeven.turtle_graphics.Position.DOWN;
import static chapterSeven.turtle_graphics.Position.UP;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private int[] currentTurtlePosition;

    public Turtle() {
        this.pen = new Pen();
        this.direction = EAST;
        this.currentTurtlePosition = new int[]{0,0};
    }


    public Position getPenPosition() {
        return pen.getPosition();
    }

    public void penDown() {
        pen.setPosition(DOWN);
    }

    public void penUp() {
        pen.setPosition(UP);
    }

    private void changeDirectionTo(Direction direction) {
        this.direction = direction;
    }

    public Direction getTurtleDirection() {
        return direction;
    }

    public void turnLeft() {
        switch(getTurtleDirection()){
            case EAST -> changeDirectionTo(NORTH);
            case NORTH -> changeDirectionTo(WEST);
            case WEST -> changeDirectionTo(SOUTH);
            case SOUTH -> changeDirectionTo(EAST);
        }
    }

    public void turnRight() {
        switch (getTurtleDirection()){
            case EAST -> {
                changeDirectionTo(SOUTH);
                System.out.println("Now facing south");
            }
            case SOUTH -> {
                changeDirectionTo(WEST);
                System.out.println("Now facing west");
            }
            case NORTH -> {
                changeDirectionTo(EAST);
                System.out.println("Now facing East");
            }
            case WEST -> {
                changeDirectionTo(NORTH);
                System.out.println("Now facing North");
            }
        }
    }

    public int[] getTurtlePosition() {
        return currentTurtlePosition;
    }

    public void move(int numberOfSteps, SketchPad sketchPad) {
        int[] currentTurtlePosition = getTurtlePosition();
        int width = sketchPad.floor.length;
        int rowPosition = currentTurtlePosition[0];
        int columnPosition = currentTurtlePosition[1];
        validateIfTurtleIsAttemptingToMoveOutOfSketchPad(numberOfSteps, currentTurtlePosition, width);
        switch (direction){
            case EAST -> {
                if (getPenPosition().equals(DOWN)){
                    moveEast(numberOfSteps, sketchPad, rowPosition, columnPosition);
                }
                currentTurtlePosition[1] += numberOfSteps - 1;
            }
            case WEST -> {
                if (getPenPosition() == DOWN){
                    moveWest(numberOfSteps, sketchPad, rowPosition, columnPosition);
                }
                currentTurtlePosition[1] -= numberOfSteps - 1;
            }

            case SOUTH -> {
                if (getPenPosition().equals(DOWN)){
                    moveSouth(numberOfSteps, sketchPad, rowPosition, columnPosition);
                }
                currentTurtlePosition[0] += numberOfSteps - 1;
            }
            case NORTH -> {
                if (getPenPosition() == DOWN){
                    moveNorth(numberOfSteps, sketchPad, rowPosition, columnPosition);
                }
                currentTurtlePosition[0] -= numberOfSteps - 1;
            }
        }

    }

    private void moveEast(int numberOfSteps, SketchPad sketchPad, int rowPosition, int columnPosition) {
        for (int i = 0; i < numberOfSteps; i++) {
            sketchPad.writeOn(rowPosition, columnPosition);
            columnPosition += 1;
        }
    }

    private void moveWest(int numberOfSteps, SketchPad sketchPad, int rowPosition, int columnPosition) {
        for (int i = 0; i < numberOfSteps; i++) {
            sketchPad.writeOn(rowPosition, columnPosition);
            columnPosition -= 1;
        }
    }

    private void moveSouth(int numberOfSteps, SketchPad sketchPad, int rowPosition, int columnPosition) {
        for (int i = 0; i < numberOfSteps; i++) {
            sketchPad.writeOn(rowPosition, columnPosition);
            rowPosition += 1;
        }
    }

    private void moveNorth(int numberOfSteps, SketchPad sketchPad, int rowPosition, int columnPosition) {
        for (int i = 0; i < numberOfSteps; i++) {
            sketchPad.writeOn(rowPosition, columnPosition);
            rowPosition -= 1;
        }
    }

    private void validateIfTurtleIsAttemptingToMoveOutOfSketchPad(int numberOfSteps, int[] currentTurtlePosition, int width) {
        if (direction == EAST && currentTurtlePosition[1] + (numberOfSteps - 1) > width){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        if (direction == WEST && currentTurtlePosition[1] - (numberOfSteps - 1) < 0){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        if (direction == NORTH && currentTurtlePosition[0] - (numberOfSteps-1) < 0){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        if (direction == SOUTH && currentTurtlePosition[0] + (numberOfSteps-1) > width){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
    }
}
