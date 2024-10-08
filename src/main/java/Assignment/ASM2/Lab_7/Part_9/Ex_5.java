package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employy_Ex5{
    String name;
    int age;
    double salary;

    public Employy_Ex5(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employy_Ex5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class Ex_5 {
    public static void main(String[] args) {
        List<Employy_Ex5> employe = Arrays.asList(
                new Employy_Ex5("Alice", 30, 50000),
                new Employy_Ex5("Bob", 25, 60000),
                new Employy_Ex5("Charlie", 30, 55000)
        );

        employe.sort(Comparator.comparingInt(Employy_Ex5::getAge)
                .thenComparingDouble(Employy_Ex5::getSalary));

        System.out.println("Sorted list: "+ employe);
    }
}
