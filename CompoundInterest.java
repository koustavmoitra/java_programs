import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        // simple interest = Amount = principle * (1 + rate / 100) power time).
        // Here P is principal amount, R is the annual interest rate.
        // t is the time the money is invested or borrowed for.


        Scanner sc = new Scanner(System.in);
        double p = sc.nextFloat();
        double R = sc.nextFloat();
        double t = sc.nextFloat();


        double amount =  p * Math.pow(1 + (R / 100), t);
        double SI = amount - p;
        System.out.println("compound interest = " + SI);
        System.out.println("amount =" + amount);
    }
}

