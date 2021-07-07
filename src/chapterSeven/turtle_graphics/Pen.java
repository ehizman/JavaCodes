package chapterSeven.turtle_graphics;


public class Pen {
    private Position position;

    public Pen() {
        this.position = Position.UP;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
