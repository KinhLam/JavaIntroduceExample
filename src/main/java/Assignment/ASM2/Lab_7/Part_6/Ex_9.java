package Assignment.ASM2.Lab_7.Part_6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

class Employ_Ex9 implements Comparable<Employ_Ex9> {
    int id;
    String name;
    String department;

    public Employ_Ex9(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public int compareTo(Employ_Ex9 o) {
        return this.department.compareTo(o.department);
    }

    @Override
    public String toString() {
        return "Employ_Ex9{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Ex_9 {
    public static void main(String[] args) {
        TreeMap<String, Set<Employ_Ex9>> employeeMap = new TreeMap<>();

        Set<Employ_Ex9> itEmployees = new HashSet<>();
        itEmployees.add(new Employ_Ex9(1, "Alice", "IT"));
        itEmployees.add(new Employ_Ex9(2, "Bob", "IT"));

        Set<Employ_Ex9> hrEmployees = new HashSet<>();
        hrEmployees.add(new Employ_Ex9(3, "Charlie", "HR"));
        hrEmployees.add(new Employ_Ex9(4, "David", "HR"));

        employeeMap.put("IT", itEmployees);
        employeeMap.put("HR", hrEmployees);

        Set<Employ_Ex9> hr = employeeMap.get("HR");
        for (Employ_Ex9 emp : hr) {
            System.out.println(emp);
        }
    }
}
