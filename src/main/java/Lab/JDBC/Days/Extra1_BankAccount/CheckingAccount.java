package Lab.JDBC.Days.Extra1_BankAccount;

public class CheckingAccount extends BankAccount {
    double overdraftLimit;

    public CheckingAccount(){};

    public CheckingAccount(int id, String type, double balance, double overdraftLimit) {
        super(id, type, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Số tiền nạp: " + amount);
        System.out.println("Số dư mới: " + balance);
    }

    public void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Số tiền rút là: " + amount);
            System.out.println("Số dư mới: " + balance);
        }else{
            System.out.println("Số dư không đủ để rút.");
        }
    }

}
