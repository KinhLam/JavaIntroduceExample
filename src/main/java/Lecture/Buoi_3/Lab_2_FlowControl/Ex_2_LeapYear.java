/*Exercise 2: Leap Year Checker
Write a program that prompts the user to enter a year and determines if it is a leap year or not. Use
the following conditions:
        • A year is a leap year if it is divisible by 4, but not divisible by 100, except if it is divisible by
400.*/

package Lecture.Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_2_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
