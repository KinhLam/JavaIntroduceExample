package Assignment.ASM2.Lab_7.Part_7;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> words = new TreeSet<>();
        System.out.println("Enter word: ");
        while(true){
            String word = sc.nextLine();
            if(word.equals("exit")){
                break;
            }
            words.add(word);
        }
        System.out.println("Word in reverse: " + words.descendingSet());
    }
}
