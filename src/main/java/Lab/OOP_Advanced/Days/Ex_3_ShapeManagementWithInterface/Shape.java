package Lab.OOP_Advanced.Days.Ex_3_ShapeManagementWithInterface;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
