package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;
import java.util.Objects;

class Student_Ex1{
    String name;
    int rollNumber;
    int age;

    public Student_Ex1(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
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
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                '}';
    }
}
public class Ex_1 {
    public static void main(String[] args) {
        HashSet<Student_Ex1> students = new HashSet<>();
        students.add(new Student_Ex1("Kinh", 1, 22));
        students.add(new Student_Ex1("Lam", 2, 21));
        students.add(new Student_Ex1("Duc", 3, 20));

        Student_Ex1 seachStudent = new Student_Ex1("Kinh", 1, 22);
        if(students.contains(seachStudent)) {
            System.out.println("Student roll number: " + seachStudent.rollNumber);
        }else {
            System.out.println("Student not found");
        }

    }
}
