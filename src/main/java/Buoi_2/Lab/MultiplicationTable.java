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
        //Ex: 1,2,3,4,5,6,7,8,9,10
        for (int i = 1; i < 10; i++) {
//            Ex: j = 2 => 2*1, 2*2, 2*3, 2*4, 2*5;
            for (int j = 1; j < num; j++) {
                System.out.printf("%d x %d = %d\n", i, j, num * i * j);
            }
            System.out.println();
        }
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= num; j++) {
//                System.out.printf(" %d x %d = %d\t", j, i, (i * j));
//            }
//            System.out.println();
//        }
    }
}
