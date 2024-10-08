package Lab.OOP.Days.Extra_1_StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int rollNumber, double grade){
        Student s = new Student(name, rollNumber, grade);
        students.add(s);
//        students.add(new Student(name, rollNumber, grade));
    }

    public boolean removeStudent(int rollNumber){
        return students.removeIf(s -> s.getRollNumber() == rollNumber);
    }

    public void displayStudents(){
        if(students.isEmpty()){
            System.out.println("There is no students in the system");
        }else{
            for(Student s : students){
                System.out.println(s);
            }
        }
    }

    public void displayAverange(){
        if(students.isEmpty()){
            System.out.println("There is no students in the system");
        }else{
            double average = 0;
            for(Student s : students){
                average += s.getGrade();
            }
            double avg = average / students.size();
            System.out.println("The average grade is " + avg);
        }
    }
}
