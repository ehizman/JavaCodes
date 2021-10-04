package chapterTen.moveable;

public class Bird extends Animal{
    private Movable birdMovable = new BirdMovable();

    @Override
    void move(Movable type) {
        type.move();
    }
}
