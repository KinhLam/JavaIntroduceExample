package Lab.JDBC.Days.Extra1_BankAccount;

public abstract class BankAccount {
    int id;
    String type;
    double balance;

    public BankAccount() {}
    public BankAccount(int id, String type, double balance) {
        this.id = id;
        this.type = type;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
