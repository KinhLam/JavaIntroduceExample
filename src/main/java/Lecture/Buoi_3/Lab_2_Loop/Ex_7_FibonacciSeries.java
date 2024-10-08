/*Exercise 7: Fibonacci Series
Write a program that generates and prints the Fibonacci series up to a specified number of terms
using a for loop.*/

/*Trong chuỗi Fibonacci, số tiếp theo là tổng của hai số trước đó, ví dụ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, v.v. Hai số đầu tiên của chuỗi Fibonacci là 0 và 1.*/


package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_7_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        fibonacciSeries(number);
    }

    public static void fibonacciSeries(int n) {
        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i <= n; i++) {
            System.out.print(num1 + " ");

            //Swap
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
