public class Loan {
    private double interestRate;
    private double emi;
    private double time;
    private double amount;

    public Loan() {
    }

    public Loan(double interestRate, double emi, double time, double amount) {
        this.interestRate = interestRate;
        this.emi = emi;
        this.time = time;
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
