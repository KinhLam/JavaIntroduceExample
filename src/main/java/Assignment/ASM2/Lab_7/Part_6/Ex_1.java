package Assignment.ASM2.Lab_7.Part_6;

import java.util.TreeMap;

class Student_Ex1 implements Comparable<Student_Ex1> {
    int rollNumber;
    String name;
    int age;
    public Student_Ex1(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student_Ex1 o) {
        return Integer.compare(this.rollNumber, o.rollNumber);
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
        TreeMap<Integer, Student_Ex1> studentMaps = new TreeMap<>();
        studentMaps.put(1, new Student_Ex1(1, "Alex", 18));
        studentMaps.put(2, new Student_Ex1(2, "Bob", 18));
        studentMaps.put(3, new Student_Ex1(3, "Charles", 18));

        for(Student_Ex1 student: studentMaps.values()) {
            System.out.println(student);
        }
    }
}
