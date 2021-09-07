package Practiceset2.com;

import java.util.Scanner;

public class Factorial_Methods {
    public static void main(String[] args) {
        // Write a program to print the factorial of a number by defining a method named 'Factorial'.

        Scanner in = new Scanner(System.in);
        System.out.println(" enter a number you want the factorial of :- ");
        int num = in.nextInt();

        factorial(num);
    }

    static void factorial(int n){

        if(n >= 0){
            int fact = 1;
            while(n != 0){
                fact = fact * n ;
                n-- ;
            }
            System.out.println("factorial = " + fact);
        }

        else{
            System.out.println(" you have entered a invalid number for factorial !!!..");
        }
    }
}
