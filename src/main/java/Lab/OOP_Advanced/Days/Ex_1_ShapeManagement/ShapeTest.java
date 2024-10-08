package Lab.OOP_Advanced.Days.Ex_1_ShapeManagement;

public class ShapeTest {
    public static void main(String[] args) {
        Cicle cicle = new Cicle("Cicle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        System.out.println(cicle.getName());
        System.out.println("- Area: " + cicle.calculateArea());
        System.out.println("- Perimeter: " + cicle.calculatePerimeter());

        System.out.println(rectangle.getName());
        System.out.println("- Area: " + rectangle.calculateArea());
        System.out.println("- Perimeter: " + rectangle.calculatePerimeter());
    }
}
