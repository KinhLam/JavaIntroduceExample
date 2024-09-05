/*
In project “Java.S.A201” create a new package called exercise3, after that create a class named
FrequentNumber:
         Declare an int arrray and a variable ‘len’. Ask user to enter length of Array
 Continuing to require users enter a value for an element of Array, repeating this work until Array is
full or user chooses “N/n” if asked “Do you want to continue?”
         Enter an int value stored to ‘value’ variable, write java code to count frequency of the value in Array,
prints amount and positions.
*/



package Assignment.ASM1.JPE_S_A301;

import java.util.Scanner;

public class Ex_3_FrequentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử bạn muốn: ");
        int len = sc.nextInt();

        int[] array = new int[len];

        int index = 0;
        while (index < len) {
            System.out.print("Nhập giá trị thứ " + (index + 1) + ": ");
            array[index] = sc.nextInt();
            index++;

            // Hỏi người dùng có muốn tiếp tục không
            if (index < len) {  // Chỉ hỏi nếu chưa đầy mảng
                System.out.print("Bạn có muốn tiếp tục không? (Y/N): ");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("N")) {
                    break; // Dừng nhập nếu người dùng chọn 'N' hoặc 'n'
                }
            }
        }

        System.out.print("Nhập phần tử mà bạn muốn kiểm tra: ");
        int value = sc.nextInt();

        // Bước 4: Đếm số lần xuất hiện của 'value' trong mảng và tìm các vị trí
        int count = 0;
        System.out.print("Vị trí của " + value + " bên trong mảng: ");
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                count++;
                System.out.print(i + " "); // In ra vị trí của phần tử trong mảng
            }
        }

        // In ra số lần xuất hiện
        System.out.println();
        System.out.println("Phần tử " + value + " được lặp lại " + count + " lần.");
    }
}
