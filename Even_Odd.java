package Practiceset2.com;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {

        // Define a program to find out whether a given number is even or odd.

        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");

        int num = in.nextInt();
        Even(num);
    }

    static void Even(int num){

        if ( num % 2 ==0){
            System.out.println(num + " is even....");
        }
        else {
            System.out.println(num + " is odd...");
        }
    }
}
