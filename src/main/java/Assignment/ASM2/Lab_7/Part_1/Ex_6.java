package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        set.add("Táo");
        set.add("Chuối");
        set.add("Ổi");

        System.out.println("Current: " + set);
        System.out.println("Enter string remove: ");
        String str = sc.nextLine();

        if(set.remove(str)){
            System.out.println("String remove. " + set);
        }else{
            System.out.println("String not found");
        }
    }
}
