package Practiceset2.com;

import java.util.Scanner;

public class Sum_of_n {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println(" enter the number upto which you want a sum of ");
        int num = in.nextInt();

        System.out.println("enter the numbers...");
        for(int i=0 ; i<num ; i++){
            int newNumber = in.nextInt();
            sum = sum + newNumber;
        }
        System.out.println("total sum of numbers = " + sum);
    }
}
