final class Square implements Shape
{
    private final double side;
    public Square(double side)
    {
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}


final class Triangle implements Shape {
    private final double base;
    private final double height;
    public Triangle(double base, double height)
    {
        this.base = base; this.height = height;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}


final class Circle implements Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}


public class SealedInterfaceEx {

    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Square(4);
        Shape s3 = new Triangle(3, 6);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Square area: " + s2.area());
        System.out.println("Triangle area: " + s3.area());
    }

}
