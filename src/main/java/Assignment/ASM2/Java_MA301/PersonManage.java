package Assignment.ASM2.Java_MA301;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManage {
    private static List<Person> persons = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        inputPersonData(sc);
        updateStudentData(sc);
        displayTeachersWithSalaryAbove1000();
        displayPassingStudents();
    }

    public static void inputPersonData(Scanner sc) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter person type (student/teacher): ");
            String type = sc.nextLine().toLowerCase();

            if (type.equals("student")) {
                System.out.println("Enter student details: ");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Gender: ");
                String gender = sc.nextLine();
                System.out.print("Phone Number: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                while (!Validator.validateEmail(email)) {
                    System.out.println("Invalid email! Try again: ");
                    email = sc.nextLine();
                }
                System.out.print("Student ID: ");
                String studentId = sc.nextLine();
                System.out.print("Theory: ");
                double theory = sc.nextDouble();
                System.out.print("Practice: ");
                double practice = sc.nextDouble();
                sc.nextLine();
                while (!Validator.validateTheoryPractice(theory) || !Validator.validateTheoryPractice(practice)) {
                    System.out.println("Invalid theory/practice! Values must be between 0 and 10.");
                    theory = sc.nextDouble();
                    practice = sc.nextDouble();
                    sc.nextLine();
                }
                Student student = new Student(name, gender, phoneNumber, email, studentId, theory, practice);
                persons.add(student);

            } else if (type.equals("teacher")) {
                System.out.println("Enter teacher details: ");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Gender: ");
                String gender = sc.nextLine();
                System.out.print("Phone Number: ");
                String phoneNumber = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                while (!Validator.validateEmail(email)) {
                    System.out.println("Invalid email! Try again: ");
                    email = sc.nextLine();
                }
                System.out.print("Basic Salary: ");
                double basicSalary = sc.nextDouble();
                System.out.print("Subsidy: ");
                double subsidy = sc.nextDouble();
                sc.nextLine();

                Teacher teacher = new Teacher(name, gender, phoneNumber, email, basicSalary, subsidy);
                persons.add(teacher);
            }
        }
    }

    public static void updateStudentData(Scanner sc) {
        System.out.print("Enter student ID to update: ");
        String studentId = sc.nextLine();
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (studentId.equals(student.getStudentID())) {
                    System.out.println("Updating student information: ");
                    System.out.print("New theory mark: ");
                    double theory = sc.nextDouble();
                    System.out.print("New practice mark: ");
                    double practice = sc.nextDouble();
                    student.setTheory(theory);
                    student.setPractice(practice);
                    System.out.println("Student updated successfully.");
                    break;
                }
            }
        }
    }

    public static void displayTeachersWithSalaryAbove1000() {
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.calculateSalary() > 1000) {
                    System.out.println("Teacher: " + teacher.getFullName() + ", Salary: " + teacher.calculateSalary());
                }
            }
        }
    }

    public static void displayPassingStudents() {
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.calculateFinalmark() >= 6) {
                    System.out.println("Student: " + student.getFullName() + ", Final Mark: " + student.calculateFinalmark());
                }
            }
        }
    }


}
