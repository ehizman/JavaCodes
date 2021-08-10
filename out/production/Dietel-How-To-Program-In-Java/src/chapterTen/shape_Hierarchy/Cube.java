package chapterTen.shape_Hierarchy;

public class Cube extends Three_Dimensional_Shape{

    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double volume() {
        return Math.pow(length,3);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return (6 * Math.pow(length,2));
    }
}
