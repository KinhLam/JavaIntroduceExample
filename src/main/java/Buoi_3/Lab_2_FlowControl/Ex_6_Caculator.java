/*Exercise 6: Calculator
Write a program that prompts the user to enter two numbers and an operator (+, -, *, /). Perform the
corresponding operation and display the result using a switch case statement.*/

package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_6_Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt();
        System.out.print("Enter number B: ");
        int b = sc.nextInt();

        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));
    }
}
