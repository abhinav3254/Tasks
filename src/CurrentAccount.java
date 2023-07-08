import java.util.Date;

public class CurrentAccount extends Account {
    private double overDraftLimit;

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public CurrentAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public CurrentAccount(long accountNumber, Date date, double amount, double overDraftLimit) {
        super(accountNumber, date, amount);
        this.overDraftLimit = overDraftLimit;
    }


    public double getOverDraftLimit() {
        return overDraftLimit;
    }
}
