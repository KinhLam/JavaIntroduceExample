package Assignment.ASM2.Lab_8;
class InvalidPaymentException_Ex16 extends Exception {
    public InvalidPaymentException_Ex16(String message) {
        super(message);
    }
}

class PaymentProcessor {
    double MAX_PAYMENT_LIMIT = 10000.00;
    public void processPayment(double amount) throws InvalidPaymentException_Ex16 {
        if (amount < 0) {
            throw new InvalidPaymentException_Ex16("Payment amount cannot be negative.");
        }
        if (amount > MAX_PAYMENT_LIMIT) {
            throw new InvalidPaymentException_Ex16("Payment exceeds the allowed limit.");
        }
        System.out.println("Payment processed: " + amount);
    }
}
public class Ex_16 {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        try {
            processor.processPayment(5000);  // Valid amount
            processor.processPayment(-100);  // Will throw an exception
        } catch (InvalidPaymentException_Ex16 e) {
            System.out.println(e.getMessage());
        }
    }
}
