/*Exercise 15: Number Range
        Write a program that prompts the user to enter a number. Determine and print if the number is in the
        range of 1 to 100 (inclusive) or not.*/

package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_15_NumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

        } while (num <= 1 || num >= 100);
        System.out.print("Your number is: " + num);
    }
}
