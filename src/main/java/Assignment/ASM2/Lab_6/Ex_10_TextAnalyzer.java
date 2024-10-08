package Assignment.ASM2.Lab_6;

import java.util.HashSet;
import java.util.Set;

public class Ex_10_TextAnalyzer {
    public String removeDuplicates(String text){
        Set<Character> set = new HashSet();
        StringBuilder sb = new StringBuilder();
        for(char c : text.toCharArray()){
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }

    public int countVowels(String text) {
        return (int) text.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    public String replaceSubstring(String text, String substring, String replacement) {
        return text.replace(substring, replacement);
    }

    public static void main(String[] args) {
        Ex_10_TextAnalyzer ex = new Ex_10_TextAnalyzer();
        String text = "hello world";
        System.out.println(ex.removeDuplicates(text));
        System.out.println(ex.countVowels(text));
        System.out.println(ex.replaceSubstring(text, "world", "Java"));
    }
}
