/*Exercise 16: Discount Calculator
        Write a program that prompts the user to enter the total purchase amount and determines the
        discount based on the following conditions:
        • If the purchase amount is less than $50, no discount is applied.
        • If the purchase amount is between $50 and $100, apply a 10% discount.
        • If the purchase amount is greater than $100, apply a 20% discount.*/


package Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_16_DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of money:");
        double amount = sc.nextDouble();

        if (amount < 50) {
            System.out.println("No discount is applied. You need to pay: " + amount);
        } else if (amount >= 50 && amount <= 100) {
            double discount = 0.10 * amount;  // 10% of amount
            double finalAmount = amount - discount;
            System.out.println("Your discount is 10%. You need to pay: " + finalAmount);
        } else {
            double discount = 0.20 * amount;  // 20% of amount
            double finalAmount = amount - discount;
            System.out.println("Your discount is 20%. You need to pay: " + finalAmount);
        }
    }
}
