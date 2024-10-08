package Assignment.ASM2.Lab_7.Part_8;

import java.util.TreeSet;

class Student_Ex2 implements Comparable<Student_Ex2> {
    int rollNumber;
    String name;
    double grade;

    public Student_Ex2(int rollNumber, String name, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student_Ex2 o) {
        return Double.compare(this.grade, o.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
public class Ex_2 {
    public static void main(String[] args) {
        TreeSet<Student_Ex2> students = new TreeSet<>();
        students.add(new Student_Ex2(1, "Kinh", 9.5));
        students.add(new Student_Ex2(2, "Lam", 10));
        students.add(new Student_Ex2(3, "Duc", 8));

        System.out.println("Student sort by grade ");
        for(Student_Ex2 s : students) {
            System.out.println(s);
        }
    }
}
