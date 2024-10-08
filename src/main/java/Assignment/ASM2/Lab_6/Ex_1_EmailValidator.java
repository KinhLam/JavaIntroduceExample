package Assignment.ASM2.Lab_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_1_EmailValidator {
    public boolean validateEmail(String email) {
        String emailCheck = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(emailCheck);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Ex_1_EmailValidator ex = new Ex_1_EmailValidator();
        System.out.println(ex.validateEmail("abc@gmail.com"));
    }
}
