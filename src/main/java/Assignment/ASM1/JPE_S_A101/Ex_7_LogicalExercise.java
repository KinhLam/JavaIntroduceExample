package Assignment.ASM1.JPE_S_A101;

import java.util.Scanner;

public class Ex_7_LogicalExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên: ");
        int a = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = sc.nextInt();

        System.out.printf("%d != %d", a, b);
        System.out.println();
        System.out.printf("%d < %d", a, b);
        System.out.println();
        System.out.printf("%d <= %d", a, b);
    }
}
