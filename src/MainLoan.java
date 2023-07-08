public class MainLoan {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan(5.6,25000,4,500000,6,900000);
        VehicleLoan vehicleLoan = new VehicleLoan(9.6,5000,6,4000000,4,6000000);

        System.out.println("**********HOME LOAN*************************");
        System.out.println("Home Loan Interest is :- "+homeLoan.getInterestRate());
        System.out.println("Home Loan EMI is :- "+homeLoan.getEmi());
        System.out.println("Home Loan Time is :- "+homeLoan.getTime());
        System.out.println("Home Loan AMOUNT is :- "+homeLoan.getAmount());
        System.out.println("Home SIZE is :- "+homeLoan.getSize());
        System.out.println("Home Value is :- "+homeLoan.getValue());

        System.out.println("**********VEHICLE LOAN*************************");
        System.out.println("vehicle loan interest rate is:- "+vehicleLoan.getInterestRate());
        System.out.println("vehicle loan emi is:- "+vehicleLoan.getEmi());
        System.out.println("vehicle loan time rate is:- "+vehicleLoan.getTime());
        System.out.println("vehicle loan amount rate is:- "+vehicleLoan.getAmount());
        System.out.println("vehicle type is:- "+vehicleLoan.getType()+" wheeler");
        System.out.println("vehicle loan price is:- "+vehicleLoan.getPrice());
    }
}
