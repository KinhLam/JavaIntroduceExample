package Assignment.ASM2.Lab_7.Part_9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Ex_6 {
    public static void main(String[] args) {
        List<Date> dates = Arrays.asList(
                new Date(2024, 10, 1),
                new Date(2023, 5, 10),
                new Date(2024, 3, 15)
        );
        dates.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + dates);
    }
}
