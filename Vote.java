package Practiceset2.com;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {

        // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

        Scanner in = new Scanner(System.in);
        System.out.println(" enter your age - ");
        int age = in.nextInt();
        voting(age);


    }
    static void voting(int age){
         if (age >= 18)
         {
             System.out.println("granted !! u can vote ..");
         }
         else
         {
             System.out.println(" error !! u can't vote ...u can vote after " + (18-age) + " years ");
         }


    }
}
