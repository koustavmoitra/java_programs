// program to print factorial of a number

import java.util.Scanner;

public class Factorial {
    public static void main(String [] ags){

        // { factorial = factorial * i }

        Scanner input = new Scanner(System.in);
        int factorial =1;
        System.out.println("enter th number you want factorial...");
        int num = input.nextInt();
        for ( int i=1 ; i<=num ; i++)
        {
            factorial = factorial*i;
        }
        System.out.println(" factorial of number "+ num + " = " + factorial);


    }
}
