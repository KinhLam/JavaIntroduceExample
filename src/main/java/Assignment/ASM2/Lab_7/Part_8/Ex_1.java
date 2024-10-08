package Assignment.ASM2.Lab_7.Part_8;

import java.util.TreeSet;

class Employee_Ex1 implements Comparable<Employee_Ex1>{
    int id;
    String name;
    double salary;

    public Employee_Ex1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee_Ex1 o) {
        return Double.compare(this.salary, o.salary);
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
public class Ex_1 {
    public static void main(String[] args) {
        TreeSet<Employee_Ex1> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee_Ex1(1, "John Doe", 100.0));
        employeeSet.add(new Employee_Ex1(2, "Jane Doe", 500.0));
        employeeSet.add(new Employee_Ex1(3, "Jack Doe", 300.0));

        System.out.println("Employee sorted: ");
        for(Employee_Ex1 e : employeeSet) {
            System.out.println(e);
        }
    }
}
