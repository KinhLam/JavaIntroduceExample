package Buoi_3.Lab_2_Array;

import java.util.Scanner;

public class Ex_5_ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();

        // Rotating the array to the left by k positions
        k = k % n; // Handle cases where k > n
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        System.out.println("Array after rotation:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
