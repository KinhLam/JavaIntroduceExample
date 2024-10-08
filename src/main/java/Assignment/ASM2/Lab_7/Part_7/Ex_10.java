package Assignment.ASM2.Lab_7.Part_7;

import java.util.TreeSet;

public class Ex_10 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);
    }
}
