/*Exercise 8: Array Copy
Write a program that copies the elements of one integer array to another array and prints the copied
array.*/


package Lecture.Buoi_3.Lab_2_Array;

import java.util.Scanner;

public class Ex_8_ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng giá trị trong mảng: ");
        int numbers = sc.nextInt();

        int[] array = new int[numbers];
        int[] copyArray = new int[array.length];

        array = copyArray;

        for (int i = 0; i < numbers; i++) {
            System.out.print("Nhập phẩn tử số " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Giá trị mảng ban đầu: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("\n Giá trị mảng đã được sao chép: ");
        for(int i = 0; i < copyArray.length; i++){
            System.out.print(copyArray[i] + " ");
        }
    }
}
