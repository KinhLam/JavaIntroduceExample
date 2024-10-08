package Practice.Practice_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static String listingAll(Integer inputNumber) {
        if (inputNumber < 2) {
            return "[]"; // Không có số nguyên tố nếu inputNumber < 2
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= inputNumber; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes.toString();
    }

    // Phương thức kiểm tra số nguyên tố
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Phương thức main để nhận input từ người dùng và kiểm tra kết quả
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        Integer inputNumber = scanner.nextInt();

        String result = listingAll(inputNumber);
        System.out.println("Các số nguyên tố nhỏ hơn hoặc bằng " + inputNumber + " là: " + result);

        scanner.close(); // Đóng Scanner sau khi sử dụng
    }

}
