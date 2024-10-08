/*Exercise 18: Ticket Category
        Write a program that prompts the user to enter their age and ticket type ("adult" or "child").
        Determine and print the ticket category based on the following conditions:
        • Adult: Age 18 and above.
        • Child: Age below 18.*/


package Lecture.Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_18_TicketCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Your ticket is child");
        }else{
            System.out.println("Your ticket is adult");
        }
    }
}
