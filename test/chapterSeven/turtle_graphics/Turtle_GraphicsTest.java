package chapterSeven.turtle_graphics;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static chapterSeven.turtle_graphics.Direction.*;
import static chapterSeven.turtle_graphics.Position.DOWN;
import static chapterSeven.turtle_graphics.Position.UP;
import static org.junit.jupiter.api.Assertions.*;

class Turtle_GraphicsTest {
    @Test
    void testCreation(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }

    @Test
    void testThatTurtleDefaultPositionIsUp(){
        Turtle turtle = new Turtle();
        assertSame(UP, turtle.getPenPosition());
    }

    @Test
    void testThatPenCanTurnDown(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        assertSame(DOWN, turtle.getPenPosition());
    }

    @Test
    void testCanTurnPenUp(){
        Turtle turtle = new Turtle();
        turtle.penUp();
        assertSame(UP, turtle.getPenPosition());
    }

    @Test
    void testTurtleFacesEastDirectionUponCreation(){
        Turtle turtle = new Turtle();
        assertSame(EAST, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnLeftWhenFacingEast(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertSame(NORTH, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnLeftWhenFacingNORTH(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnLeftWhenFacingWest(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnLeftWhenFacingSouth(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(EAST, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnRightWhenFacingEast(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertSame(SOUTH, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnRightWhenFacingSouth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnRightWhenFacingWest(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getTurtleDirection());
    }

    @Test
    void testThatTurtleCanTurnRightWhenFacingNorth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(EAST, turtle.getTurtleDirection());
    }

    @Test
    void turtleIsOnPosition0_0UponCreation(){
        Turtle turtle = new Turtle();
        assertArrayEquals(new int[]{0,0},turtle.getTurtlePosition());
    }

    @Test
    void testThatTurtleCanMoveANumberOfStepsInEastDirection(){
        Turtle turtle = new Turtle();
        turtle.move(10);
        assertArrayEquals(new int[]{0,10}, turtle.getTurtlePosition());
    }

    @Test
    void testThatTurtleCanMoveANumberOfStepsInSouthDirection(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.move(10);
        assertArrayEquals(new int[]{10,0}, turtle.getTurtlePosition());
    }

    @Test
    void testThatTurtleCanMoveANumberOfStepsInSouthDirectionTwice(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.move(10);
        assertArrayEquals(new int[]{10,0}, turtle.getTurtlePosition());
        turtle.move(5);
        assertArrayEquals(new int[]{15,0}, turtle.getTurtlePosition());
    }

    @Test
    void testThatTurtleCannotMoveOutOfSketchPad(){
        Turtle turtle = new Turtle();
        turtle.move(10);
        assertArrayEquals(new int[]{0,10}, turtle.getTurtlePosition());
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> turtle.move(11));
    }

    @Test
    void testThatTurtleCanWrite_WhenAtInitialWhenFacingEast(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        turtle.move(10);
        turtle.penUp();
        assertArrayEquals(new int[]{1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                SketchPad.sketchPad[0]);
    }

    @Test
    void testThatTurtleCanWriteWhenFacingSouth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10);
        turtle.penUp();
        assertAll(
                ()-> assertEquals(1, SketchPad.sketchPad[0][0]),
                ()->assertEquals(1, SketchPad.sketchPad[1][0]),
                ()->assertEquals(1, SketchPad.sketchPad[2][0]),
                ()->assertEquals(1, SketchPad.sketchPad[3][0]),
                ()->assertEquals(1, SketchPad.sketchPad[4][0]),
                ()->assertEquals(1, SketchPad.sketchPad[5][0]),
                ()->assertEquals(1, SketchPad.sketchPad[6][0]),
                ()->assertEquals(1, SketchPad.sketchPad[7][0]),
                ()->assertEquals(1, SketchPad.sketchPad[8][0]),
                ()->assertEquals(1, SketchPad.sketchPad[9][0])
        );
    }

    @Test
    void testThatTurtleCanWriteWhenFacingNorth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10);
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5);
        System.out.println(Arrays.toString(turtle.getTurtlePosition()));
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5);
        turtle.penUp();
        assertAll(
                () -> assertEquals(1, SketchPad.sketchPad[9][5]),
                () -> assertEquals(1, SketchPad.sketchPad[8][5]),
                () -> assertEquals(1, SketchPad.sketchPad[7][5]),
                () -> assertEquals(1, SketchPad.sketchPad[6][5]),
                () -> assertEquals(1, SketchPad.sketchPad[5][5]),
                () -> assertEquals(1, SketchPad.sketchPad[4][5])
        );
    }

    @Test
    void testThatTurtleCanWriteWhenFacingWest(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10);
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5);
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(9);
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5);
        turtle.penDown();
        SketchPad.displaySketchPad();
        assertAll(
                ()-> assertEquals(1, SketchPad.sketchPad[0][5]),
                ()-> assertEquals(1, SketchPad.sketchPad[0][4]),
                ()-> assertEquals(1, SketchPad.sketchPad[0][3]),
                ()-> assertEquals(1, SketchPad.sketchPad[0][2]),
                ()-> assertEquals(1, SketchPad.sketchPad[0][1]),
                ()-> assertEquals(1, SketchPad.sketchPad[0][0])
        );
    }
}