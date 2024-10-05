package Lab.JDBC.Days.Extra1_BankAccount;

public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int id, String type, double balance, double interestRate) {
        super(id, type, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
