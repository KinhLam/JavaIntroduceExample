package Lab.OOP_Advanced.Days.Ex_2_VehicleManagement;

public class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts");
    }

    public void stop(){
        System.out.println("Car stops");
    }

    public void drive(){
        System.out.println("Car driving");
    }
}
