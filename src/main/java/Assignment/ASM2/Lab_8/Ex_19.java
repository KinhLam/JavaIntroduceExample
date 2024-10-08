package Assignment.ASM2.Lab_8;

import java.util.regex.Pattern;

class InvalidEmailException_Ex19 extends Exception {
    public InvalidEmailException_Ex19(String message) {
        super(message);
    }
}

class EmailValidator_Ex19{
    String EMAIL_PATTERN = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public void validateEmail(String email) throws InvalidEmailException_Ex19 {
        if (email == null || !Pattern.matches(EMAIL_PATTERN, email)) {
            throw new InvalidEmailException_Ex19("Invalid email format.");
        }
        System.out.println("Email is valid.");
    }
}
public class Ex_19 {
    public static void main(String[] args) {
        EmailValidator_Ex19 validator = new EmailValidator_Ex19();
        try {
            validator.validateEmail("lamduckinh2k2@gmail.com");  // Valid email
            validator.validateEmail("invalid-email");  // Will throw an exception
        } catch (InvalidEmailException_Ex19 e) {
            System.out.println(e.getMessage());
        }
    }
}
