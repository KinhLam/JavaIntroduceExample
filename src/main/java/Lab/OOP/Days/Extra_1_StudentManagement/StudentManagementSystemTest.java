package Lab.OOP.Days.Extra_1_StudentManagement;

import java.util.Scanner;

public class StudentManagementSystemTest {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        system.addStudent("Kinh", 1, 9.5);
        system.addStudent("Lam", 2, 8.5);
        system.addStudent("Duc", 3, 10);

        System.out.println("Display student details");
        system.displayStudents();
        System.out.println("Averange All Students: ");
        system.displayAverange();

        System.out.println("Remove student");
        System.out.println("Enter the rolllNumber: ");
        Scanner sc = new Scanner(System.in);
        int rollNumber = sc.nextInt();
        system.removeStudent(rollNumber);

        System.out.println("Display student after removal");
        system.displayStudents();

        System.out.println("Averange All Students after removal: ");
        system.displayAverange();
    }
}
