/*Exercise 10: Array Sum Closest to Zero
Write a program that finds and prints the two elements in an integer array whose sum is closest to zero
- Viết chương trình tìm và in ra hai phần tử trong một mảng số nguyên có tổng gần bằng 0 nhất
*/


package Lecture.Buoi_3.Lab_2_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10_ArraySumClosestToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng mong muốn trong mảng: ");
        int numbers = sc.nextInt();
        int[] array = new int[numbers];

        for(int i = 0; i < numbers; i++){
            System.out.println("Giá trị thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int left = 0;
        int right = numbers - 1;
        int minSum = Integer.MAX_VALUE;
        int minLeft = left, minRight = right;

        while(left < right) {
            int sum = array[left] + array[right];

            if(Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                minLeft = left;
                minRight = right;
            }

            if(sum < 0){
                left++;
            }else{
                right--;
            }
        }

        System.out.println("Hai giá trị cộng lại để gần giá trị 0 là: " + array[minLeft] + " và " + array[minRight]);
    }
}
