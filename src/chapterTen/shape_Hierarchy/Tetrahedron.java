package chapterTen.shape_Hierarchy;

public class Tetrahedron extends Three_Dimensional_Shape{
    private double length;

    public Tetrahedron(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double volume() {
        return ((1.0/12) * Math.sqrt(2) * Math.pow(length, 3));
    }

    @Override
    public double area() {
        return (Math.sqrt(3) * Math.pow(length,2));
    }
}
