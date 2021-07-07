package chapterSeven.turtle_graphics;

import static chapterSeven.turtle_graphics.Direction.*;
import static chapterSeven.turtle_graphics.Position.DOWN;
import static chapterSeven.turtle_graphics.Position.UP;

public class Turtle {
    private Pen pen;
    private Direction direction;

    public Turtle() {
        this.pen = new Pen();
        this.direction = EAST;
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
}
