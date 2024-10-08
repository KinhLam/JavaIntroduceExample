package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> fruitsQuantity = new HashMap<>();
        fruitsQuantity.put("Apple", 10);
        fruitsQuantity.put("Banana", 20);
        fruitsQuantity.put("Orange", 30);

        System.out.println("Enter the name fruits to update quantity: ");
        String quantityUpdate = sc.nextLine();
        if(fruitsQuantity.containsKey(quantityUpdate)) {
            System.out.println("Enter new quantity: ");
            int newQuantity = sc.nextInt();
            fruitsQuantity.put(quantityUpdate, newQuantity);
        }else{
            System.out.println("Fruit not found");
        }

        System.out.println("Update Fruit");
        fruitsQuantity.forEach((name, quantity) -> System.out.println(name + " " + quantity));
    }
}
