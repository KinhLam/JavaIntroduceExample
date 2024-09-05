/*
Write a Java program, called ArithmeticExercise1 to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
        b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
        43
        1
        19
        13
*/



        package Assignment.ASM1.JPE_S_A101;

public class Ex_1_ArithmeticExercise1 {
    public static void main(String[] args) {
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
        System.out.println("(55 + 9) % 9 = " + ((55+9) % 9));
        System.out.println("20 + -3 * 5 / 8 = " + (20 - 3 * 5 / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
    }
}
