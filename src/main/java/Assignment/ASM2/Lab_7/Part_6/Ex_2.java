package Assignment.ASM2.Lab_7.Part_6;

import java.util.TreeMap;

class Employee_Ex2 implements Comparable<Employee_Ex2> {
    int id;
    String name;
    String department;

    public Employee_Ex2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public int compareTo(Employee_Ex2 o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Employee_Ex2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
public class Ex_2 {
    public static void main(String[] args) {
        TreeMap<Integer, Employee_Ex2> employMap = new TreeMap<>();
        employMap.put(1, new Employee_Ex2(1, "Kinh", "HR"));
        employMap.put(2, new Employee_Ex2(2, "Lam", "IT"));
        employMap.put(3, new Employee_Ex2(3, "Duc", "Sales"));

        Employee_Ex2 em = employMap.get(1);
        System.out.println(em);
    }
}
