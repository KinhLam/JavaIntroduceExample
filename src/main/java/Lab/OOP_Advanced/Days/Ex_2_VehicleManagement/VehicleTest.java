package Lab.OOP_Advanced.Days.Ex_2_VehicleManagement;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println("1. Car");
        car.start();
        car.stop();
        car.drive();
        System.out.println("2. Motorcycle");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.drive();
    }
}
