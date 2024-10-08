package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.List;

public class Ex_4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "apple", "Orange", "grape");

        words.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("Sorted list: " + words);
    }
}
