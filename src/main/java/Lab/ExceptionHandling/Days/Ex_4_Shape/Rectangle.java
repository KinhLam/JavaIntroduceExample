package Lab.ExceptionHandling.Days.Ex_4_Shape;

public class Rectangle extends Shape{
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public double circumference() {
        return 2 * (length + width);
    }

    public double diagonal(){
        return Math.sqrt(length * length + width * width);
    }

    public double volume(double height) {
        return length * width * height;
    }
}
