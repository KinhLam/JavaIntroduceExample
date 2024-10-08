package Assignment.ASM2.Lab_6;

import java.util.Arrays;

public class Ex_20_AnagramChecker {
    public boolean isAnagram(String word1, String word2) {
        char[] arr1 = word1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = word2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Ex_20_AnagramChecker checker = new Ex_20_AnagramChecker();
        System.out.println(checker.isAnagram("listen", "silent")); // true
        System.out.println(checker.isAnagram("java", "avaj")); // true
    }
}
