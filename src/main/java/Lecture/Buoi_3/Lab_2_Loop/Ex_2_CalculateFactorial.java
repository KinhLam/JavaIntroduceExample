/*Exercise 2: Calculate Factorial
Write a program that prompts the user to enter an integer and calculates its factorial using a for
loop.*/

package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_2_CalculateFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
