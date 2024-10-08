package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student_Ex8 {
    String name;
    int marks;

    public Student_Ex8(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - Marks: " + marks;
    }
}

public class Ex_8 {
    public static void main(String[] args) {
        List<Student_Ex8> students = Arrays.asList(
                new Student_Ex8("Alice", 85),
                new Student_Ex8("Bob", 75),
                new Student_Ex8("Charlie", 90)
        );
        students.sort(Comparator.comparingInt(Student_Ex8::getMarks).reversed());
        System.out.println("Sorted list: " + students);
    }
}