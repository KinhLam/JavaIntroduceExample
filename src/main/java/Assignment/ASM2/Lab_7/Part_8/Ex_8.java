package Assignment.ASM2.Lab_7.Part_8;

import java.util.TreeSet;

class Student_Ex8 implements Comparable<Student_Ex8> {
    int rollNumber;
    String name;
    double mark;

    public Student_Ex8(int rollNumber, String name, double mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student_Ex8 o) {
        return Double.compare(this.mark, o.mark);
    }

    @Override
    public String toString() {
        return "Student_Ex8{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
public class Ex_8 {
    public static void main(String[] args) {
        TreeSet<Student_Ex8> students = new TreeSet<>();
        students.add(new Student_Ex8(9, "James", 5.5));
        students.add(new Student_Ex8(8, "John", 5.5));
        students.add(new Student_Ex8(7, "James", 5.5));

        double totalMark = 0.0;
        for (Student_Ex8 student : students) {
            totalMark += student.mark;
        }
        System.out.println("Avenge: "+ (totalMark/students.size()));
    }
}
