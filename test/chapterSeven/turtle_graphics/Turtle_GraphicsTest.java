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
}