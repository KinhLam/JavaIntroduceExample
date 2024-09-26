package Lab.OOP.Days.Ex_2_EmployeeManagement;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create instances of each employee type
        SalesEmployee salesEmployee = new SalesEmployee("Alice", 101, 3000.0, 50000.0);
        ITEmployee itEmployee = new ITEmployee("Bob", 102, 3500.0, "Senior");
        HREmployee hrEmployee = new HREmployee("Charlie", 103, 2800.0, 5);
        MaketingEmployee marketingEmployee = new MaketingEmployee("David", 104, 3200.0, "Junior");

        // Test the methods
        salesEmployee.assignTask();
        salesEmployee.makeSale();

        itEmployee.assignTask();
        itEmployee.debugCode();

        hrEmployee.assignTask();
        hrEmployee.conductInterview();

        marketingEmployee.assignTask();
        marketingEmployee.createCampaign();
    }
}
