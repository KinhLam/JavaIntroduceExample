package Lab.OOP.Days.Ex_2_EmployeeManagement;

public class SalesEmployee extends Employee {
    private double salesTarget;

    public SalesEmployee(String name, int id, double salary, double salesTarget) {
        super(name, id, salary);
        this.salesTarget = salesTarget;
    }

    public double getSalesTarget() {
        return salesTarget;
    }

    public void setSalesTarget(double salesTarget) {
        this.salesTarget = salesTarget;
    }

    @Override
    public void assignTask(){
        System.out.println("Assigning sales target task.");
    }

    public void makeSale(){
        System.out.println("Making a sale to meet target: " + salesTarget);
    }
}
