/*
Exercise 6: Sum of Digits
        Write a program that prompts the user to enter an integer and calculates the sum of its digits using a
        while loop.
*/


package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_6_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int x = 1;
        while (x <= num) {
            sum+=x;
            x++;
        }
        System.out.println(sum);
    }
}
