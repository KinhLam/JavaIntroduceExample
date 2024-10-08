package Lecture.Buoi_2.Lab;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {4, 7, 2, 9, 10, 32};
        int largest1 = findLangest(arr1);
        System.out.println(" The largest element arr1 is: " + largest1);

        int [] arr2 = {2, 2, 2, 2, 2, 2};
        int largest2 = findLangest(arr2);
        System.out.println(" The largest element arr2 is: " + largest2);

        int [] arr3 = {-5, 7, -1, 9, 4, 6};
        int largest3 = findLangest(arr3);
        System.out.println(" The largest element in arr3 is: " + largest3);
    }

    public static int findLangest(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
