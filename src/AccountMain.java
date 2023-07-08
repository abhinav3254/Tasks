import java.util.Date;

public class AccountMain {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(123456789,new Date(12032023),44000,10000);
        SavingsAccount savingsAccount = new SavingsAccount(123456789,new Date(84032023),50000,5.6);
        System.out.println("****************Current Account*******************");
        System.out.println("current account number :- "+currentAccount.getAccountNumber());
        System.out.println("Account Opening Date :- "+currentAccount.getDate());
        System.out.println("Amount :- "+currentAccount.getAmount());
        System.out.println("over draft limit :- "+currentAccount.getOverDraftLimit());
        System.out.println("****************Savings Account*******************");
        System.out.println("saving account number :- "+savingsAccount.getAccountNumber());
        System.out.println("Account Opening Date :- "+savingsAccount.getDate());
        System.out.println("Amount :- "+savingsAccount.getAmount());
        System.out.println("interest rate :- "+savingsAccount.getInterestRate());

    }
}
