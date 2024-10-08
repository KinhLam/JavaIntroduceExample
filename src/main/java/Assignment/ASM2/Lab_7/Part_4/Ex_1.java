package Assignment.ASM2.Lab_7.Part_4;

import java.util.HashMap;
import java.util.Objects;

class Student_Ex1{
    int rollNumber;
    String name;
    int age;

    public Student_Ex1(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_Ex1 that = (Student_Ex1) o;
        return rollNumber == that.rollNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNumber);
    }

    @Override
    public String toString() {
        return "Student_Ex1{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Ex_1 {
    public static void main(String[] args) {
        HashMap<Integer, Student_Ex1> students = new HashMap<>();
        students.put(101, new Student_Ex1(1001, "Alex", 20));
        students.put(101, new Student_Ex1(1001, "Alex", 20));
        students.put(101, new Student_Ex1(1001, "Alex", 20));

        Student_Ex1 student = students.get(101);
        System.out.println(student);
    }
}
