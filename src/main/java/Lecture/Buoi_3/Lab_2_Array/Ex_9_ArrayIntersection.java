/*Exercise 9: Array Intersection
Write a program that finds and prints the intersection of two integer arrays, i.e., the common
elements in both arrays
- Viết chương trình tìm giao của hai mảng số nguyên, tức là mảng chung các phần tử của 2 mảng
*/

package Lecture.Buoi_3.Lab_2_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_9_ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Mảng thứ nhất
        System.out.print("Nhập số lượng mong muốn ở mảng thứ nhất: ");
        int number1 = sc.nextInt();
        int[] array1 = new int[number1];

        for(int i = 0; i < number1; i++){
            System.out.print("Phần tử 1 thứ " + i + ": ");
            array1[i] = sc.nextInt();
        }

        //Mảng thứ hai
        System.out.print("Nhập số lượng mong muống ở mảng thứ hai: ");
        int number2 = sc.nextInt();
        int[] array2 = new int[number2];
        for(int i = 0; i < number2; i++){
            System.out.print("Phần tử 2 thứ " + i + ": ");
            array2[i] = sc.nextInt();
        }

        //Tìm những số trong 2 mảng giống nhau
        ArrayList<Integer> intersection = new ArrayList<>();

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                //Điều kiện so sánh giữa 2 phần tử của 2 mảng và [intersection] là biểu thức tránh sự trùng lặp trong mảng array1
                //EX: array1:{1,2,3,4,4} và array2:{1,2,3} thì lệnh [intersection] sẽ tránh bị lặp phần tử số 4 trong mảng
                if(array1[i] == array2[j]&& !intersection.contains(array1[i])){
                    intersection.add(array1[i]);
                }
            }
        }


        if(intersection.isEmpty()){
            System.out.println("Không có dữ liệu nào trong 2 mảng trùng khớp");
        }
        else{
            System.out.println("Dãy số có trong 2 mảng là: " + intersection);
        }
    }
}
