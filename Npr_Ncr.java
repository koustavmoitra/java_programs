import java.util.Scanner;

public class Npr_Ncr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" PERMUTATION AND COMBINATION ");

//        formula--> permutations P(n,r)= n!/(n−r)!
//                n is the total number of things.
//                r = number of things that have to be selected and arranged
//        Arrangement matters

        System.out.println("Enter a number of things: ");
        double n = input.nextDouble();

        System.out.println("enter the number things you want to choose: ");
        double r = input.nextDouble();

        //num should be always >= r
        if (n >= r) {
            System.out.println(" OPERATION IS VALID ....SUCCESS");

        //calculating n!
        double f1 = 1;
        for (int i = 1; i <= n; i++) {
            f1 = f1 * i;
        }

        //calculating (n-r)!--> first  subtracting n-r and the i will calculate the factorial
        double num = n - r;
        double f2 = 1;
        for (int i = 1; i <= num; i++) {
            f2 = f2 * i;
        }

//        formula-->  C(n,r)=n!/(n−r)*r!
//                n = the total number of things.
//                r =  the number of things to be chosen out of n things.
//                Order does not matter

        //calculating r! for Combination operation
        double f3 = 1;
        for (int i = 1; i <= r; i++) {
            f3 = f3 * i;
        }
        System.out.println();
        System.out.println("calculation of permutation");
        double permutation = (f1 / f2);
        System.out.println("The permutation of the given input nPr is :" + permutation);
        System.out.println();

        System.out.println("calculation of combination");
        double combination = permutation / f3; // OR (f1/f2)/f3
        System.out.println("The combination of the input nCr is :" + combination);
    }

         else
        {
            System.out.println("SORRY .... INVALID !!!..");
        }
    }

}


