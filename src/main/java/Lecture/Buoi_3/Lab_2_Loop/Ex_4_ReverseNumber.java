/*Exercise 4: Reverse Number
        Write a program that prompts the user to enter a positive integer and prints its reverse using a while
        loop*/


package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_4_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reverse);
    }
}
