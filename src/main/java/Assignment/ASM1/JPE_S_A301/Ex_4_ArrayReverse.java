/*In project “Java.S.A201” create a new package called exercise4, after that create a class named
ArrayReverse:
         Initialize an integer array. Array example:
int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
 Write a Java code to reverse the array contents. Prints Array before and after conversion.s*/


package Assignment.ASM1.JPE_S_A301;

import java.util.Scanner;

public class Ex_4_ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử bạn muốn: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Giá trị mảng ban đầu: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Giá trị mảng được đảo ngược: ");

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
