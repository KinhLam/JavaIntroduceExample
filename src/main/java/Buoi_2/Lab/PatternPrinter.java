package Buoi_2.Lab;

import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.printf("\n---------n = %d----------\n", n);
        printPattern(n);
    }

    public static void printPattern(int numRows) {
        for (int i = 0; i < numRows; i++) {
            //In không gian thụt lề
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //In dấu hoa thị
            for (int j = 0; j < 2 * (numRows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
