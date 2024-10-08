package Assignment.ASM2.Lab_8;

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient Funds");
        }
        balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
public class Ex_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 500.0);
        try{
            account.withdraw(100.0);
            System.out.println("Balance: " + account.getBalance());
            account.withdraw(200.0);
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
