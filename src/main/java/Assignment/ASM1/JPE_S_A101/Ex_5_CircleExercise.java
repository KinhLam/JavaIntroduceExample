package Assignment.ASM1.JPE_S_A101;

import java.util.Scanner;

public class Ex_5_CircleExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập bán kính của hình tròn từ người dùng
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Tính chu vi và diện tích của hình tròn
        double perimeter = 2 * Math.PI * radius; // Chu vi = 2 * π * r
        double area = Math.PI * radius * radius; // Diện tích = π * r^2

        // In kết quả
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
