/*
Exercise 6: Array Search
Write a program that searches for a given element in an integer array and prints its index if found,
or a message if not found.
*/
package Buoi_3.Lab_2_Array;

import java.util.Scanner;

public class Ex_6_ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mảng giá trị mong muốn: ");
        int numbers = sc.nextInt();

        //Khai báo mảng
        int[] array = new int[numbers];

        //Chạy vòng lặp để hiển thị vị trí của giá trị nhập
        for (int i = 0; i < numbers; i++) {
            System.out.print("Giá trị nhập thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Giá trị bạn muốn tìm kiếm: ");
        int searchValue = sc.nextInt();

        //Khai báo một biến index để đật giá trị
        int index = -1;

        //Tạo vòng lặp để tách chuỗi trong mảng
        for (int i = 0; i < array.length; i++) {
            //Kiểm tra trong mảng có cùng giá trị tìm kiếm hay không?
            if (array[i] == searchValue) {
                //Gán giá trị index = vị trí của mảng đó
                index = i;
                break;//Dừng vòng lặp khi đã có vị trí
            }
        }

        //Đặt điều kiện trả về khi có giá trị
        if (index != -1) {
            System.out.println("Vị trí giá trị tìm kiếm ở " + index);
        } else {
            System.out.println("Không tìm thấy dữ liệu bên trong mảng.");
        }

    }
}
