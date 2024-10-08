package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<>();
        country.put("VietNam", "HaNoi");
        country.put("Japan", "Tokyo");
        country.put("France", "Paris");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name country: ");
        String name = sc.nextLine();
        String capital = country.getOrDefault(name, "Country not found");
        System.out.println("Capital of " + name + " is " + capital);
    }
}
