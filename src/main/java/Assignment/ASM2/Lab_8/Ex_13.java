package Assignment.ASM2.Lab_8;
class InvalidCredentialsException_Ex13 extends Exception {
    public InvalidCredentialsException_Ex13(String message) {
        super(message);
    }
}

class UserValidator {
    public void validateUser(String username, String password) throws InvalidCredentialsException_Ex13 {
        if(username == null || username.equals("") || password == null || password.equals("")){
            throw new InvalidCredentialsException_Ex13("Username or password is empty");
        }
        if(username.length() < 5){
            throw new InvalidCredentialsException_Ex13("Username must be at least 5 characters");
        }
        if(password.length() < 5){
            throw new InvalidCredentialsException_Ex13("Password must be at least 5 characters");
        }
        System.out.println("User valid successfully");
    }
}
public class Ex_13 {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        try{
            validator.validateUser("joiin", "password124");
            validator.validateUser("jo", "pass");
        }catch (InvalidCredentialsException_Ex13 e){
            System.out.println(e.getMessage());
        }
    }
}
