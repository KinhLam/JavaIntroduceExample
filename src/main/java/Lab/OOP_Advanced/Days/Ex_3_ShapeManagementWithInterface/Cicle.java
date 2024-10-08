package Lab.OOP_Advanced.Days.Ex_3_ShapeManagementWithInterface;

public class Cicle extends Shape implements Printable{
    double radius;

    public Cicle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public Cicle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void print() {
        System.out.println("- Printing the cicle");
    }
}