package Assignment.ASM2.Lab_7.Part_3;

import java.util.HashMap;
import java.util.Map;

public class Ex_7 {
    public static void main(String[] args) {
        HashMap<String, Integer> country = new HashMap<>();
        country.put("Việt Nam", 331002651);
        country.put("Pháp", 21234);
        country.put("Đức", 34325431);

        String largestCountry = null;
        int max = 0;

        for(Map.Entry<String, Integer> entry : country.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                largestCountry = entry.getKey();
            }
        }
        System.out.println("Country highest population: " + largestCountry + " " + max);
    }
}
