package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Student{
    int rollNumber;
    String name;
    double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Ex_27 {
    LinkedList<Student> students = new LinkedList<>();

    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudent(int rollNumber){
        students.removeIf(s -> s.rollNumber == rollNumber);
    }

    public double caculateAverageMark(){
        double total = 0;
        for(Student s : students){
            total += s.marks;
        }
        return total / students.size();
    }

    public Student findHighestMark(){
        Student highest = null;
        for(Student s : students){
            if(s.marks > highest.marks){
                highest = s;
            }
        }
        return highest;
    }

    public void displayStudents(){
        for(Student s : students){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Ex_27 ex = new Ex_27();
        ex.addStudent(new Student(1, "Kính", 8.5));
        ex.addStudent(new Student(2, "Lâm", 9));
        ex.displayStudents();

        System.out.println("Average Marks: " + ex.caculateAverageMark());

        System.out.println("Student with Highest Marks: " + ex.findHighestMark());

        ex.removeStudent(2);
        ex.displayStudents();
    }
}
