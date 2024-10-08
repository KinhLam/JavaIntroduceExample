package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape");
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted list: " + words);
    }
}
