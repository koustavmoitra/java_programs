package Practiceset2.com;

import java.util.Scanner;

public class Prime_Method {
    public static void main(String[] args) {
        // Define a method to find out if number is prime or not.

        Scanner in = new Scanner(System.in);
        System.out.println(" enter your number :- ");
        int num = in.nextInt();

        Prime(num);

    }
    static void Prime(int n){
        int i;
        for( i=2 ; i<n ; i++){
            if( n % i == 0 )
            {
                break;
            }
        }
        if ( i == n){
            System.out.println("it is prime...");
        }
        else{
            System.out.println("not prime...");
        }
    }


}
