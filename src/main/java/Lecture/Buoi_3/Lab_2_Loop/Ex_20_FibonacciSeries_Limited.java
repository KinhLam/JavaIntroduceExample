/*
Exercise 20: Fibonacci Series (Limited)
Write a program that generates and prints the Fibonacci series up to a specified number of terms
using a while loop. Limit the number of terms based on user input.
*/

package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_20_FibonacciSeries_Limited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int numTerms = sc.nextInt();

        // Initial two numbers in the Fibonacci sequence
        int num1 = 0, num2 = 1;

        // Counter to keep track of the number of terms printed
        int count = 0;

        // Display the Fibonacci series using a while loop
        System.out.println("Fibonacci series up to " + numTerms + " terms:");

        // Loop until the desired number of terms is reached
        while (count < numTerms) {
            System.out.print(num1 + " ");

            // Calculate the next number in the series
            int nextTerm = num1 + num2;

            // Update variables for the next iteration
            num1 = num2;
            num2 = nextTerm;

            count++; // Increment the count of terms printed
        }
    }
}
