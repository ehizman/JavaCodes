package chapterTen.shape_Hierarchy;

public class Square extends Two_Dimensional_Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }
}
