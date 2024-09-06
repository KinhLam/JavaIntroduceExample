/*Exercise 3: Arithmetic Operators
Specifications
Write a Java program to add FIVE integers and display their sum.*/


package Assignment.ASM1.JPE_S_A201;

import java.util.Scanner;

public class Ex_3_ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số thứ nhất: ");
        int number1 = sc.nextInt();
        System.out.println("Hãy nhập số thứ hai: ");
        int number2 = sc.nextInt();
        System.out.println("Hãy nhập số thứ ba: ");
        int number3 = sc.nextInt();
        System.out.println("Hãy nhập số thứ tư: ");
        int number4 = sc.nextInt();
        System.out.println("Hãy nhập số thứ năm: ");
        int number5 = sc.nextInt();

        System.out.println("The sum is: " + (number1 + number2 + number3 + number4 + number5));
    }
}
