package july17;

public class CurrentAccount extends Account {
	private double overDraftLimit;

	public CurrentAccount(long accountNumber, int date, double balance, double overDraftLimit) {
		super(accountNumber, date, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
}
