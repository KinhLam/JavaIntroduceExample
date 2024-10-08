package Assignment.ASM2.Lab_6;

import java.util.Random;

public class Ex_9_SentenceGenerator {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String generateRandomSentence(int length){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            sb.append(ALPHABET.charAt(rand.nextInt(ALPHABET.length())));
            if(i != length -1){
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ex_9_SentenceGenerator gen = new Ex_9_SentenceGenerator();
        System.out.println(gen.generateRandomSentence(5));
    }
}
