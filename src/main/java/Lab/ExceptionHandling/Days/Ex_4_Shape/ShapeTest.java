package Lab.ExceptionHandling.Days.Ex_4_Shape;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        double length, width, radius, height;

        try {
            do {
                System.out.println("Enter an option: ");
                System.out.println("1. Rectangle");
                System.out.println("2. Circle");
                System.out.println("0. Exit");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("*** Rectangle Test");
                        break;
                    case 2:
                        System.out.println("*** Circle Test");
                        break;
                    case 0:
                        System.out.println("*** Exit Test");
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } while (option != 0);
        } catch (InputMismatchException e) {
            System.out.println("!!! Error: input is not a double");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
