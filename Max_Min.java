package Practiceset2.com;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {

        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers please :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        max(num1, num2, num3);
        min(num1, num2, num3);


    }

    static void max(int num1, int num2, int num3) {   // for checking the max number
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is bada....");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println(num2 + "is bada....");
        } else {
            System.out.println(num3 + "is bada....");
        }
    }

    static void min(int num1, int num2, int num3) {     // for checking the min element
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + "is chota....");
        } else if (num2 < num3 && num2 < num1) {
            System.out.println(num2 + "is chota....");
        } else {
            System.out.println(num3 + "is chota....");
        }


    }
}
