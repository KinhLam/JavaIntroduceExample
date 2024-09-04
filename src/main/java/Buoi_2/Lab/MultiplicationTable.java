package Buoi_2.Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.printf("\n -----------n = %d-----------\n", n);
        printMultiplicationTable(n);
    }

    private static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf(" %d x %d = %d\t", j, i, (i * j));
            }
            System.out.println();
        }
    }
}
