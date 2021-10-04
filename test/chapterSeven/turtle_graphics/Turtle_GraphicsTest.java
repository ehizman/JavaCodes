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
        SketchPad sketchPad = new SketchPad();
        turtle.move(10, sketchPad);
        assertArrayEquals(new int[]{0,9}, turtle.getTurtlePosition());
    }

    @Test
    void testThatTurtleCanMoveANumberOfStepsInSouthDirection(){
        SketchPad sketchPad = new SketchPad();
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.move(10, sketchPad);
        assertArrayEquals(new int[]{9,0}, turtle.getTurtlePosition());
    }

    @Test
    void testThatTurtleCanMoveANumberOfStepsInSouthDirectionTwice(){
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad();
        turtle.turnRight();
        turtle.move(10, sketchPad);
        assertArrayEquals(new int[]{9,0}, turtle.getTurtlePosition());
        turtle.move(5, sketchPad);
        assertArrayEquals(new int[]{13,0}, turtle.getTurtlePosition());
    }

    @Test
    void testThatTurtleCannotMoveOutOfSketchPad(){
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad();
        turtle.move(10, sketchPad);
        assertArrayEquals(new int[]{0,9}, turtle.getTurtlePosition());
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> turtle.move(13, sketchPad));
    }

    @Test
    void testThatTurtleCanWrite_WhenAtInitialWhenFacingEast(){
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad();
        turtle.penDown();
        turtle.move(10, sketchPad);
        turtle.penUp();
        assertArrayEquals(new int[]{1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                sketchPad.floor[0]);
    }

    @Test
    void testThatTurtleCanWriteWhenFacingSouth(){
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10, sketchPad);
        turtle.penUp();
        assertAll(
                ()-> assertEquals(1, sketchPad.floor[0][0]),
                ()->assertEquals(1, sketchPad.floor[1][0]),
                ()->assertEquals(1, sketchPad.floor[2][0]),
                ()->assertEquals(1, sketchPad.floor[3][0]),
                ()->assertEquals(1, sketchPad.floor[4][0]),
                ()->assertEquals(1, sketchPad.floor[5][0]),
                ()->assertEquals(1, sketchPad.floor[6][0]),
                ()->assertEquals(1, sketchPad.floor[7][0]),
                ()->assertEquals(1, sketchPad.floor[8][0]),
                ()->assertEquals(1, sketchPad.floor[9][0])
        );
    }

    @Test
    void testThatTurtleCanWriteWhenFacingNorth(){
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10, sketchPad);
        turtle.penUp();
        System.out.println(Arrays.toString(turtle.getTurtlePosition()));
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5, sketchPad);
        turtle.penUp();
        System.out.println(Arrays.toString(turtle.getTurtlePosition()));
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5, sketchPad);
        turtle.penUp();
        assertAll(
                () -> assertEquals(1, sketchPad.floor[9][4]),
                () -> assertEquals(1, sketchPad.floor[8][4]),
                () -> assertEquals(1, sketchPad.floor[7][4]),
                () -> assertEquals(1, sketchPad.floor[6][4]),
                () -> assertEquals(1, sketchPad.floor[5][4]),
                () -> assertEquals(0, sketchPad.floor[4][4])
        );
    }

    @Test
    void testThatTurtleCanWriteWhenFacingWest(){
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad();
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10, sketchPad);
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5, sketchPad);
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(10, sketchPad);
        turtle.penUp();
        turtle.turnLeft();
        turtle.penDown();
        turtle.move(5, sketchPad);
        turtle.penUp();
        sketchPad.displaySketchPad();
        assertAll(
                ()-> assertEquals(1, sketchPad.floor[0][4]),
                ()-> assertEquals(1, sketchPad.floor[0][3]),
                ()-> assertEquals(1, sketchPad.floor[0][2]),
                ()-> assertEquals(1, sketchPad.floor[0][1]),
                ()-> assertEquals(1, sketchPad.floor[0][0])
        );
    }
}