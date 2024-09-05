package Assignment.ASM1.JPE_S_A101;

import java.util.Scanner;

public class Ex_6_RectangleExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double height = sc.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double width = sc.nextDouble();

        //Chu vi
        double perimeter = 2 * (height + width );

        //Diện tích
        double area = height * width;

        System.out.println("Diện tích: " + area);
        System.out.println("Chu vi: " + perimeter);
    }
}
