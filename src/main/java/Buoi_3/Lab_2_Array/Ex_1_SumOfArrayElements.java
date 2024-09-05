package Buoi_3.Lab_2_Array;

import java.util.Scanner;

public class Ex_1_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        // Nhập giá trị cho từng phần tử trong mảng
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Tính tổng các phần tử trong mảng
        for (int j : arr) {
            sum += j;
        }

        System.out.println("\nSum of Array: " + sum);
    }


}
