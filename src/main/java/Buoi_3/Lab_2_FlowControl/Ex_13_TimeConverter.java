/*Exercise 13: Time Converter
        Write a program that prompts the user to enter a time in hours and minutes. Convert the time to
        minutes and display the total number of minutes.*/



package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_13_TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = sc.nextInt();

        System.out.println("Total minutes: " + ((hours * 60) + minutes));
    }
}
