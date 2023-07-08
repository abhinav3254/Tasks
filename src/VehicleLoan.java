public class VehicleLoan extends Loan {
    private int type;
    private double price;

    public VehicleLoan(int type, double price) {
        this.type = type;
        this.price = price;
    }

    public VehicleLoan(double interestRate, double emi, double time, double amount, int type, double price) {
        super(interestRate, emi, time, amount);
        this.type = type;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "VehicleLoan{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
