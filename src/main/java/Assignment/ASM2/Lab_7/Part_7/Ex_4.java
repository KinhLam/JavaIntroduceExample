package Assignment.ASM2.Lab_7.Part_7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Smallest: " + numbers.first());
        System.out.println("Largest: " + numbers.last());
    }
}
