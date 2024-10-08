package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 8, 3, 14);
        numbers.sort(Comparator.comparingInt((Integer num) -> num % 2).thenComparingInt(Integer::intValue));
        System.out.println("Sorted list: " + numbers);
    }
}
