import java.util.Date;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(long accountNumber, Date date, double amount, double interestRate) {
        super(accountNumber, date, amount);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
