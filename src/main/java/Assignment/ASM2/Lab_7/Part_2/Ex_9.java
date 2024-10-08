package Assignment.ASM2.Lab_7.Part_2;

import java.util.HashSet;

class Student_Ex9 implements Comparable<Student_Ex9> {
    int rollNumber;
    String name;
    double mark;

    public Student_Ex9(int rollNumber, String name, double mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student_Ex9 o) {
        return Double.compare(this.mark, o.mark);
    }

    @Override
    public String toString() {
        return "Student_Ex9{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
public class Ex_9 {
    public static void main(String[] args) {
        HashSet<Student_Ex9> students = new HashSet<>();
        students.add(new Student_Ex9(1, "Kinh", 9.5));
        students.add(new Student_Ex9(2, "Lam", 8.5));
        students.add(new Student_Ex9(3, "Duc", 10));

        double totalMark = students.stream().mapToDouble(s -> s.mark).sum();
        double avenrage = totalMark / students.size();
        System.out.println("Average mark: " + avenrage);
    }
}
