/*
Exercise 8: Password Validation
Write a program that prompts the user to enter a password and validates it based on certain criteria
        (e.g., minimum length, presence of special characters) using a do...while loop.
*/


package Lecture.Buoi_3.Lab_2_Loop;

import java.util.Scanner;

public class Ex_8_PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password;
        do {
            System.out.println("Enter password: ");
            password = sc.nextLine();
        } while (!isValidPassword(password));
        System.out.println("Mật khẩu đã được đặt thành công");
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Mật khẩu phải đủ 8 kí tự trở lên");
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (isSpecialChar(c)) {
                hasSpecialChar = true;
            }
        }

        if (!hasUpperCase) {
            System.out.println("Mật khẩu phải chứa ít nhất một chữ cái viết hoa.");
            return false;
        }

        if (!hasLowerCase) {
            System.out.println("Mật khẩu phải chứa ít nhất một chữ cái viết thường");
            return false;
        }

        if (!hasDigit) {
            System.out.println("Mật khẩu phải chứa ít nhất một chữ số.");
            return false;
        }

        if (!hasSpecialChar) {
            System.out.println("Mật khẩu phải chứa ít nhất một ký tự đặc biệt.");
            return false;
        }

        return true;
    }

    private static boolean isSpecialChar(char c) {
        return "!@#$%^&*()-_+=<>?/".indexOf(c) >= 0;
    }
}
