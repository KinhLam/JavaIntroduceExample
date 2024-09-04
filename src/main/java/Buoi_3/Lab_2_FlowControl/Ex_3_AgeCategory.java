/*Exercise 3: Age Category
Write a program that prompts the user to enter their age and prints the
corresponding category based on the following conditions:
        • If age is less than 0 or greater than 150, print "Invalid age."
        • If age is less than 18, print "Child."
        • If age is between 18 and 65, print "Adult."
        • If age is 65 or older, print "Senior.*/

package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_3_AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age < 0 || age > 150) {
            System.out.println("Invalid age");
        } else if (age < 18) {
            System.out.println("Child");
        } else if (age >= 18 && age < 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}
