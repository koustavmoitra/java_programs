package Practiceset2.com;

import java.util.Scanner;

public class Sum_Product {

    // Write a program to print the sum of two numbers entered by user by defining your own method.
    // Define a method that returns the product of two numbers entered by user.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("sum of two numbers = " + sum(num1, num2));

        System.out.println("sum of two numbers = " +  product(num1,num2));
    }

    static int sum(int n1,int n2){

        return n1 + n2;
    }

    static int product(int n1,int n2){

        return n1* n2;
    }
}
