package Assignment.ASM2.Lab_7.Part_7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();
        System.out.println("Enter Integer: ");
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }

        System.out.println(numbers);
    }
}
