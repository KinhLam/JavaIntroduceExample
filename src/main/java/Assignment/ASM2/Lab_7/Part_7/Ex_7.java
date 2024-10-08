package Assignment.ASM2.Lab_7.Part_7;

import java.util.TreeSet;

public class Ex_7 {
    public static void main(String[] args) {
        TreeSet<Double> numbers = new TreeSet<>();
        numbers.add(10.1);
        numbers.add(12.5);
        numbers.add(16.8);

        double sum = 0;
        for(Double num : numbers)
            sum += num;

        System.out.println("Sum: " + sum);
    }
}
