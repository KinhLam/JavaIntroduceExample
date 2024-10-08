package Assignment.ASM2.Java_MA301;

import java.util.regex.Pattern;

public class Validator {
    public static boolean validateEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regex, email);
    }

    public static boolean validateDate(String birthDate){
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        return Pattern.matches(regex, birthDate);
    }

    public static boolean validateTheoryPractice(double value){
        return value >= 0 && value <= 10;
    }
}
