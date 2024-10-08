package Assignment.ASM2.Lab_7.Part_2;


import java.util.HashSet;
import java.util.TreeSet;

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
    public int compareTo(Employee_Ex2 other) {
        return Integer.compare(this.id, other.id);
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
        HashSet<Employee_Ex2> set = new HashSet<>();
        set.add(new Employee_Ex2(1, "Kinh", "IT"));
        set.add(new Employee_Ex2(2, "Lam", "Marketing"));
        set.add(new Employee_Ex2(3, "Duc", "Sales"));

        TreeSet<Employee_Ex2> treeSet = new TreeSet<>(set);
        treeSet.forEach(System.out::println);
    }
}
