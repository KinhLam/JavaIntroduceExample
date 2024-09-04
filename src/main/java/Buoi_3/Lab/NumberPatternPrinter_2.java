package Buoi_3.Lab;

import java.util.Scanner;

public class NumberPatternPrinter_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.printf("\n -----------n = %d-----------\n", n);
        numberPatternPrinter(n);
    }

    private static void numberPatternPrinter(int numbers) {
        int n = 1;
        for (int i = 1; i <= numbers; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
