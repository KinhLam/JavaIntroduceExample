/*Exercise 2: Logical Operators
        Specifications
        Write a Java program to enter four integer numbers and prints equal if all four are equal, and not equal
        otherwise.*/


package Assignment.ASM1.JPE_S_A201;

import java.util.Scanner;

public class Ex_2_LogicalOperators {
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

        if(number1 == number2 && number2 == number3 && number3 == number4){
            System.out.println("Numbers are a equals");
        }
        System.out.println("Numbers are not equal!");
    }
}
