package july17;

public class Account {
	private long accountNumber;
	private int date;
	private double balance;
	
	public Account(long accountNumber, int date, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.date = date;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public int getDate() {
		return date;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
