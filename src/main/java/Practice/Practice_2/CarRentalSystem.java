package Practice.Practice_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarInventory carInventory = new CarInventory();
        CustomerList customerList = new CustomerList();
        RentalSystem rentalSystem = new RentalSystem();
        PaymentGateway paymentGateway = new PaymentGateway();

        carInventory.addCar(new Car("BMW", "I8", 2024, 5000));
        carInventory.addCar(new Car("Audi", "R7", 2023, 5500));
        carInventory.addCar(new Car("Honda", "Civic", 2022, 500));

        customerList.addCustomer(new Customer("Lam Duc Kinh", "lamduckinh2k2@gmail.com", "0372318412"));
        customerList.addCustomer(new Customer("Nguyen Van A", "adu@gmail.com", "0371318412"));
        customerList.addCustomer(new Customer("Pham Van B", "daika@gmail.com", "0377318412"));

        System.out.println("Nhập email khách hàng muốn thuê: ");
        String email = sc.nextLine();
        Customer cus = customerList.getCustomerByEmail(email);

        if (cus != null) {
            System.out.println("Danh sách xe khả dụng:");
            for (Car car : carInventory.getCars()) {
                System.out.println(car);
            }

            System.out.println("Chọn xe (nhập tên xe): ");
            String selectedCar = sc.nextLine();
            Car selectCar = null;

            for (Car car : carInventory.getCars()) {
                if (car.getModel().equalsIgnoreCase(selectedCar)) {
                    selectCar = car;
                    break;
                }
            }

            if (selectCar != null) {
                try {
                    System.out.println("Nhập ngày bắt đầu thuê (dd/MM/yyyy): ");
                    String startDateInput = sc.nextLine();
                    System.out.println("Nhập ngày kết thúc (dd/MM/yyyy): ");
                    String endDateInput = sc.nextLine();

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date startDate = sdf.parse(startDateInput);
                    Date endDate = sdf.parse(endDateInput);

                    rentalSystem.rentCar(cus, selectCar, startDate, endDate, carInventory);

                } catch (Exception e) {
                    System.out.println("Định dạng ngày không hợp lệ.");
                }
            } else {
                System.out.println("Xe không khả dụng.");
            }
        } else {
            System.out.println("Khách hàng không tồn tại.");
        }

        sc.close();
    }
}
