/*Exercise 7: Duplicate Elements
Write a program that finds and prints all duplicate elements in an integer array.*/


package Lecture.Buoi_3.Lab_2_Array;

import java.util.Scanner;

public class Ex_7_DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích cỡ trong mảng: ");
        int numbers = sc.nextInt();

        //Khai báo mảng
        int[] array = new int[numbers];

        for(int i = 0; i < numbers; i++){
            System.out.println("Vị trí mảng thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Giá trị bị trùng lặp là: ");
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
