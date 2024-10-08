package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<>();
        country.put("USA", "English");
        country.put("VietNam", "Vietnamese");
        country.put("Japan", "Japanese");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country: ");
        String countryName = sc.nextLine();

        String language = country.getOrDefault(countryName, "Language not found");
        System.out.println("Language of " + countryName + ": " + language);
    }
}
