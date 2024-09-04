/*
Exercise 9: Ticket Price
Write a program that prompts the user to enter their age and determines the ticket price for a movie
based on the following conditions:
        • Age 0-5: Free
• Age 6-12: Child ticket price
• Age 13-59: Adult ticket price
• Age 60 and above: Senior ticket price
*/


package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_9_TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("You are negative");
        } else if (age >= 0 && age <= 5) {
            System.out.println("Free");
        } else if (age > 6 && age <= 12) {
            System.out.println("Child ticket price");
        } else if (age > 13 && age <= 59) {
            System.out.println("Adult ticket price");
        } else {
            System.out.println("Senior ticket price");
        }
    }
}
