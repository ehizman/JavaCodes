package chapterSeven.turtle_graphics;
import org.junit.jupiter.api.Test;

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
    void testThatTurtleHasPen(){
        Turtle turtle = new Turtle();
        assertNotNull(turtle.getPin());
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
    void testThatTurtleCanWrite(){
        Turtle turtle = new Turtle();
        turtle.penDown();
        turtle.move(10);
        turtle.penUp();
        assertArrayEquals(new int[]{1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
                SketchPad.sketchPad[0]);
        turtle.turnRight();
        turtle.penDown();
        turtle.move(10);
        turtle.penUp();
        assertAll(
                ()-> assertEquals(1, SketchPad.sketchPad[0][10]),
                ()->assertEquals(1, SketchPad.sketchPad[1][10]),
                ()->assertEquals(1, SketchPad.sketchPad[1][10]),
                ()->assertEquals(1, SketchPad.sketchPad[1][10]),
                ()->assertEquals(1, SketchPad.sketchPad[2][10]),
                ()->assertEquals(1, SketchPad.sketchPad[3][10]),
                ()->assertEquals(1, SketchPad.sketchPad[4][10]),
                ()->assertEquals(1, SketchPad.sketchPad[5][10]),
                ()->assertEquals(1, SketchPad.sketchPad[6][10]),
                ()->assertEquals(1, SketchPad.sketchPad[6][10]),
                ()->assertEquals(1, SketchPad.sketchPad[7][10]),
                ()->assertEquals(1, SketchPad.sketchPad[8][10]),
                ()->assertEquals(1, SketchPad.sketchPad[9][10])
        );
        SketchPad.displaySketchPad();
        turtle.turnLeft();
        turtle.move(5);
        assertAll(
                ()-> assertEquals(1, SketchPad.sketchPad[11][10]),
                ()->assertEquals(1, SketchPad.sketchPad[1][10]),
                ()->assertEquals(1, SketchPad.sketchPad[1][10]),
                ()->assertEquals(1, SketchPad.sketchPad[1][10]),
                ()->assertEquals(1, SketchPad.sketchPad[2][10]),
                ()->assertEquals(1, SketchPad.sketchPad[3][10]),
                ()->assertEquals(1, SketchPad.sketchPad[4][10]),
                ()->assertEquals(1, SketchPad.sketchPad[5][10]),
                ()->assertEquals(1, SketchPad.sketchPad[6][10]),
                ()->assertEquals(1, SketchPad.sketchPad[6][10]),
                ()->assertEquals(1, SketchPad.sketchPad[7][10]),
                ()->assertEquals(1, SketchPad.sketchPad[8][10]),
                ()->assertEquals(1, SketchPad.sketchPad[9][10])
        );
    }
}