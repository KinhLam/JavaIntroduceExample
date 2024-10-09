package Lab.ExceptionHandling.Days.Ex_2_SumCaculator;

import java.util.Scanner;

public class Ex_2_SumCaculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        try {
            System.out.println("Enter a list of numbers (separated by spaces): ");
            String input = sc.nextLine();
            String[] numbers = input.split(" ");

            for(String number : numbers) {
                int n = Integer.parseInt(number);
                sum += n;
            }

            System.out.println("Sum: " + sum);
        }catch (NumberFormatException e) {
            System.out.println("Number Format Error: " + e.getMessage());
        }
    }
}
