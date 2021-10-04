package chapterTen.shape_Hierarchy;

public class Circle extends Two_Dimensional_Shape{
    private double radius;

    public Circle(double radius) {
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
        return (Math.PI * Math.pow(radius, 2));
    }
}
