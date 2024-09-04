/*
Exercise 7: Voting Eligibility
Write a program that prompts the user to enter their age and citizenship status (either "citizen" or
        "non-citizen"). Determine if the person is eligible to vote or not based on the following conditions:
        • Must be 18 years or older.
• Must be a citizen.
*/


package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_7_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("You are negative");
        } else if (age < 18) {
            System.out.println("non-citizen");
        } else {
            System.out.println("citizen");
        }
    }
}
