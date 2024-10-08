package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class StudentCourse{
    String name;
    int age;
    double grade;

    public StudentCourse(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
public class Ex_30 {
    String name;
    LinkedList<StudentCourse> students = new LinkedList<>();

    public Ex_30(String name) {
        this.name = name;
    }

    public void addStudent(StudentCourse student) {
        students.add(student);
    }

    public void removeStudent(String name){
        students.removeIf(student -> student.name.equals(name));
    }

    public double calculateAverage() {
        double total = 0;
        for(StudentCourse student : students) {
            total += student.grade;
        }
        return total / students.size();
    }

    public void display() {
        for(StudentCourse student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Ex_30 ex = new Ex_30("Computer Science");
        ex.addStudent(new StudentCourse("Alice", 20, 85.5));
        ex.addStudent(new StudentCourse("Bob", 21, 90.0));
        ex.addStudent(new StudentCourse("Charlie", 19, 78.0));

        ex.display();
        System.out.println("Average Grade: " + ex.calculateAverage());

        ex.removeStudent("Alice");
        System.out.println("After removing Alice:");
        ex.display();
    }
}
