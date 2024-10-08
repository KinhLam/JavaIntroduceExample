package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");

        strings.sort(Comparator.naturalOrder());

        System.out.println("Sorted list: " + strings);
    }
}
