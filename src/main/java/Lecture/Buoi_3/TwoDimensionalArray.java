package Lecture.Buoi_3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        initTwoDimensionalArray();

        // Gọi phương thức với các array One Dimension
        printRows(new int[]{11, 21, 31}, new int[]{41, 51, 61}, new int[]{71, 81, 91, 101});
        System.out.println();
        // Init by input From keyboard
        receiveFromInputKeyBoard();
    }

    public static void initTwoDimensionalArray() {
        //Init Two Dimension Array
        int[][] numbers;
        numbers = new int[3][4];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        checkLength(numbers);

        int[][] arr1 = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
        System.out.println("\nArray arr1");
        printTwoDimensionalArray(arr1);
        // Biến chỉ số và khởi tạo Array
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10} // ragged array
        };
        sumOfElementOfTwoDimensionalArray(arr2);

        int[][] arr3 = new int[3][3]; // 3 hàng 3 cột
        arr3[0][0] = 9;
        arr3[0][1] = 3;
        arr3[0][2] = 2;
        arr3[1][0] = 5;
        arr3[1][1] = 6;
        arr3[1][2] = 4;
        arr3[2][0] = 8;
        arr3[2][1] = 1;
        arr3[2][2] = 7;
        System.out.println("\nOriginal Matrix");
        printMatrix(arr3);
        //Sort từng hàng
        System.out.println("After Sort Every Row Matrix");
        for (int[] element : arr3) {
            Arrays.sort(element);
        }
        printMatrix(arr3);

        //Ép về array One Dimension rồi sort
        System.out.println("Matrix After Sort");
        printMatrix(sortTwoDimensionalArray(arr3));

        //Cộng 2 array
        System.out.println("Sum of Two Arrays: ");
        sumOfTwoDimensionalArray(arr3, arr2);
    }

    public static void checkLength(int[][] numbers) {
        // Length of Array
        int rows = numbers.length;    // số hàng
        int columns = numbers[0].length; // số cột của hàng đầu tiên
        System.out.printf("Số hàng là %d và số cột là %d\n", rows, columns);
    }

    // Phương thức với list có arguments có độ dài biến đổi
    public static void printRows(int[]... rows) {
        System.out.println();
        for (int[] row : rows) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void printTwoDimensionalArray(int[][] arr) {
        //Dùng For
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        //Dùng ForEach
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.println(col + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sortTwoDimensionalArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] temp = new int[rows * cols];
        int index = 0;
        for (int[] row : matrix) {
            for (int col : row) {
                temp[index++] = col;
            }
        }
        Arrays.sort(temp);
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = temp[index++];
            }
        }
        return matrix;
    }

    public static void sumOfTwoDimensionalArray(int[][] arr1, int[][] arr2) {
        int[][] newArray = new int[2][3];

        // cong va in tong hai ma tran
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                newArray[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfElementOfTwoDimensionalArray(int[][] arr) {
        //Calculate Sum of Element of Two Dimension Array
        int sum = 0;
        for (int[] rowElement : arr) {
            for (int colElement : rowElement) {
                sum += colElement;
            }
        }
        System.out.println("Tổng các phần tử trong array là: " + sum);
    }

    public static void receiveFromInputKeyBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Num of Row Matrix: ");
        int n = scanner.nextInt();
        System.out.print("Input Num of Col Matrix: ");
        int m = scanner.nextInt();
        // Init Two Dimension
        int[][] arr = new int[n][m];
        System.out.print("Input Num Element of Array: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Element of Two Dimensional Array: ");
        for (int[] rowElements : arr) {
            for (int colElements : rowElements) {
                System.out.print(colElements + " ");
            }
            System.out.println();
        }
    }
}