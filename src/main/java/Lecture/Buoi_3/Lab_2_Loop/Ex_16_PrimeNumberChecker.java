/*Exercise 16: Prime Number Checker
Write a program that prompts the user to enter a positive integer and checks if it is a prime number
using a while loop.*/


package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_16_PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào một số nguyên dương
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        // Kiểm tra điều kiện nếu số nhập vào nhỏ hơn 1
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            // Kiểm tra xem có phải số nguyên tố không
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }

    // Hàm kiểm tra số nguyên tố bằng cách sử dụng vòng lặp while
    public static boolean isPrime(int num) {
        int divisor = 2;

        // Kiểm tra nếu num chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của num
        while (divisor <= Math.sqrt(num)) {
            if (num % divisor == 0) {
                return false; // Không phải số nguyên tố nếu tìm thấy một ước số
            }
            divisor++;
        }
        return true; // Là số nguyên tố nếu không tìm thấy ước số nào
    }
}
