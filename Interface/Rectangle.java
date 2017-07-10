public class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length*breadth;
    }

    public double perimeter() {
        return 2*(length+breadth);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6.5, 7.9);
        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());
    }
}