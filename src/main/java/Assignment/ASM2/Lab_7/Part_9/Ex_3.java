package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 12, -3, 8, -1);

        numbers.sort(Comparator.comparingInt(Math::abs));

        System.out.println("Sorted list: " + numbers);
    }
}
