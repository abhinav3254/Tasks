package july17;

public class Main {
	public static void main(String[] args) {
		Account[] accounts = new Account[4];
		accounts[0] = new SavingsAccount(123456789, 12, 15000,1000,5);
		accounts[1] = new CurrentAccount(987654321, 10, 14000, 2);
		accounts[2] = new SavingsAccount(456789, 8, 9999,1000,5);
		accounts[3] = new CurrentAccount(987654, 6, 16666, 2);
		Bank bank = new Bank("SBI", "HITECH CITY", accounts);
		bank.addAccount(accounts[0]);
		bank.addAccount(accounts[1]);
		bank.addAccount(accounts[2]);
		bank.addAccount(accounts[3]);
		
		bank.showAccounts();
		System.out.println("Before transtion");
		System.out.println(bank.transaction('w', 123456789, 6000, accounts[0]));
		System.out.println("After transtion");
		bank.showAccounts();
	}
}
