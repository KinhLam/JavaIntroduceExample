package Assignment.ASM2.Lab_6;

import java.util.HashMap;
import java.util.Map;

public class Ex_13_WordFrequencyCounter {
    public Map<String, Integer> countWordFrequencies(String text){
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");

        for(String word : words){
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        Ex_13_WordFrequencyCounter counter = new Ex_13_WordFrequencyCounter();
        String text = "Java Beginner. Java is hard";
        System.out.println(counter.countWordFrequencies(text));
    }
}
