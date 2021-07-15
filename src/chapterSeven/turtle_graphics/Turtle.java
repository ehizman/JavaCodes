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
            case EAST -> changeDirectionTo(SOUTH);
            case SOUTH -> changeDirectionTo(WEST);
            case NORTH -> changeDirectionTo(EAST);
            case WEST -> changeDirectionTo(NORTH);
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
                System.out.println("Now facing East");
                if (getPenPosition().equals(DOWN)){
                    for (int i = 0; i < numberOfSteps; i++) {
                        sketchPad.writeOn(rowPosition, columnPosition);
                        columnPosition += 1;
                    }
                }
                currentTurtlePosition[1] += numberOfSteps - 1;
            }
            case WEST -> {
                System.out.println("Now facing west");
                if (getPenPosition() == DOWN){
                    for (int i = 0; i < numberOfSteps; i++) {
                        sketchPad.writeOn(rowPosition, columnPosition);
                        columnPosition -= 1;
                    }
                }
                currentTurtlePosition[1] -= numberOfSteps - 1;
            }

            case SOUTH -> {
                System.out.println("Now facing south");
                if (getPenPosition().equals(DOWN)){
                    for (int i = 0; i < numberOfSteps; i++) {
                        sketchPad.writeOn(rowPosition, columnPosition);
                        rowPosition += 1;
                    }
                }
                currentTurtlePosition[0] += numberOfSteps - 1;
            }
            case NORTH -> {
                System.out.println("Now facing North");
                if (getPenPosition() == DOWN){
                    for (int i = 0; i < numberOfSteps; i++) {
                        sketchPad.writeOn(rowPosition, columnPosition);
                        rowPosition -= 1;
                    }
                }
                currentTurtlePosition[0] -= numberOfSteps - 1;
            }
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
