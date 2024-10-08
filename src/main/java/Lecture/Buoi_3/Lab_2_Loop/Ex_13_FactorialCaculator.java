/*Exercise 13: Factorial Calculator
Write a program that prompts the user to enter a positive integer and calculates its factorial using a
while loop.*/

package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_13_FactorialCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1;
        int sum = 1;

        if(n < 0){
            System.out.println("Invalid number");
        }

        while(fact <= n){
            sum = sum * fact;
            fact++;
        }
        System.out.println("Factorial of " + n + " is " + sum);
    }
}
