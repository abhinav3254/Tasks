import java.util.Scanner;

public class IncomeTax {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");
        double income=sc.nextDouble();
        double tax=incomeTax(income*12);
        System.out.println("Income tax amount is "+tax);

    }
    static double incomeTax(double income)
    {
        double tax = 0;

        if (income<=250000) {
            tax = tax + 0;
        } else if (income > 250000 && income <= 500000) {
            income = income - 250000;
            tax = income * 0.10;
        } else if (income > 500000 && income <= 1000000) {
            income = income - 500000;
            tax = tax+(250000*0.10);
            tax = tax + (income*0.20);
        } else if (income > 1000000) {
            income = income - 1000000;
            tax = tax+(250000*0.10);
            tax = tax + (500000*0.20);
            tax = tax + (income*0.30);
        }

        return tax;

    }
}
