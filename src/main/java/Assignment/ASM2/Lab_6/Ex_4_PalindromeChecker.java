package Assignment.ASM2.Lab_6;

public class Ex_4_PalindromeChecker {
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        return word.equalsIgnoreCase(sb.toString());
    }

    public static void main(String[] args) {
        Ex_4_PalindromeChecker checker = new Ex_4_PalindromeChecker();
        System.out.println(checker.isPalindrome("Hello World"));
    }
}
