package Lab.OOP_Advanced.Days.Ex_4_ShapeInterfaceManagement;

public class Rectangle implements Shape {
    double length;
    double width;

    @Override
    public double calculateArea() {
        return length * width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
