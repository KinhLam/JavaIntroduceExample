package Lecture.Buoi_2.Lab;

public class PalindromeChecker {
    public static void main(String[] args) {
        String[] palindromes = {"racecar", "dad", "mom", "hello"};

        for(String word : palindromes){
            if(isPalindrome(word)){
                System.out.println("\"" + word + "\" is a palindrome");
            }else{
                System.out.println("\"" + word + "\" is not a palindrome");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();

        for(int i = 0; i < length/2; i++) {
            if(str.charAt(i) != str.charAt(length-i-1)) {
                return false;
            }
        }
        return true;
    }
}
