package chapterTen.moveable;

public class Test{
    public static void main(String[] args) {
        Animal animal = new Bird();
        Fish fish = new Fish();
        Animal horse = new Horse();

        fish.move(fish.getFishMovable());
        fish.move(fish.getHorseMovable());
    }
}