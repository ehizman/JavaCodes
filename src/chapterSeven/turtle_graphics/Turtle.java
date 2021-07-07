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
        if (getTurtleDirection() == EAST){
            changeDirection(NORTH);
        }
        else{
            if (getTurtleDirection() == NORTH){
                changeDirection(WEST);
            }
            else{
                if (getTurtleDirection() == WEST){
                    changeDirection(SOUTH);
                }
                else{
                    if (getTurtleDirection() == SOUTH){
                        changeDirection(EAST);
                    }
                }
            }
        }
    }

    public void turnRight() {
        if (getTurtleDirection() == EAST){
            changeDirection(SOUTH);
        }
        else{
            if (getTurtleDirection() == SOUTH){
                changeDirection(WEST);
            }
            else{
                if (getTurtleDirection() == WEST){
                    changeDirection(NORTH);
                }
                else{
                    if (getTurtleDirection() == NORTH){
                        changeDirection(EAST);
                    }
                }
            }
        }
    }
}
