/*Exercise 17: Pattern Printing
Write a program that prints a pattern of asterisks (*) in a pyramid shape using nested for loops.*/


package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_17_PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số hàng của hình kim tự tháp
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = sc.nextInt();

        // Vòng lặp in ra các hàng
        for (int i = 1; i <= rows; i++) {
            // In khoảng trắng ở đầu mỗi hàng (để canh chỉnh thành hình kim tự tháp)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // In dấu sao
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Xuống dòng sau mỗi hàng
            System.out.println();
        }
    }
}
