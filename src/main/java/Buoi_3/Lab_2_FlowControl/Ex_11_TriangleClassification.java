/*
Exercise 11: Triangle Classification
        Write a program that prompts the user to enter the lengths of three sides of a triangle. Determine
        and print the type of triangle based on the following conditions:
        • Equilateral: All sides are equal.
        • Isosceles: Two sides are equal.
        • Scalene: No sides are equal.
*/


package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_11_TriangleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All sides are equal.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Two sides are equal.");
        } else {
            System.out.println("No sides are equal.");
        }
    }
}
