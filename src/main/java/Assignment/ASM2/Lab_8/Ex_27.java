package Assignment.ASM2.Lab_8;
class TransactionException_Ex27 extends Exception {
    public TransactionException_Ex27(String message) {
        super(message);
    }
}

class TransactionManager{
    double MAX_TRANSACTION_LIMIT = 10000.0;

    public void performTransaction(double amount) throws TransactionException_Ex27 {
        if (amount > MAX_TRANSACTION_LIMIT) {
            throw new TransactionException_Ex27("Transaction limit exceeded");
        }
        if(amount < 0) {
            throw new TransactionException_Ex27("Negative amount");
        }
        System.out.println("Transaction of: " + amount + " is performed");
    }
}
public class Ex_27 {
    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();
        try {
            tm.performTransaction(15000);
        }catch(TransactionException_Ex27 e) {
            System.out.println(e.getMessage());
        }
    }
}
