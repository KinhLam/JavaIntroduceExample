package Lecture.Buoi_3;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        initOneDimensionalArray();

        // Gọi phương thức với các đối số different
        printNumbers(1, 2, 3);
        printNumbers(4, 5, 6, 7);

        //Receive From keyboard
        receiveFromInput();
    }

    public static void initOneDimensionalArray() {
        // khai báo một array
        String[] cars;
        // thêm giá trị, sử dụng new
        cars = new String[]{"Honda", "BMW", "Ford"};
        System.out.println("Array Cars Before Sort: ");
        printMatrixByString(cars); //Pass array to method
        //Sort String Arrays
        sortMatrixByString(cars);
        System.out.println("\nArray Cars After Sort: ");
        printMatrixByString(cars);

        String[] subjects = {"JAVA", "C#", "C++", "C"};
        System.out.println("\nArray Subjects: ");
        printMatrixByString(subjects);
        //Tìm phần tử trong array
        System.out.println("Vị trí JAVA trong array Subjects: " + findElementInArray(subjects));

        //Khởi tạo array arr1 null
        int[] arr1 = null;

        // Tạo array arr2 có 10 phần tử
        int[] arr2 = new int[10];

        // Create Array don't need to define num of Element
        int[] arr3 = {9, 6, 8, 3, 5, 4, 2, 7, 1, 0};
        System.out.println("\nArray 3: ");
        printMatrixByInt(arr3);

        //Gán giá trị cho Array Arr2
        arr2[0] = arr3[0];
        arr2[1] = arr3[1];
        arr2[2] = arr3[2];
        arr2[3] = arr3[3];
        arr2[4] = arr3[4];
        arr2[5] = arr3[5];
        arr2[6] = arr3[6];
        arr2[7] = arr3[7];
        arr2[8] = 5;
        arr2[9] = arr3[9];
        System.out.println("\nArray 2: ");
        printMatrixByInt(arr2);

        arr1 = copyLengthTwoArray(arr2);
        System.out.println("\nAfter copy length of Array 1 is: " + arr1.length);
        System.out.println("Array 1: ");
        printMatrixByInt(arr1);

        arr1 = copyDataTwoArray(arr3);
        System.out.println("\nArray 1: ");
        printMatrixByInt(arr1);

        addTwoArray(arr1, arr2);

        //Sort Array 1,2,3
        System.out.println("\nSort Arr1: ");
        sortMatrixByInt(arr1);
        printMatrixByInt(arr1);
        System.out.println("\nSort Arr2: ");
        sortMatrixByInt(arr2);
        printMatrixByInt(arr2);
        System.out.println("\nSort Arr3: ");
        sortMatrixByInt(arr3);
        printMatrixByInt(arr3);

        //Tổng các phần tử trong Array
        sumElementOfArray(arr1);
    }

    public static int findElementInArray(String[] arr) {
        return Arrays.binarySearch(arr, "JAVA");
    }

    public static int[] copyLengthTwoArray(int[] arr) {
        int[] arr1 = arr;
        return arr1;
    }

    public static int[] copyDataTwoArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    //In Array int
    public static void printMatrixByInt(int[] matrix) {
        for (int j : matrix) {
            System.out.println(j);
        }
        //In Array kiểu String Dùng For
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(matrix[i]);
//        }
    }

    //In Array String
    public static void printMatrixByString(String[] matrix) {
        //In Array kiểu String dùng ForEach
        for (String car : matrix) {
            System.out.println(car);
        }
    }

    //Sort Array
    public static void sortMatrixByInt(int[] matrix) {
        Arrays.sort(matrix);
    }

    public static void sortMatrixByString(String[] matrix) {
        Arrays.sort(matrix);
    }

    public static void addTwoArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Arrays do not have the same length");
        }
        int[] sumArrays = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sumArrays[i] = arr1[i] + arr2[i];
        }
        System.out.println("\nNew Array After Add From Two Array: ");
        printMatrixByInt(sumArrays);
    }

    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void sumElementOfArray(int[] arr) {
        //Tính tổng các phần tử trong Array
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("\nTổng các phần tử trong Array là: " + sum + "\n");
    }

    public static void receiveFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput num of element for Array: ");
        int n = sc.nextInt(); //num of element for Array
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input phần tử thứ: " + i);
            newArray[i] = sc.nextInt();
        }
        printMatrixByInt(newArray);
    }
}
