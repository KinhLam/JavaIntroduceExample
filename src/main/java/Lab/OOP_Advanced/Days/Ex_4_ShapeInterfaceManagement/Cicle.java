package Lab.OOP_Advanced.Days.Ex_4_ShapeInterfaceManagement;

public class Cicle implements Shape {
    double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public Cicle(double radius) {
        this.radius = radius;
    }
}
