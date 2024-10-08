package Lab.OOP_Advanced.Days.Ex_1_ShapeManagement;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
