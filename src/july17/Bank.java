package july17;

import org.hamcrest.core.IsInstanceOf;

public class Bank {
	private String bankName;
	private String branchName;
	private Account[] accounts;
	int ptr = 0;
	public Bank(String bankName, String branchName, Account[] accounts) {
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		this.accounts = accounts;
	}
	public String getBankName() {
		return bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public Account[] getAccount() {
		return accounts;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public void setAccount(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount (Account account) {
		if (ptr<accounts.length) {
			accounts[ptr] = account;
			ptr = ptr + 1;
			System.out.println("Account Added");
		} else System.out.println("Not Added");
	}
	
	public void showAccounts () {
		
		for (int i = 0; i < ptr; i++) {
			if (accounts[i] instanceof SavingsAccount) {
				System.out.println();
				System.out.println();
				System.out.println(i+"*****Savings Account****"+i);
				System.out.println();
				System.out.println();
				System.out.println("Account Number :- "+accounts[i].getAccountNumber());
				System.out.println(" Balance Number :- "+accounts[i].getBalance());
				System.out.println(" Date :- "+accounts[i].getDate());
				SavingsAccount savingsAccount = (SavingsAccount) accounts[i];
				System.out.println(savingsAccount.getMinDepositAmount());
				System.out.println(savingsAccount.getNoOfTransactionsPerDay());
				
			} else if (accounts[i] instanceof CurrentAccount) {
				System.out.println();
				System.out.println();
				System.out.println(i+"****Current Account****"+i);
				System.out.println();
				System.out.println();
				System.out.println(""+accounts[i].getAccountNumber());
				System.out.println(""+accounts[i].getBalance());
				System.out.println(""+accounts[i].getDate());
				CurrentAccount currentAccount = (CurrentAccount) accounts[i];
				System.out.println(currentAccount.getOverDraftLimit());
				
			}
		}
	}
	
	public boolean transaction (char type,long accountNumber,double amount,Account account) {
		for (int i = 0;i<ptr;i++) {
			account = accounts[i];
			if (accounts[i].getAccountNumber() == accountNumber && account instanceof SavingsAccount) {
				if (type == 'w') {
					// withdraw
					double c = accounts[i].getBalance()-amount;
					if ((c*-1) <= ((SavingsAccount) account).getMinDepositAmount()) {
						accounts[i].setBalance(accounts[i].getBalance()-amount);
						System.out.println("After Withdraw The rem Balance is :- "+accounts[i].getBalance());
						return true;
					}
				} else if (type == 'd') {
					// deposit
					accounts[i].setBalance(amount+accounts[i].getBalance());
					System.out.println(accounts[i].getBalance()+" After Deposit");
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
}
