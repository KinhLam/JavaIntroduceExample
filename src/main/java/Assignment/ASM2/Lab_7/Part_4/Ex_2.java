package Assignment.ASM2.Lab_7.Part_4;

import java.util.HashMap;
import java.util.Objects;

class Employee_Ex2{
    int id;
    String name;
    String department;

    public Employee_Ex2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_Ex2 that = (Employee_Ex2) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
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
        HashMap<Integer, Employee_Ex2> employ = new HashMap<>();
        employ.put(1, new Employee_Ex2(1, "Kinh", "IT"));
        employ.put(2, new Employee_Ex2(2, "Duc", "HR"));
        employ.put(3, new Employee_Ex2(3, "Lam", "Sales"));

        Employee_Ex2 em = employ.get(1);
        System.out.println(em);
    }
}
