package Assignment.ASM2.Lab_8;
class InvalidArrayException_Ex15 extends Exception {
    public InvalidArrayException_Ex15(String message) {
        super(message);
    }
}

class ArrayCalculator {
    public int calculateSum(int[] numbers) throws InvalidArrayException_Ex15 {
        if (numbers == null || numbers.length == 0) {
            throw new InvalidArrayException_Ex15("Array is null or empty.");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class Ex_15 {
    public static void main(String[] args) {
        ArrayCalculator calculator = new ArrayCalculator();
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Sum: " + calculator.calculateSum(numbers));
            calculator.calculateSum(null);  // Will throw an exception
        } catch (InvalidArrayException_Ex15 e) {
            System.out.println(e.getMessage());
        }
    }
}
