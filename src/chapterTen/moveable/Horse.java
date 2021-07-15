package chapterTen.moveable;

public class Horse extends Animal {
    private Movable horseMovable = new HorseMovable();
    private Movable fishMovable = new FishMovable();
    @Override
    void move(Movable type) {
        type.move();
    }
}
