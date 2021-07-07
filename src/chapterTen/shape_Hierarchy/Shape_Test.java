package chapterTen.shape_Hierarchy;

public class Shape_Test {
    private static Shape Two_Dimensional_Shape;
    private static Shape Three_Dimensional_Shape;

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square(8.0);
        shapes[2] = new Triangle(8.0, 7.0);
        shapes[3] = new Cube(5.0);
        shapes[4] = new Sphere(7.0);
        shapes[5] = new Tetrahedron(8.0);

        for (Shape shape: shapes) {
            System.out.printf("Area of %s: %.2f%n", shape.getClass().getSimpleName(), shape.area());
            if (shape instanceof Three_Dimensional_Shape){
            System.out.printf("Volume of %s: %.2f%n", shape.getClass().getSimpleName(),
                        ((Three_Dimensional_Shape) shape).volume());
            }
        }
    }
}

