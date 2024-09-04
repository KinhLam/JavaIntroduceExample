/*Exercise 1: Grade Calculator
Write a program that prompts the user to enter a numeric grade and prints the corresponding letter
grade based on the following grading scale:
        • 90 and above: A
• 80-89: B
• 70-79: C
• 60-69: D
• Below 60: F*/

package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_1_GradeCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade: ");
        int n = sc.nextInt();
        if (n < 0 || n > 100) {
            System.out.println("Invalid grade");
        } else if (n >= 90) {
            System.out.println("A");
        } else if (n >= 80 && n < 90) {
            System.out.println("B");
        } else if (n >= 70 && n < 80) {
            System.out.println("C");
        } else if (n >= 60 && n < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
