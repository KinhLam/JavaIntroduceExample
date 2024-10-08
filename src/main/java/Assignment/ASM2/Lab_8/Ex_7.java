package Assignment.ASM2.Lab_8;

import java.util.Scanner;

class InputValidationException extends Exception{
    public InputValidationException(String m){
        super(m);
    }
}

class InputReader{
    public void readInput() throws InputValidationException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number greater than 10:");
        try{
            int input = sc.nextInt();
            if(input <= 10){
                throw new InputValidationException("Number greater than 10");
            }else{
                System.out.println("Valid input: " + input);
            }
        }catch (InputValidationException e){
            throw new InputValidationException("Invalid input. Please enter a valid number.");
        }
    }
}
public class Ex_7 {
    public static void main(String[] args) {
        InputReader in  = new InputReader();
        try{
            in.readInput();
        }catch (InputValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
