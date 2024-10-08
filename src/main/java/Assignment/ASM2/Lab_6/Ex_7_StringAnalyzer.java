package Assignment.ASM2.Lab_6;

import java.util.Arrays;

public class Ex_7_StringAnalyzer {
    public int countOccurrences(String text, String pattern){
        return text.split(pattern, -1).length -1;
    }

    public String findLongestWord(String sentence){
        String[] words = sentence.split(" ");
        return Arrays.stream(words).max((a, b) -> Integer.compare(a.length(), b.length())).orElse("");
    }

    public String capitalizeFirstLetter(String text){
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase()).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Ex_7_StringAnalyzer ex = new Ex_7_StringAnalyzer();
        String text = "Hello world";
        System.out.println(ex.countOccurrences(text, "o"));
        System.out.println(ex.findLongestWord(text));
        System.out.println(ex.capitalizeFirstLetter(text));
    }
}
