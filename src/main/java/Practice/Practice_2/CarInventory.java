package Practice.Practice_2;

import java.util.ArrayList;
import java.util.List;

public class CarInventory {
    List<Car> cars;

    public CarInventory() {
        cars = new ArrayList<Car>();
    }

    public CarInventory(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public boolean checkAvailability(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
