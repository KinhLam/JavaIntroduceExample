/*
Exercise 20: Day of the Week (Advanced)
        Write a program that prompts the user to enter a date (day, month, and year). Determine and print
        the day of the week for that date using Zeller's Congruence algorithm.
*/

package Lecture.Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_20_DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter day, month, and year
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate the inputs
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Invalid date. Please enter valid day (1-31) and month (1-12).");
            return;
        }

        // Adjust month and year for Zeller's Congruence
        if (month == 1 || month == 2) {
            month += 12; // January and February are treated as months 13 and 14 of the previous year
            year--;
        }

        // Calculate the day of the week using Zeller's Congruence
        int dayOfWeek = zellersCongruence(day, month, year);

        // Print the day of the week
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("The day of the week is: " + daysOfWeek[dayOfWeek]);
    }

    // Method to calculate day of the week using Zeller's Congruence
    private static int zellersCongruence(int day, int month, int year) {
        int k = year % 100; // The year within the century
        int j = year / 100; // The zero-based century (i.e., year / 100)

        // Zeller's Congruence formula
        int h = (day + (13 * (month + 1) / 5) + k + (k / 4) + (j / 4) - (2 * j)) % 7;

        // Adjust result to be within range [0, 6]
        return (h + 7) % 7;
    }
}
