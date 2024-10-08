package Assignment.ASM2.Lab_8;

class UserRegistrationException extends Exception {
    public UserRegistrationException(String message) {
        super(message);
    }
}

class UserRegistration {
    public void registerUser(String username, String password) throws UserRegistrationException {
        if (username == null || username.length() < 5) {
            throw new UserRegistrationException("Username must be at least 5 characters long.");
        }
        if (password == null || password.length() < 8) {
            throw new UserRegistrationException("Password must be at least 8 characters long.");
        }
        System.out.println("User registered successfully: " + username);
    }
}

public class Ex_28 {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        try {
            registration.registerUser("useras", "123123123");  // Invalid username and password
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
