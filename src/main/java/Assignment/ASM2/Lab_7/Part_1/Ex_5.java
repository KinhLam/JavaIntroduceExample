package Assignment.ASM2.Lab_7.Part_1;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        while(true){
            String names = sc.nextLine();
            if(names.equalsIgnoreCase("e")){
                break;
            }
            name.add(names);
        }
        sc.close();
        System.out.println("Number of names: " + name.size());
    }
}
