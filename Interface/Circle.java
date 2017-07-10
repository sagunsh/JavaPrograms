public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14*radius*radius;
    }

    public double perimeter() {
        return 2*3.14*radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("Area = " + circle.area());
        System.out.println("Perimeter = " + circle.perimeter());
    }
}
