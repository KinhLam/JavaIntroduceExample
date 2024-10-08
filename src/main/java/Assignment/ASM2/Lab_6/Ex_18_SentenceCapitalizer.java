package Assignment.ASM2.Lab_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_18_SentenceCapitalizer {
    public String capitalizeSentences(String text) {
        StringBuilder capitalizedText = new StringBuilder(text.length());
        Pattern pattern = Pattern.compile("[^.!?\\s][^.!?]*[.!?]"); // Regex to identify sentences
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String sentence = matcher.group();
            String capitalized = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
            capitalizedText.append(capitalized).append(" ");
        }
        return capitalizedText.toString().trim();
    }
    public static void main(String[] args) {
        Ex_18_SentenceCapitalizer capitalizer = new Ex_18_SentenceCapitalizer();
        System.out.println(capitalizer.capitalizeSentences("java is fun. and hard."));
    }
}
