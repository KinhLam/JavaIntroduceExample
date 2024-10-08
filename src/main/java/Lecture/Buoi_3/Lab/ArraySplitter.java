package Lecture.Buoi_3.Lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySplitter {
    public static void main(String[] args) {
        arraySplitter();
    }

    public static void arraySplitter() {
        Random rd = new Random();

        // Sinh số nguyên ngẫu nhiên cho n
        int n = rd.nextInt(18) + 3;
        // Sinh số nguyên ngẫu nhiên cho chỉ số tách
        int index = rd.nextInt(n);

        // Tạo mảng ngẫu nhiên
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(100);  // Giá trị ngẫu nhiên từ 0 đến 99
        }

        // Tách mảng thành hai mảng con
        int[] firstSubArray = Arrays.copyOfRange(array, 0, index);
        int[] secondSubArray = Arrays.copyOfRange(array, index, n);

        // In ra kết quả
        System.out.println("n = " + n + ", index = " + index);
        System.out.println("The generated array: " + Arrays.toString(array));
        System.out.println("1. First sub-array: " + Arrays.toString(firstSubArray));
        System.out.println("2. Second sub-array: " + Arrays.toString(secondSubArray));
    }
}
