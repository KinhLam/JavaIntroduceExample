/*
Exercise 1:
Create a class called EmailValidator with a method called validateEmail(String email) that checks if
an email address is valid. Implement the validation logic using regular expressions and String
operations. Test the EmailValidator class by creating an instance, calling the validateEmail method
        with different email addresses, and checking the validation results.
*/

package Buoi_6_StringandCollection.Lab.Ex_1;


public class Main {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();

        // Test with different email addresses
        String[] testEmails = {"example@test.com", "invalid-email@", "john.doe@domain.com", "test@domain", ""};

        // Check the validation results
        for (String email : testEmails) {
            System.out.println("Is the email \"" + email + "\" valid? " + validator.validEmail(email));
        }
    }
}
