package chapterTen.moveable;

public class Fish extends Animal{
    private Movable fishMovable = new FishMovable();
    private Movable horseMovable = new HorseMovable();

    public Movable getFishMovable() {
        return fishMovable;
    }

    public Movable getHorseMovable() {
        return horseMovable;
    }

    @Override
    void move(Movable type) {
        type.move();
    }
}
