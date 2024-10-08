package Assignment.ASM2.Lab_7.Part_1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> num = new LinkedHashSet<>();

        System.out.println("Enter the number: ");
        while (sc.hasNextInt()) {
            num.add(sc.nextInt());
        }

        System.out.println(num);
    }
}
