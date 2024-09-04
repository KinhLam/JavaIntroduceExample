/*Exercise 8: Day of the Week
        Write a program that prompts the user to enter a number from 1 to 7 and prints the corresponding
        day of the week using a switch case statement.*/

package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_8_DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days: ");
        int days = sc.nextInt();
        switch (days) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}
