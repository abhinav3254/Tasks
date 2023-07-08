public class HomeLoan extends Loan {
    private double size;
    private double value;

    public HomeLoan(double size, double value) {
        this.size = size;
        this.value = value;
    }

    public HomeLoan(double interestRate, double emi, double time, double amount, double size, double value) {
        super(interestRate, emi, time, amount);
        this.size = size;
        this.value = value;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HomeLoan{" +
                "size=" + size +
                ", value=" + value +
                '}';
    }
}
