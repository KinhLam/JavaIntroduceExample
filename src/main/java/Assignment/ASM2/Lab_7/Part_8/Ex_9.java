package Assignment.ASM2.Lab_7.Part_8;

import java.time.LocalDate;
import java.util.TreeSet;

class Employee_Ex9 implements Comparable<Employee_Ex9> {
    int id;
    String name;
    LocalDate hireDate;

    public Employee_Ex9(int id, String name, LocalDate hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }

    @Override
    public int compareTo(Employee_Ex9 o) {
        return this.hireDate.compareTo(o.hireDate);
    }

    @Override
    public String toString() {
        return "Employee_Ex9{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
public class Ex_9 {
    public static void main(String[] args) {
        TreeSet<Employee_Ex9> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee_Ex9(1, "Kinh", LocalDate.of(2002, 10, 10)));
        employeeSet.add(new Employee_Ex9(2, "Lam", LocalDate.of(2001, 9, 1)));
        employeeSet.add(new Employee_Ex9(3, "Duc", LocalDate.of(1999, 1, 1)));

        System.out.println("Sorted by hire date: ");
        for(Employee_Ex9 e: employeeSet) {
            System.out.println(e);
        }
    }
}
