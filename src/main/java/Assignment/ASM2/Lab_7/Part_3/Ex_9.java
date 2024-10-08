package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;

public class Ex_9 {
    public static void main(String[] args) {
        HashMap<String, Double> city = new HashMap<>();
        city.put("HaNoi", 17.9);
        city.put("DaNang", 17.9);
        city.put("TP.HCM", 19.9);

        double total = 0;
        for(double temp : city.values()) {
            total += temp;
        }

        double average = total / city.size();
        System.out.println("Average is " + average);
    }
}
