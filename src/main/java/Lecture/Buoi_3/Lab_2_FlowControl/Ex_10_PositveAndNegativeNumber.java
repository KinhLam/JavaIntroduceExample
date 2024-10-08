package Lecture.Buoi_3.Lab_2_FlowControl;

import java.util.Scanner;

public class Ex_10_PositveAndNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num == 0)
            System.out.println("Zero");
        else if(num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Positive number");
    }
}
