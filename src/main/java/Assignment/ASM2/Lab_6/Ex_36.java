package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Employee_Ex36 {
    String name;
    String position;

    public Employee_Ex36(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Position: " + position;
    }
}

public class Ex_36 {
    String name;
    LinkedList<Employee_Ex36> employeeList = new LinkedList<>();

    public Ex_36(String name) {
        this.name = name;
    }

    public void addEmployee(Employee_Ex36 employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(String name) {
        employeeList.removeIf(employee -> employee.name.equalsIgnoreCase(name));
    }

    public void displayEmployees() {
        System.out.println("Employees in " + name + ":");
        for (Employee_Ex36 employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Ex_36 company = new Ex_36("Tech Innovations");
        company.addEmployee(new Employee_Ex36("Alice", "Developer"));
        company.addEmployee(new Employee_Ex36("Bob", "Designer"));

        company.displayEmployees();

        company.removeEmployee("Alice");
        System.out.println("After removing Alice:");
        company.displayEmployees();
    }
}
