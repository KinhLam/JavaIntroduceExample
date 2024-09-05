/*Exercise 15: Reverse String
Write a program that prompts the user to enter a string and prints its reverse using a do...while loop.*/


package Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_15_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        int length = str.length(); //Khai báo đếm chuỗi
        String reverse = ""; //Khai báo một biến rỗng
        int index = length - 1; //Khai báo index - 1

        //Bắt đầu khởi tạo vòng lặp
        do {
            reverse += str.charAt(index); //Bắt đầu phần tử thứ 3 (tức lấy dữ liệu cuối của chuỗi)
            index--; //Giảm đi 1
        }while (index >= 0);

        System.out.println("Kết quả đảo ngược là: " + reverse);
    }
}


