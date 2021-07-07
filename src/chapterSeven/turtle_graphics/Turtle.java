package chapterSeven.turtle_graphics;

import static chapterSeven.turtle_graphics.Direction.*;
import static chapterSeven.turtle_graphics.Position.DOWN;
import static chapterSeven.turtle_graphics.Position.UP;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private int[] position;

    public Turtle() {
        this.pen = new Pen();
        this.direction = EAST;
        this.position = new int[]{0,0};
    }

    public void setPin(Pen pen) {
        this.pen = pen;
    }

    public Pen getPin() {
        return pen;
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

    private void changeDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getTurtleDirection() {
        return direction;
    }

    public void turnLeft() {
        switch(getTurtleDirection()){
            case EAST -> changeDirection(NORTH);
            case NORTH -> changeDirection(WEST);
            case WEST -> changeDirection(SOUTH);
            case SOUTH -> changeDirection(EAST);
        }
    }

    public void turnRight() {
        switch (getTurtleDirection()){
            case EAST -> changeDirection(SOUTH);
            case SOUTH -> changeDirection(WEST);
            case NORTH -> changeDirection(EAST);
            case WEST -> changeDirection(NORTH);
        }
    }

    public int[] getTurtlePosition() {
        return position;
    }

    public void move(int numberOfSteps) {
        int[] currentTurtlePosition = getTurtlePosition();
        if (currentTurtlePosition[1] + numberOfSteps > 20){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        switch (getTurtleDirection()){
            case EAST -> currentTurtlePosition[1] += numberOfSteps;
            case WEST -> currentTurtlePosition[1] -= numberOfSteps;
            case SOUTH -> currentTurtlePosition[0] += numberOfSteps;
            case NORTH -> currentTurtlePosition[0] -= numberOfSteps;
        }
    }
}
