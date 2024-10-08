package Lab.OOP_Advanced.Days.Ex_4_ShapeInterfaceManagement;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Cicle circle = new Cicle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Areas of the shapes");
        System.out.println("- Circle area: " +
                circle.calculateArea());
        System.out.println("- Rectangle area: " +
                rectangle.calculateArea());
        System.out.println("Polymorphism testing: ");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        for (Shape shape : shapes) {
            System.out.println("- Area: " +
                    shape.calculateArea());
        }
    }
}
