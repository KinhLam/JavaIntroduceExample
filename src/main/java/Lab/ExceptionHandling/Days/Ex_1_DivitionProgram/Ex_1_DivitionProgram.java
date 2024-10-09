package Lab.ExceptionHandling.Days.Ex_1_DivitionProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_1_DivitionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        }catch (InputMismatchException ex){
            System.out.println("!!! Error: input is not an interger");
        }catch (ArithmeticException ex){
            System.out.println("!!! Error: divide by zero");
        }
    }
}
