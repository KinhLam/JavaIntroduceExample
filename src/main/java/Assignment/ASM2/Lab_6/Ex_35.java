package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Student_Ex35 {
    String name;
    int grade;

    public Student_Ex35(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade;
    }
}

public class Ex_35 {
    String name;
    LinkedList<Student_Ex35> studentList = new LinkedList<>();

    public Ex_35(String name) {
        this.name = name;
    }

    public void addStudent(Student_Ex35 student) {
        studentList.add(student);
    }

    public void removeStudent(String name) {
        studentList.removeIf(student -> student.name.equalsIgnoreCase(name));
    }

    public void displayStudents() {
        System.out.println("Students in " + name + ":");
        for (Student_Ex35 student : studentList) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Ex_35 school = new Ex_35("Green Valley High");
        school.addStudent(new Student_Ex35("Tom", 10));
        school.addStudent(new Student_Ex35("Jerry", 11));

        school.displayStudents();

        school.removeStudent("Tom");
        System.out.println("After removing Tom:");
        school.displayStudents();
    }
}
