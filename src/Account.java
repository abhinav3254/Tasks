import java.util.Date;

public class Account {
    private long accountNumber;
    private Date date;
    private double amount;

    public Account() {
    }

    public Account(long accountNumber, Date date, double amount) {
        this.accountNumber = accountNumber;
        this.date = date;
        this.amount = amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
