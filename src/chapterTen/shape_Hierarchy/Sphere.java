package chapterTen.shape_Hierarchy;

public class Sphere extends Three_Dimensional_Shape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (4 * Math.PI * Math.pow(radius,2));
    }

    @Override
    public double volume() {
        return ((4.0/3) * Math.PI * Math.pow(radius,3));
    }
}
