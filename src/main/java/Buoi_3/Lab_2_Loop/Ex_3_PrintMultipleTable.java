/*Exercise 3: Print Multiplication Table
Write a program that prompts the user to enter a number and prints its multiplication table up to a
specified range using a nested for loop.*/


package Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_3_PrintMultipleTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        // 1 vòng lặp (in ra bảng cửu chương duy nhất)
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println(); // Dòng trống để phân cách

        // Vòng lặp lồng (in ra nhiều bảng cửu chương từ 1 đến 9)
        for (int i = 1; i <= num; i++) {
            // Vòng lặp trong để in bảng cửu chương của i
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println(); // Dòng trống để phân cách giữa các bảng
        }
    }
}
