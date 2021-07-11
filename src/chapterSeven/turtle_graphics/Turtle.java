package chapterSeven.turtle_graphics;

import java.util.Arrays;

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
        return position;
    }

    public void move(int numberOfSteps) {
        int[] currentTurtlePosition = getTurtlePosition();
        if (getTurtleDirection() == EAST && currentTurtlePosition[1] + numberOfSteps > 20){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        if (getTurtleDirection() == WEST && currentTurtlePosition[1] - numberOfSteps < 0){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        if (getTurtleDirection() == NORTH && currentTurtlePosition[0] - numberOfSteps < 0){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        if (getTurtleDirection() == SOUTH && currentTurtlePosition[0] + numberOfSteps > 20){
            throw new ArrayIndexOutOfBoundsException("moving turtle out of sketch pad!");
        }
        switch (getTurtleDirection()){
            case EAST -> {
                System.out.println("Now facing East");
                if (getPenPosition() == DOWN){
                    if (currentTurtlePosition[0] != 0){
                        currentTurtlePosition[1] += 1;
                    }
                    for (int i = 0; i < numberOfSteps; i++) {
                        SketchPad.sketchPad[currentTurtlePosition[0]][currentTurtlePosition[1]]=
                                SketchPad.sketchPad[currentTurtlePosition[0]][currentTurtlePosition[1]] + 1;
                        if (i != numberOfSteps - 1){
                            currentTurtlePosition[1] += 1;
                        }
                    }
                }
                else{
                    currentTurtlePosition[1] += numberOfSteps;
                }
            }
            case WEST -> {
                System.out.println("Now facing west");
                if (getPenPosition() == DOWN){
                    for (int i = 0; i < numberOfSteps; i++) {
                        currentTurtlePosition[1] -= 1;
                        SketchPad.sketchPad[currentTurtlePosition[0]][currentTurtlePosition[1]]= 1;
                    }
                }
                else{
                    currentTurtlePosition[1] -= numberOfSteps;
                }
            }

            case SOUTH -> {
                System.out.println("Now facing south");
                {
                    if (getPenPosition() == DOWN){
                        if (currentTurtlePosition[1] != 0){
                            currentTurtlePosition[0] += 1;
                        }
                        for (int i = 0; i < numberOfSteps; i++) {
                            SketchPad.sketchPad[currentTurtlePosition[0]][currentTurtlePosition[1]] = 1;
                            if (i != numberOfSteps - 1){
                                currentTurtlePosition[0] += 1;
                            }
                        }
                    }
                    else{
                        currentTurtlePosition[0] += numberOfSteps;
                    }
                }
            }
            case NORTH -> {
                System.out.println("Now facing North");
                if (getPenPosition() == DOWN){
                    currentTurtlePosition[0] -= 1;
                    for (int i = 0; i < numberOfSteps; i++) {
                        SketchPad.sketchPad[currentTurtlePosition[0]][currentTurtlePosition[1]] = 1;
                        if (i != numberOfSteps - 1){
                            currentTurtlePosition[0] -= 1;
                        }
                    }
                }
                else{
                    currentTurtlePosition[0] -= numberOfSteps;
                }
            }
        }
    }
}
