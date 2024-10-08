/*Exercise 14: Grade Point Average (GPA)
Calculator Write a program that prompts the user to enter grades for multiple courses. Calculate and
print the GPA based on the following grade scale:
        • A: 4.0
        • B: 3.0
        • C: 2.0
        • D: 1.0
        • F: 0.0*/



package Lecture.Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_14_GradePointAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalPoints = 0.0;
        int numberOfCourses = 0;

        while (true) {
            System.out.print("Enter grade (A, B, C, D, F) or 'X' to finish: ");
            String grade = sc.next().toUpperCase();

            if (grade.equals("X")) {
                break;
            }

            double gradePoint = 0.0;

            switch (grade) {
                case "A":
                    gradePoint = 4.0;
                    break;
                case "B":
                    gradePoint = 3.0;
                    break;
                case "C":
                    gradePoint = 2.0;
                    break;
                case "D":
                    gradePoint = 1.0;
                    break;
                case "F":
                    gradePoint = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade. Please enter A, B, C, D, F, or X to finish.");
                    continue;
            }

            totalPoints += gradePoint;
            numberOfCourses++;
        }

        if (numberOfCourses > 0) {
            double gpa = totalPoints / numberOfCourses;
            System.out.printf("Your GPA is: %.2f%n", gpa);
        } else {
            System.out.println("No grades entered.");
        }
    }
}
