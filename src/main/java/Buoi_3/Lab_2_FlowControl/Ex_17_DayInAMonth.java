/*Exercise 17: Day in a Month
        Write a program that prompts the user to enter a month and year. Determine and print the number of
        days in that month. Account for leap years.*/


package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_17_DayInAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        // Calculate the number of days in the given month
        int daysInMonth = getDaysInMonth(month, year);

        // Print the result
        System.out.println("Number of days in month " + month + " of year " + year + ": " + daysInMonth);
    }

    // Method to determine the number of days in a month
    private static int getDaysInMonth(int month, int year) {
        // Days in months for non-leap years
        int[] daysInMonthNonLeap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Days in months for leap years
        int[] daysInMonthLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check if the year is a leap year
        boolean isLeapYear = isLeapYear(year);

        // Return the number of days in the given month
        if (isLeapYear) {
            return daysInMonthLeap[month - 1];
        } else {
            return daysInMonthNonLeap[month - 1];
        }
    }

    // Method to determine if a year is a leap year
    private static boolean isLeapYear(int year) {
        // A year is a leap year if divisible by 4, not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
