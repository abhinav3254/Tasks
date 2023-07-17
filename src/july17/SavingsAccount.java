package july17;

public class SavingsAccount extends Account {
	private double minDepositAmount;
	private int noOfTransactionsPerDay;
	public SavingsAccount(long accountNumber, int date, double balance, double minDepositAmount,
			int noOfTransactionsPerDay) {
		super(accountNumber, date, balance);
		this.minDepositAmount = minDepositAmount;
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	public double getMinDepositAmount() {
		return minDepositAmount;
	}
	public int getNoOfTransactionsPerDay() {
		return noOfTransactionsPerDay;
	}
	public void setMinDepositAmount(double minDepositAmount) {
		this.minDepositAmount = minDepositAmount;
	}
	public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) {
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	
	
	public static void getDetails() {
		
	}
	
}
