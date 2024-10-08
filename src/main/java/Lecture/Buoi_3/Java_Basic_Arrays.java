package Lecture.Buoi_3;

import java.util.Scanner;

public class Java_Basic_Arrays {
    public static void main(String[] args) {
        largestSumArray();
    }

    public static void testrray(){
        Scanner sc = new Scanner(System.in);
        double[] myList = new double[10];

        // Nhập giá trị cho các phần tử trong mảng
        for(int i = 0; i < myList.length; i++){
            System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
            myList[i] = sc.nextDouble();
        }

        // Tìm giá trị lớn nhất và vị trí của nó
        double max = myList[0];
        int indexOfMax = 0;
        for(int i = 1; i < myList.length; i++){
            if(myList[i] > max){
                max = myList[i];
                indexOfMax = i;
            }
        }

        System.out.println("Vị trí của giá trị lớn nhất: " + indexOfMax);
        System.out.println("Giá trị lớn nhất: " + max);
    }


    public static void largestSumArray(){
        Scanner sc = new Scanner(System.in);

        // Nhập số hàng và số cột của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Nhập các phần tử cho ma trận
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Nhập giá trị cho phần tử tại vị trí (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxRow = 0;
        int indexOfMaxRow = 0;

        // Tính tổng hàng đầu tiên
        for(int column = 0; column < matrix[0].length; column++){
            maxRow += matrix[0][column];
        }

        // Tìm hàng có tổng lớn nhất
        for(int row = 1; row < matrix.length; row++){
            int totalOfThisRow = 0;
            for(int column = 0; column < matrix[row].length; column++){
                totalOfThisRow += matrix[row][column];
            }
            if(totalOfThisRow > maxRow){
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }

        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }
}
