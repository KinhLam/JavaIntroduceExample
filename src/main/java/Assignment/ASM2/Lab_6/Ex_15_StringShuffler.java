package Assignment.ASM2.Lab_6;

import java.util.Random;

public class Ex_15_StringShuffler {
    public String shuffleString(String text) {
        StringBuilder sb = new StringBuilder(text);
        Random random = new Random();
        for (int i = 0; i < sb.length(); i++) {
            int j = random.nextInt(sb.length());
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ex_15_StringShuffler sh = new Ex_15_StringShuffler();
        System.out.println(sh.shuffleString("Hello World"));
    }
}
