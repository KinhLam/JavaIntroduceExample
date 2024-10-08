package Lab.OOP_Advanced.Days.Ex_3_ShapeManagementWithInterface;

public class ShapeTest {
    public static void main(String[] args) {
        Cicle cicle = new Cicle("Circle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle",5.0, 5.0);

        System.out.println("- Area: " + cicle.calculateArea());
        System.out.println("- Perimeter: " + cicle.calculatePerimeter());
        System.out.println(rectangle.getName());
        System.out.println("- Area: " + rectangle.calculateArea());
        System.out.println("- Perimeter: " + rectangle.calculatePerimeter());
    }
}
