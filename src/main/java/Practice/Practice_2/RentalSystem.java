package Practice.Practice_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RentalSystem {
    public void rentCar(Customer customer, Car car, Date startDate, Date endDate, CarInventory carInventory) {
        if (carInventory.checkAvailability(car)) {
            carInventory.removeCar(car);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String formattedStartDate = sdf.format(startDate);
            String formattedEndDate = sdf.format(endDate);
            System.out.println("Đã thuê xe thành công từ " + formattedStartDate + " đến " + formattedEndDate);
            System.out.println("Khách hàng: " + customer.getName());
            System.out.println("Xe: " + car.getModel());
        } else {
            System.out.println("Xe không có sẵn.");
        }
    }

    public void returnCar(RentalContract rentalContract) {
        double totalCost = calculateCost(rentalContract);
        CarInventory carInventory = new CarInventory();
        carInventory.addCar(rentalContract.getCar());
        System.out.println("Trả xe thành công. Tổng chi phí: " + totalCost);
    }

    private double calculateCost(RentalContract rentalContract) {
        long durationInMilis = rentalContract.getEndDate().getTime() - rentalContract.getStartDate().getTime();
        long durationDays = durationInMilis / (24 * 60 * 60 * 1000);
        return durationDays * rentalContract.getCar().getPricePerDay();
    }


}