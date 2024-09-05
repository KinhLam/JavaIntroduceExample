/*
Exercise 18: Sum of Squares
Write a program that calculates and prints the sum of the squares of all numbers between 1 and 10
using a for loop.
*/



package Buoi_3.Lab_2_Loop;

public class Ex_18_SumOfSquares {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = sum + i * i;
        }

        System.out.println("Tổng bình phương của các số từ (1) đến (10): " + sum);
    }
}
