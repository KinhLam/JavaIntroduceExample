package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape");
        words.sort(Comparator.comparingInt(Ex_10::countVowels));
        System.out.println("Sorted list: " + words);
    }

    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
