package Lecture.Buoi_2.Lab;

public class SecondSmallestElement {
    public static void main(String[] args) {
        System.out.println("\n");
        int[] arr1 = {3, 5, 2, 8, -9, 1};
        System.out.println("The second smallest element in arr1: " + findSecondSmallestElement(arr1));

        int[] arr2 = {2, 2, 2, 2, 2, 2};
        System.out.println("The second smallest element int arr2: " + findSecondSmallestElement(arr2));

        int[] arr3 = {-5, 7, -1, 9, 4, 6};
        System.out.println("The second smallest element int arr3: " + findSecondSmallestElement(arr3));
    }

    public static int findSecondSmallestElement(int[] arr) {
        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }
}
