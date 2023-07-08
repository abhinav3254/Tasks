import java.util.Scanner;

public class ElectricityBills {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CMR {current month reading}");
        double cmr = sc.nextDouble();
        System.out.println("Enter PMR {previous month reading}");
        double pmr = sc.nextDouble();
        System.out.println("enter number for :- \n1. commercial \n2. Domestic \n3. Industrial ");
        int choice = sc.nextInt();
        double unit = cmr - pmr;
        if (choice == 1) {
            System.out.println(calCommercial(unit));
        } else if (choice == 2) {
            System.out.println(calDomestic(unit));
        } else if (choice == 3) {
            System.out.println(calIndustrial(unit));
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static double calCommercial (double unit) {
        double cost = 0;
        if (unit <= 100) {
            cost = unit*2;
        } else
        if (unit > 100 && unit <= 200) {
            cost = 100*2;
            cost = cost + (unit-100)*4;
        } else
        if (unit > 200) {
            cost = 100*2;
            cost = cost + 100*4;
            cost = cost + (unit-200)*6;
        }
        return cost;
    }

    public static double calDomestic (double unit) {
        double cost = 0;
        if (unit <= 100) {
            cost = unit*1;
        } else
        if (unit > 100 && unit <= 200) {
            cost = 100*1;
            cost = cost + (unit-100)*2;
        } else
        if (unit > 200) {
            cost = 100*1;
            cost = cost + 100*2;
            cost = cost + (unit-200)*3;
        }
        return cost;
    }

    public static double calIndustrial (double unit) {
        double cost = 0;
        if (unit <= 100) {
            cost = unit*3;
        } else
        if (unit > 100 && unit <= 200) {
            cost = 100*3;
            cost = cost + (unit-100)*6;
        } else
        if (unit > 200) {
            cost = 100*3;
            cost = cost + 100*6;
            cost = cost + (unit-200)*9;
        }
        return cost;
    }
}