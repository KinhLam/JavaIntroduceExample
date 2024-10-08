package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        HashMap<String, Integer> citys = new HashMap<>();
        citys.put("Hà Nội", 112342);
        citys.put("TP.Hồ Chí Minh", 212421);
        citys.put("Đà Nẵng", 124123);
        citys.put("Hải Phòng", 41231);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name city: ");
        String city = sc.nextLine();

        Integer population = citys.getOrDefault(city, -1);
        if(population == -1) {
            System.out.println("City not found");
        }else{
            System.out.println("Population: "+ city + " : " + population);
        }
    }
}
