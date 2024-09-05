/*Exercise 10: Countdown Timer
        Write a program that simulates a countdown timer from a specified number of seconds to 0 using a
        while loop. Display each second on the console.*/

package Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_10_CountDownTimer {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thời gian (giây): ");
        int seconds = sc.nextInt();

        while (seconds > 0) {
            System.out.println("Thời gian còn lại: " + seconds);
            Thread.sleep(1000);
            seconds--;
        }
        System.out.println("Đếm ngược thành công.");
    }
}
