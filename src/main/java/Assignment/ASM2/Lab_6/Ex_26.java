package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Ex_26 {
    LinkedList<Employee> employeeList = new LinkedList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        employeeList.removeIf(employee -> employee.id == id);
    }

    public Employee findEmployee(int id){
        for(Employee employee : employeeList){
            if(employee.id == id){
                return employee;
            }
        }
        return null;
    }

    public void displayEmployees(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Ex_26 ex = new Ex_26();
        ex.addEmployee(new Employee(1, "Kính", 500));
        ex.addEmployee(new Employee(2, "Lâm", 300));
        ex.displayEmployees();

        System.out.println("Employ with id = 2: " + ex.findEmployee(2));

        ex.removeEmployee(2);
        ex.displayEmployees();
    }
}
